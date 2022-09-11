package entities;

import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;
import java.util.List;

@Embeddable
public class ProfessorDetails {

    @ManyToMany
    private List<Professor8> professors;

    public List<Professor8> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor8> professors) {
        this.professors = professors;
    }
}
