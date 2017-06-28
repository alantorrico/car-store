package com.dharbor.carstore.service;

import com.dharbor.carstore.domain.Seller;
import com.dharbor.carstore.repository.SellerRepository;
import com.dharbor.carstore.web.SellerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Martin on 27/6/17.
 */
@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public void addSeller(SellerController.SellerRequestDTO seller){
        Seller newSeller = new Seller();
        newSeller.setName(seller.getName());
        newSeller.setAge(seller.getAge());
        newSeller.setCi(seller.getCi());

        sellerRepository.save(newSeller);
    }

    public List<Seller> getAll(){
        return sellerRepository.findAll();
    }

    public Seller deleteSeller(String id){
        Seller seller = sellerRepository.findOne(id);
        sellerRepository.delete(seller);
        return seller;
    }

    public Seller updateSeller(String id, SellerController.SellerRequestDTO sellerOld){
        Seller seller = sellerRepository.findOne(id);

        seller.setCi(sellerOld.getCi());
        seller.setName(sellerOld.getName());
        seller.setAge(sellerOld.getAge());

        return sellerRepository.save(seller);
    }
}
