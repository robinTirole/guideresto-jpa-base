package ch.hearc.ig.guideresto.business;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Localisation {
    @Column(name = "ADRESSE")
    private String street;
    @ManyToOne
    @JoinColumn(name = "FK_VILL")
    private City city;

    public Localisation(String street, City city) {
        this.street = street;
        this.city = city;
    }

    public Localisation() {

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}