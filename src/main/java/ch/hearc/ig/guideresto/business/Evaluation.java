package ch.hearc.ig.guideresto.business;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
public abstract class Evaluation {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
          generator = "SEQ_EVAL")
  @SequenceGenerator(name="SEQ_EVAL",
          sequenceName="SEQ_EVAL",
          allocationSize=1)
  @Column(name = "NUMERO")
  private Integer id;
  @Column(name = "DATE_EVAL")
  private LocalDate visitDate;
  @OneToOne
  @JoinColumn(name = "FK_REST")
  private Restaurant restaurant;

  public Evaluation(Integer id, LocalDate visitDate, Restaurant restaurant) {
    this.id = id;
    this.visitDate = visitDate;
    this.restaurant = restaurant;
  }

  public Evaluation() {

  }

  public LocalDate getVisitDate() {
    return visitDate;
  }

  public Restaurant getRestaurant() {
    return restaurant;
  }

  public Integer getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluation that = (Evaluation) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public void setRestaurant(Restaurant restaurant) {
    this.restaurant = restaurant;
  }
}