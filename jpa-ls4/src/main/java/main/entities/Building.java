package main.entities;

import main.embeddables.BuildingPk;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Building {

    @EmbeddedId
    private BuildingPk id;

    private String name;

    public BuildingPk getId() {
        return id;
    }

    public void setId(BuildingPk id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
