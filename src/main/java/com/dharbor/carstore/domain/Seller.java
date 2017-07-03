package com.dharbor.carstore.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Martin on 26/6/17.
 */
@Document
public class Seller {
    @Id
    private String id;
    private String name;
    private  int age;
    private int ci;
    private int num_cars_sold;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getNum_cars_sold() {
        return num_cars_sold;
    }

    public void setNum_cars_sold(int num_cars_sold) {
        this.num_cars_sold = num_cars_sold;
    }
}
