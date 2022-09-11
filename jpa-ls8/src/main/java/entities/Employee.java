package entities;

import javax.persistence.*;

@Entity
@Table(name="employee8")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Embedded
    @AttributeOverride(name="contractNo", column = @Column(name = "contract_no"))
    @AssociationOverride(name="department8",
                         joinColumns = @JoinColumn(name = "department_id"))
    private DepartmentDetails departmentDetails;

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

    public DepartmentDetails getDepartmentDetails() {
        return departmentDetails;
    }

    public void setDepartmentDetails(DepartmentDetails departmentDetails) {
        this.departmentDetails = departmentDetails;
    }
}
