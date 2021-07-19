package lk.ijse.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Rental {
    @Id
    private String requestId;
    private String nic;
    private String registrationNo;
    private String did;
    private String pickupDate;
    private String pickupTime;
    private String pickupVenue;
    private String returnDate;
    private String returnTime;
    private String returnVenue;
    private String requestStatus;
    private String description;
    private String bankSlip;


//    @OneToMany(targetEntity = Payment.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "requestId",referencedColumnName = "requestId")
//    private List<Payment> payments;
}
