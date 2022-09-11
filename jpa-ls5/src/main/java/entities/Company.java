package entities;

import javax.persistence.*;

@Entity
@Table(name = "Company5")
@SecondaryTable(name = "Address5",
                pkJoinColumns = @PrimaryKeyJoinColumn(name ="company_id"))
@SecondaryTable(name = "Miscellaneous5",
        pkJoinColumns = @PrimaryKeyJoinColumn(name ="company_id"))

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(table = "Address5")
    private String street;

    @Column(table = "Address5")
    private String number;

    @Column(table = "Miscellaneous5")
    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
