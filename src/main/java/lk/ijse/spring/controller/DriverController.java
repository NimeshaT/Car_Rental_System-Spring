package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("api/v1/drivers")
@CrossOrigin
public class DriverController {
//    @Autowired
//    private DriverService driverService;
//
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity getAvailableDrivers() {
//        ArrayList<String> allDriverIDs = driverService.getAvailableDrivers();
//        return new ResponseEntity(new StandardResponse("200", "Done", allDriverIDs), HttpStatus.OK);
//    }
//    @GetMapping(path = ("/allAvailableDriversDetails"),produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity getAllAvailableDrivers() {
//        ArrayList<DriverDTO> allAvailableDriversDetails = driverService.getAllAvailableDriversDetails();
//        return new ResponseEntity(new StandardResponse("200", "Done", allAvailableDriversDetails), HttpStatus.OK);
//    }

}
