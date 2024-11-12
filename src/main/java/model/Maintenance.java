package model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import ef.qb.core.annotation.PersistenceType;
import static ef.qb.core.utils.PersistenceTypeConstants.MONGODB;
import java.io.Serializable;
import java.time.LocalDateTime;
import org.bson.types.ObjectId;

@Entity
@PersistenceType(MONGODB)
public class Maintenance implements Serializable {

    // unique id
    @Id
    private ObjectId id;

    // name of the landmark that received maintenance.
    private String landmark;

    // type of maintenance, e.g., reinforcement, cleaning, restoration, etc.
    private String type;

    // start date of services
    private LocalDateTime initialization;

    // end date of services
    private LocalDateTime finalization;

    // hired company
    private String company;

    // total cost of services
    private int costs;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getInitialization() {
        return initialization;
    }

    public void setInitialization(LocalDateTime initialization) {
        this.initialization = initialization;
    }

    public LocalDateTime getFinalization() {
        return finalization;
    }

    public void setFinalization(LocalDateTime finalization) {
        this.finalization = finalization;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

}
