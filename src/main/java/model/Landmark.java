package model;

import ef.qb.core.annotation.PersistenceType;
import static ef.qb.core.utils.PersistenceTypeConstants.JPA1;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@PersistenceType(value = JPA1)
public class Landmark implements Serializable {

    // serial id
    @Id
    @GeneratedValue
    private long id;

    // landmark's name
    private String name;

    // estimated year of inauguration of the landmarker
    private Integer inauguration;

    // the city in which the landmark is located
    private String location;

    // the architect designer of the landmark
    private String designer;

    // category of landmark, e.g., museum, castle, palace, etc.
    private String category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInauguration() {
        return inauguration;
    }

    public void setInauguration(Integer inauguration) {
        this.inauguration = inauguration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
