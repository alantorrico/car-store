package com.dharbor.carstore.web;

import com.dharbor.carstore.domain.Seller;
import com.dharbor.carstore.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Martin on 27/6/17.
 */
@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping(method = RequestMethod.POST)
    public void addSeller(@RequestBody SellerRequestDTO seller){
        sellerService.addSeller(seller);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Seller> getAll(){
        return sellerService.getAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Seller updateSeller(@PathVariable String id, @RequestBody SellerRequestDTO seller){
        return sellerService.updateSeller(id, seller);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Seller deleteSeller(@PathVariable String id){
        return sellerService.deleteSeller(id);
    }

    public static class SellerRequestDTO{
        private String name;
        private  int age;
        private int ci;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getCi() {
            return ci;
        }

        public void setCi(int ci) {
            this.ci = ci;
        }
    }
}
