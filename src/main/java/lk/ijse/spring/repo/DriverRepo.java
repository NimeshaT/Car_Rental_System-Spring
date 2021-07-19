package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public class DriverRepo  {

//    @Query(value = "select did from Driver where isAvailable='YES'",nativeQuery = true)
//    List<String> getAvailableDrivers();
//    @Query(value = "select * from Driver where isAvailable='YES'",nativeQuery = true)
//    List<Driver>getAllAvailableDriversDetails();
//    //Dashboard
//    @Query(value = "select count(did) from Driver where isAvailable='Yes'", nativeQuery = true)
//    int getAvailableDriverCount();
//
//    @Query(value = "select count(did) from Driver where isAvailable='No'", nativeQuery = true)
//    int getOccupiedDriverCount();
}
