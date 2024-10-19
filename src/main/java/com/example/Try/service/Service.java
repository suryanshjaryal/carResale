package com.example.Try.service;


import com.example.Try.repository.Repository;
import com.example.Try.model.CarResale;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
@Autowired
    Repository repository;

public void saveData(CarResale carResale){
    repository.save(carResale);
}

}
