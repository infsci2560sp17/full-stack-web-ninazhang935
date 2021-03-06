package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author Wenjia
 */
@Entity
public class Makeplan {

    private static final long serialVersionUID = 1L;

    public enum Demand {
        unknown,
        request,
        require
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected String name;
    protected Demand demand;
    protected String email;
    protected String info;

    public Makeplan() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.name = null;
        this.demand = Demand.unknown;
        this.email = null;
        this.info = "User didn't provide more information";
    }

    public Makeplan(Long id, String aptname, String name, Demand demand, String email,String info) {
        this.id = id;
        this.title = aptname;
        this.name = name;
        this.demand=demand;
        this.email = email;
        this.info = info;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", name=" + this.name +", demand=" + this.demand + ", email=" + this.email +", info=" + this.info +" ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return name;
    }

    /**
     * @param title the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the workoutType
     */
    public Demand getDemand() {
        return demand;
    }

    /**
     * @param  workoutType to set
     */
    public void setDemand(Demand demand) {
        this.demand = demand;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
