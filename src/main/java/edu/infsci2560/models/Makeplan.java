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

    public enum Plan {
        lessthan_5kg,
        between5to10kg,
        morethan10kg,
        keepWeight
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected Plan plan;

    public Makeplan() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.plan = Plan.keepWeight;
    }

    public Makeplan(Long id, String name, Plan plan) {
        this.id = id;
        this.title = name;
        this.plan=plan;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", plan=" + this.plan + " ]";
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

    /**
     * @return the workoutType
     */
    public Plan getPlan() {
        return plan;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setPlan(Plan plan) {
        this.plan = plan;
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

}
