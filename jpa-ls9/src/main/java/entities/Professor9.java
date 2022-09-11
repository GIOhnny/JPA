package entities;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Professor9 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany
    @JoinTable(name = "prof_stud9", joinColumns = @JoinColumn(name = "prof"),
            inverseJoinColumns = @JoinColumn(name = "stud"))
    @MapKeyColumn(name = "course")
    private Map<String, Student9> students;

    public Map<String, Student9> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student9> students) {
        this.students = students;
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
}
