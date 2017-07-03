package com.dharbor.carstore.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Martin on 2/7/17.
 */
@RestController
@RequestMapping("/registries")
public class RegistryCarSoldController {
    public static class RegistryCarRequestDTO{
        private String sellerID;
        private String carID;
        private String clientID;

        public String getSellerID() {
            return sellerID;
        }

        public void setSellerID(String sellerID) {
            this.sellerID = sellerID;
        }

        public String getCarID() {
            return carID;
        }

        public void setCarID(String carID) {
            this.carID = carID;
        }

        public String getClientID() {
            return clientID;
        }

        public void setClientID(String clientID) {
            this.clientID = clientID;
        }
    }
}
