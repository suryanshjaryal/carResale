package com.example.Try.controller;

import com.example.Try.service.Service;
import com.example.Try.model.CarResale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller

public class Controller {

    @Autowired
    Service service;

@RequestMapping(value = "/api/cars",method = RequestMethod.POST)
public String create(@ModelAttribute("carResale") CarResale carResale)
{
service.saveData(carResale);
return "index";
}

}
