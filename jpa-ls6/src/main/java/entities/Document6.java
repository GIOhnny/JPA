package entities;

import javax.persistence.*;

@Entity
public class Document6 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    @JoinColumn(name = "person_id")
    private Person6 person;

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

    public Person6 getPerson6() {
        return person;
    }

    public void setPerson6(Person6 person) {
        this.person = person;
    }
}
