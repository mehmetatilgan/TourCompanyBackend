package com.TourCompany.Backend.business.concretes;

import com.TourCompany.Backend.business.abstracts.TouristService;
import com.TourCompany.Backend.dataAccess.abstracts.TouristDao;
import com.TourCompany.Backend.entities.concretes.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TouristManager implements TouristService {


    private TouristDao touristDao;
    @Autowired
    public TouristManager(TouristDao touristDao) {
        super();
        this.touristDao = touristDao;
    }

    @Override
    public List<Tourist> getAll() {
        return this.touristDao.findAll();
    }
}
