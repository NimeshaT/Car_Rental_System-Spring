package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.exception.ValidateException;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addCar(CarDTO dto) {
        if (carRepo.existsById(dto.getRegistrationNo())) {
            throw new ValidateException("Customer Already Exist");
        }
        carRepo.save(mapper.map(dto, Car.class));
    }

    @Override
    public boolean regNoAlreadyExists(String id) {
        return false;
    }

    @Override
    public void deleteCar(String id) {

    }

    @Override
    public CarDTO searchCar(String id) {
        return null;
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        List<Car> all = carRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CarDTO>>() {
        }.getType());
    }

    @Override
    public void updateCar(CarDTO dto) {

    }

    @Override
    public ArrayList<CarDTO> getAvailableCars() {
        List<Car> allAvailableCars=carRepo.getAvailableCars();
        return mapper.map(allAvailableCars,new TypeToken<ArrayList<CarDTO>>(){
        }.getType());
    }
//    @Override
//    public void addMaintain(String requestId) {
//        carRepo.addMaintain(requestId);
//    }

//    @Override
//    public ArrayList<CarDTO> getASpecificCar(String registrationNo) {
//        List<Car> getASpecificCar=carRepo.getASpecificCar(registrationNo);
//        return mapper.map(getASpecificCar,new TypeToken<ArrayList<CarDTO>>(){
//        }.getType());
//    }
//
//    @Override
//    public int getAvailableCarCount() {
//        return carRepo.getAvailableCarCount();
//    }
//
//    @Override
//    public int getReservedCarCount() {
//        return carRepo.getReservedCarCount();
//    }
//
//    @Override
//    public int getDamagedCarCount() {
//        return carRepo.getDamagedCarCount();
//    }
//
//    @Override
//    public int getUnderMaintenanceCarCount() {
//        return carRepo.getUnderMaintenanceCarCount();
//    }
}
