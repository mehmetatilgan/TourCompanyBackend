package com.TourCompany.Backend.business.abstracts;
import com.TourCompany.Backend.entities.concretes.Tourist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TouristService {
    List<Tourist> getAll();
}
