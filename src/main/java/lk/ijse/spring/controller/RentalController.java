package lk.ijse.spring.controller;

import lk.ijse.spring.dto.RentalDTO;
import lk.ijse.spring.exception.NotFoundException;
import lk.ijse.spring.service.RentalService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("api/v1/rentalRequest")
public class RentalController {
//    @Autowired
//    private RentalService service;
//
//    @PostMapping(path = "/uploadBankSlipImage")
//    public ResponseEntity uploadIdImage(@RequestPart("file") MultipartFile multipartFile) {
//        /*if (service.nicAlreadyExists(nic)) {
//            throw new RuntimeException("Duplicate NIC Entry!");
//        }*/
//        System.out.println(multipartFile.getOriginalFilename());
//        try {
//            // Let's get the project location
//            //String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
//            // Let's create a folder there for uploading purposes, if not exists
//            File uploadsDir = new File("D:/java/Easy-Car-Rental-System/FrontEnd/regUser/asserts/img");
//            uploadsDir.mkdir();
//            // It is time to transfer the file into the newly created dir
//            multipartFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + multipartFile.getOriginalFilename()));
//        }/* catch (URISyntaxException e) {
//            e.printStackTrace();
//        }*/ catch (IOException e) {
//            e.printStackTrace();
//        }
//        String filePath = multipartFile.getOriginalFilename();
//
//
//        StandardResponse standardResponse = new StandardResponse("200", "Success!", filePath);
//        return new ResponseEntity(standardResponse, HttpStatus.OK);
//    }
//
//    @PostMapping(path = "/sendRequest", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity saveUser(@RequestBody RentalDTO dto) {
//        if (dto.getRequestId().trim().length() <= 0) {
//            throw new NotFoundException("User NIC cannot be empty");
//        }
//        System.out.println(dto.getDid());
//        service.addRentalRequest(dto);
//        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
//    }
//
//    @GetMapping(path = "/getRentalRequestByNIC/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity getRentalRequestByNIC(@PathVariable String id) {
//        ArrayList<RentalDTO> allRentalRequest = service.getRentalRequestByNIC(id);
//        return new ResponseEntity(new StandardResponse("200", "Done", allRentalRequest), HttpStatus.OK);
//    }
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity getAllUsers() {
//        ArrayList<RentalDTO> allUsers = service.getAllRentalRequest();
//        return new ResponseEntity(new StandardResponse("200", "Done", allUsers), HttpStatus.OK);
//    }
//
//    @PutMapping(path = "acceptRentalRequest/{requestStatus}/{requestId}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity acceptRentalRequest(@PathVariable String requestStatus,@PathVariable String requestId) {
//        service.acceptRentalRequest(requestStatus,requestId);
//        return new ResponseEntity(new StandardResponse("200", "Done", "done"), HttpStatus.OK);
//    }
//    @PutMapping(path = "changeDriver/{did}/{requestId}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity changeDriver(@PathVariable String did,@PathVariable String requestId) {
//        service.changeDriver(did,requestId);
//        return new ResponseEntity(new StandardResponse("200", "Done", "done"), HttpStatus.OK);
//    }
}
