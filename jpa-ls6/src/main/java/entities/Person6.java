package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Person6 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    // Collection, List, Set
    @OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST)
    private Collection<Document6> documents;

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

    public Collection<Document6> getDocuments() {
        return documents;
    }

    public void setDocuments(Collection<Document6> documents) {
        this.documents = documents;
    }
}