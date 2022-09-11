package entities;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="department9")
public class Department9 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "department")
    @MapKey(name="id")
    private Map<Integer, Employee9> employees;

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

    public Map<Integer, Employee9> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<Integer, Employee9> employees) {
        this.employees = employees;
    }
}
