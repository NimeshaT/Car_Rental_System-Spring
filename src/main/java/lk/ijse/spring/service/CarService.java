package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;

import java.util.ArrayList;

public interface CarService {

    void addCar(CarDTO dto);

    boolean regNoAlreadyExists(String id);

    void deleteCar(String id);

    CarDTO searchCar(String id);

    ArrayList<CarDTO> getAllCars();

    void updateCar(CarDTO dto);

    ArrayList<CarDTO>getAvailableCars();

//    void addMaintain(String requestId);
//
//    ArrayList<CarDTO>getASpecificCar(String registrationNo);


//    int getAvailableCarCount();
//    int getReservedCarCount();
//    int getDamagedCarCount();
//    int getUnderMaintenanceCarCount();
}
