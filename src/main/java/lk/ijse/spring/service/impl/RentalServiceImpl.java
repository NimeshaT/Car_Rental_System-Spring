package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RentalDTO;
import lk.ijse.spring.entity.Rental;
import lk.ijse.spring.exception.ValidateException;
import lk.ijse.spring.repo.RentalRepo;
import lk.ijse.spring.service.RentalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class RentalServiceImpl  {
//    @Autowired
//    private RentalRepo rentalRequestRepo ;
//
//    @Autowired
//    private ModelMapper mapper;
//
//    @Override
//    public void addRentalRequest(RentalDTO dto) {
//        if (rentalRequestRepo.existsById(dto.getRequestId())) {
//            throw new ValidateException("Customer Already Exist");
//        }
//        rentalRequestRepo.save(mapper.map(dto, Rental.class));
//    }
//
//    @Override
//    public boolean requestIDAlreadyExists(String requestId) {
//        return false;
//    }
//
//    @Override
//    public void deleteRentalRequest(String requestId) {
//        if (!rentalRequestRepo.existsById(requestId)) {
//            throw new ValidateException("No requestId for Delete..!");
//        }
//        rentalRequestRepo.deleteById(requestId);
//    }
//
//    @Override
//    public RentalRequestDTO searchRentalRequest(String requestId) {
//        Optional<RentalRequest> rentalRequest = rentalRequestRepo.findById(requestId);
//        if (rentalRequest.isPresent()) {
//            return mapper.map(rentalRequest.get(), RentalRequestDTO.class);
//        }
//        return null;
//    }
//
//    @Override
//    public ArrayList<RentalRequestDTO> getAllRentalRequest() {
//        List<RentalRequest> all = rentalRequestRepo.findAll();
//        return mapper.map(all, new TypeToken<ArrayList<RentalRequestDTO>>() {
//        }.getType());
//    }

}
