package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Driver {
    @Id
    private String did;
    private String name;
    private String contact;
    private String isAvailable;

//    @OneToMany(targetEntity = Rental.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "did",referencedColumnName = "did")
//    private List<Rental> rentalRequests;
}
