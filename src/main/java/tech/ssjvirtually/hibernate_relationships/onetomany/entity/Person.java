package tech.ssjvirtually.hibernate_relationships.onetomany.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity(name = "onetomany_person")
@Table(name = "onetomany_person")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @JoinColumn(name = "address_id")
    @Cascade(CascadeType.ALL)
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonManagedReference
    Address address;

}
