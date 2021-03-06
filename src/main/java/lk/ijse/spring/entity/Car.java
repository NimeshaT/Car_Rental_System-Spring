package lk.ijse.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {
    @Id
    private String registrationNo;
    private String brand;
    private String type;
    private String image;
    private int numberOfPassengers;
    private String transmissionType;
    private String fuelType;
    private String color;
    private double dailyRate;
    private double monthlyRate;
    private int freeMileagePerDay;
    private int freeMileagePerMonth;
    private double pricePerKm;
    private int kmMeterValue;
    private String lastReturnDate;
    private String isAvailable;
    private String isDamaged;
    private String underMaintenance;

//    @OneToMany(targetEntity = RentalRequest.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "registrationNo",referencedColumnName = "registrationNo")
//    private List<RentalRequest> rentalRequests;

}
