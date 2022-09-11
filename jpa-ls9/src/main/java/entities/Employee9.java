package entities;

import javax.persistence.*;

@Entity
@Table(name="employee9")
public class Employee9 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name="department")
    private Department9 department;


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

    public Department9 getDepartment() {
        return department;
    }

    public void setDepartment(Department9 department) {
        this.department = department;
    }
}
