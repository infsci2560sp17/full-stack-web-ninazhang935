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
public class SeekHouse {

    private static final long serialVersionUID = 1L;

    public enum Type {
        two_bedroom,
        one_bedroom,
        studio,
        house,
        none
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected Type type;
    protected String name;
    protected Long fee;
    protected String email;
    protected String comment;

    public SeekHouse() {
        this.id = Long.MAX_VALUE;
        this.type = Type.none;
        this.name = null;
        this.fee = null;
        this.email = null;
        this.comment = null;
    }
    
    public SeekHouse(Long id, Type type, String name, Long fee, String email, String comment) {
        this.id = id;
        this.name = name;
        this.type=type;
        this.fee = fee;
        this.email = email;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", fee=" + this.fee + ", email=" + this.email +".comment="+this.comment+"]";
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
    public String getName() {
        return name;
    }

    /**
     * @param title the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
