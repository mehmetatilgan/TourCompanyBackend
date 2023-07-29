package com.TourCompany.Backend.dataAccess.abstracts;

import com.TourCompany.Backend.entities.concretes.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TouristDao extends JpaRepository<Tourist,Integer> {
}

