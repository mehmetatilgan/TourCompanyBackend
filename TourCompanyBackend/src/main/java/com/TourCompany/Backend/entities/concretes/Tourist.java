package com.TourCompany.Backend.entities.concretes;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "Tourists")
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TouristID")
    private short id;

    @Column(name = "FirstName")
    private String name;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Gender")
    private String gender;

}
