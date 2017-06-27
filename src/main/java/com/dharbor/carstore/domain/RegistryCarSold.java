package com.dharbor.carstore.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Martin on 27/6/17.
 */

@Document
public class RegistryCarSold {
    @Id
    private String id;

    @DBRef
    private Seller seller;

    @DBRef
    private Car car;

    @DBRef
    private Client client;

    private Date sold_date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getSold_date() {
        return sold_date;
    }

    public void setSold_date(Date sold_date) {
        this.sold_date = sold_date;
    }
}
