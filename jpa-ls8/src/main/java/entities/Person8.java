package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person8 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ElementCollection
    @CollectionTable(name = "phone8", joinColumns = @JoinColumn(name = "person"))
    @Column(name = "number")
    private List<String> phoneNumbers;

    @ElementCollection
    @CollectionTable(name = "document8", joinColumns = @JoinColumn(name = "person"))
    private List<Document8> documents;

    public List<Document8> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document8> documents) {
        this.documents = documents;
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

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
