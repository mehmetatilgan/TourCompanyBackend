package com.TourCompany.Backend.api.controllers;

import com.TourCompany.Backend.business.abstracts.TouristService;
import com.TourCompany.Backend.entities.concretes.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tourists")
@Repository
public class TouristsController {


    private TouristService touristService;
    @Autowired
    public TouristsController(TouristService touristService) {
        super();
        this.touristService = touristService;
    }

    @GetMapping("/getall")
    public List<Tourist> getAll(){
        return this.touristService.getAll();
    }
}
