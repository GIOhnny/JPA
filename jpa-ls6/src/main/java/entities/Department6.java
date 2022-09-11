package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department6 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany
    private List<Employee6> employee;

    public List<Employee6> getEmployees() {
        return employee;
    }

    public void setEmployees(List<Employee6> employees) {
        this.employee = employees;
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
