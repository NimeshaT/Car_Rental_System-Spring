package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public class RentalRepo  {
//    @Query(value = "select * from rental where nic=?1",nativeQuery = true)
//    List<Rental> getRentalRequestByNIC(String nic);
//
//    @Modifying
//    @Query(value = "update Rental set requestStatus =?1 where requestId =?2",nativeQuery = true)
//    void acceptRentalRequest(String requestStatus,String requestId);
//
//    @Modifying
//    @Query(value = "update Rental set did =?1 where requestId =?2",nativeQuery = true)
//    void changeDriver(String did,String requestId);
//
//    //dashboard
//    @Query(value = "select count(requestId) from RentalRequest where requestStatus='Pending' OR requestStatus='Active'", nativeQuery = true)
//    int getTotalBookings();
//
//    @Query(value = "select count(requestId) from Rental where requestStatus='Active'", nativeQuery = true)
//    int getActiveBookings();
}
