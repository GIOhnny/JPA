package entities;

import enums.PhoneType;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Person9 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ElementCollection
    @CollectionTable(name = "phone9", joinColumns = @JoinColumn(name = "person"))
    @MapKeyColumn(name = "type")
    @Column(name = "number")
    @MapKeyEnumerated(EnumType.STRING)
    private Map<PhoneType,String> phoneNumbers;

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

    public Map<PhoneType, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<PhoneType, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
