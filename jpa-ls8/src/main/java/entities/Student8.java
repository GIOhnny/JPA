package entities;

import javax.persistence.*;

@Entity
public class Student8 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Embedded
    @AssociationOverride(name = "professors", //name of the field in the ProfessorDetails
                       joinTable = @JoinTable(name = "student_prof8",
                           joinColumns = @JoinColumn(name = "student_id"),
                           inverseJoinColumns = @JoinColumn(name = "professor_id")))
    private ProfessorDetails professorDetails;

    public ProfessorDetails getProfessorDetails() {
        return professorDetails;
    }

    public void setProfessorDetails(ProfessorDetails professorDetails) {
        this.professorDetails = professorDetails;
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
