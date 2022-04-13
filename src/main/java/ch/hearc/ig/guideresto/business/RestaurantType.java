package ch.hearc.ig.guideresto.business;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "TYPES_GASTRONOMIQUES")
public class RestaurantType {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
            generator="SEQ_TYPE")
    @SequenceGenerator(name="SEQ_TYPE",
            sequenceName="SEQ_TYPES_GASTRONOMIQUES",
            initialValue=1,
            allocationSize=1)
    @Column(name = "NUMERO")
    private Integer id;
    @Column(name = "LIBELLE")
    private String label;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany
    @JoinColumn(name = "NUMERO")
    private Set<Restaurant> restaurants;

    public RestaurantType(Integer id, String label, String description) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.restaurants = new HashSet<>();
    }

    public RestaurantType() {

    }


    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public int getId() {
        return id;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}