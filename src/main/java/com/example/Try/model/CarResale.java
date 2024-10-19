package com.example.Try.model;

import jakarta.persistence.*;


@Entity
@Table(name = "CarResale")
public class CarResale {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
    private  int id;
    @Column(name = "make")
    private String make;
    @Column(name = "model")
    private String model;
    @Column(name = "kmRun")
    private String kmRun;
    @Column(name = "price")
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getKmRun() {
        return kmRun;
    }

    public void setKmRun(String kmRun) {
        this.kmRun = kmRun;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
