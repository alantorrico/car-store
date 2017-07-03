package com.dharbor.carstore.service;

import com.dharbor.carstore.domain.Car;
import com.dharbor.carstore.domain.Client;
import com.dharbor.carstore.domain.RegistryCarSold;
import com.dharbor.carstore.domain.Seller;
import com.dharbor.carstore.repository.CarRepository;
import com.dharbor.carstore.repository.ClientRepository;
import com.dharbor.carstore.repository.RegistryCarSoldRepository;
import com.dharbor.carstore.repository.SellerRepository;
import com.dharbor.carstore.web.RegistryCarSoldController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Martin on 30/6/17.
 */
@Service
public class RegistryCarSoldService {
    @Autowired
    private RegistryCarSoldRepository carSoldRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ClientRepository clientRepository;

    public List<RegistryCarSold> getAll(){
        return carSoldRepository.findAll();
    }

    public void addRegistryCarSold(RegistryCarSoldController.RegistryCarRequestDTO registryDTO){

        RegistryCarSold carSold = new RegistryCarSold();

        Car car = carRepository.findOne(registryDTO.getCarID());
        Seller seller = sellerRepository.findOne(registryDTO.getSellerID());
        Client client = clientRepository.findOne(registryDTO.getClientID());

        carSold.setCar(car);
        carSold.setSeller(seller);
        carSold.setClient(client);
        carSold.setSold_date(LocalDate.now());

        carSoldRepository.save(carSold);
    }
}
