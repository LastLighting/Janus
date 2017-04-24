package projectpackages.janus.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name = "passport")
@Entity
public class Passport {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @Column(name = "guid", unique = true, nullable = true)
    private String guid;

    private String animalType;
}
