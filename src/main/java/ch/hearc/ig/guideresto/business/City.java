package ch.hearc.ig.guideresto.business;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "VILLES")
public class City {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
            generator="SEQ_CITY")
    @SequenceGenerator(name="SEQ_CITY",
            sequenceName="SEQ_VILLES",
            initialValue=1,
            allocationSize=1)
    @Column(name = "NUMERO")
    private Integer id;
    @Column(name = "CODE_POSTAL")
    private String zipCode;
    @Column(name="NOM_VILLE")
    private String cityName;
    @OneToMany
    @JoinColumn(name = "NUMERO")
    private Set<Restaurant> restaurants;

    public City(Integer id, String zipCode, String cityName) {
        this.id = id;
        this.zipCode = zipCode;
        this.cityName = cityName;
        this.restaurants = new HashSet<>();
    }

    public City() {

    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCityName() {
        return cityName;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

  public void setId(int id) {
        this.id = id;
  }

  public int getId() {
    return id;
  }
}