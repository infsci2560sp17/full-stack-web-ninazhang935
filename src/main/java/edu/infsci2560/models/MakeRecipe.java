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
public class MakeRecipe {

    private static final long serialVersionUID = 1L;

    public enum Type {
        one,
        two,
        three,
        four,
        five
    }
    public enum Park {
        freeparking,
        garage,
        outdoorparking,
        Noparking
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected Type type;
    protected Long fee;
    protected String bus;
    protected Park park;
    protected String comment;

    public MakeRecipe() {
        this.id = Long.MAX_VALUE;
        this.title = "Unknown";
        this.type = Type.one;
        this.fee = null;
        this.bus = "Unknown";
        this.park = Park.freeparking;
        this.comment = "No comment";
    }
    
    public MakeRecipe(Long id, String name, Type type, Long fee, String bus, Park park, String comment) {
        this.id = id;
        this.title = name;
        this.type=type;
        this.fee = fee;
        this.bus = bus;
        this.park = park;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", type=" + this.type + ", fee=" + this.fee + ", bus=" + this.park +",park="+this.comment+".comment=" +"]";
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

    /**These functions are necessary, use to get the type user chose
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param set type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getFee() {
        return fee;
    }

    
    public void setFee(Long fee) {
        this.fee = fee;
    }
    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }
    
    public Park getPark() {
        return park;
    }
    public void setPark(Park park) {
        this.park = park;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
