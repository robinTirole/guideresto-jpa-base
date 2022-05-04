package ch.hearc.ig.guideresto.application;

import ch.hearc.ig.guideresto.business.*;
import ch.hearc.ig.guideresto.presentation.CLI;
import ch.hearc.ig.guideresto.service.RestaurantService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    /*var scanner = new Scanner(System.in);
    var printStream = System.out;
    var restaurantService = new RestaurantService();
    var cli = new CLI(scanner, printStream, restaurantService);
*/
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("guideRestoPersistenceUnit");
    EntityManager em = emf.createEntityManager();
    Restaurant restaurant = em.find(Restaurant.class, 1);
    System.out.println(restaurant.getName());
    City ville = em.find(City.class, 1);
    System.out.println(ville.getCityName());
    RestaurantType typeRestaurant = em.find(RestaurantType.class,1);
    System.out.println(typeRestaurant.getLabel());


/*
    cli.start();*/
  }
}
