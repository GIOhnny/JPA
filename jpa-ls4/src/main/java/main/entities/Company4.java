package main.entities;

import main.embeddables.Address;

import javax.persistence.*;

@Entity
@Table(name = "company4")
public class Company4 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Embedded
    @AttributeOverride(name = "no", column = @Column(name = "number"))
    @AttributeOverride(name = "str", column = @Column(name = "street"))
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
