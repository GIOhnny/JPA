package entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Cacheable
public class Product extends GeneralEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

/*
    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "last_modified")
    private LocalDateTime lastModified;
*/

    private String name;

    /*
    LOAD -- @PostLoad
    UPDATE -- @PreUpdate @PostUpdate
    REMOVE -- @PreRemove @PostRemove
    PERSIST -- @PrePersist @PostPersist
     */

    @PrePersist
    public void prePersist() {
        this.dateCreated = LocalDateTime.now();
        this.lastModified = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.lastModified = LocalDateTime.now();
    }

    @PostLoad
    public void postLoad() {
        System.out.println("Entity "+ this + " was loaded!");
        //this refers to the loaded entity
    }

    @PreRemove
    public void preRemove() {
        System.out.println("Entity "+ this + " will be removed");
    }

    @PostRemove
    public void postRemove() {
        System.out.println("Entity "+ this + " was removed");
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                '}';
    }

}