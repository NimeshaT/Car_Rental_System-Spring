package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DriverServiceImpl  {
    @Autowired
    private DriverRepo driverRepo;
    @Autowired
    private ModelMapper mapper;

//    @Override
//    public ArrayList<String> getAvailableDrivers() {
//        List<String> getAvailableDrivers=driverRepo.getAvailableDrivers();
//        return mapper.map(getAvailableDrivers,new TypeToken<ArrayList<String>>(){}.getType());
//
//    }
//
//    @Override
//    public ArrayList<DriverDTO> getAllAvailableDriversDetails() {
//        List<Driver>allDrivers=driverRepo.getAllAvailableDriversDetails();
//        return mapper.map(allDrivers,new TypeToken<ArrayList<DriverDTO>>(){}.getType());
//    }
//
//    @Override
//    public int getAvailableDriverCount() {
//        return driverRepo.getAvailableDriverCount();
//    }
//
//    @Override
//    public int getOccupiedDriverCount() {
//        return driverRepo.getOccupiedDriverCount();
//    }
}
