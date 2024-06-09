package tech.ssjvirtually.hibernate_relationships.onetomany.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "onetomany_address")
@Table(name = "onetomany_address")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String City;

    String Country;

    Integer Pincode;

    @OneToOne(mappedBy = "address")
    @JsonBackReference
    Person person;
}
