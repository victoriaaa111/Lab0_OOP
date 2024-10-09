package oop.practice;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.io.File;
//import java.io.IOException;
import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

public class Main {
  /*
  public static void main(String[] args) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    File inputFile = new File("./lab-papers-please/java-classifcation/src/main/resources/test-input.json");
    JsonNode data = mapper.readTree(inputFile).get("data");

    Universe starWars = new Universe("starWars", new ArrayList<>());
    Universe hitchhikers = new Universe("hitchHiker", new ArrayList<>());
    Universe marvel = new Universe("marvel", new ArrayList<>());
    Universe rings = new Universe("rings", new ArrayList<>());
    Scanner scanner = new Scanner(System.in);

    for (JsonNode entry : data) {
      String entryAsString = entry.toString();
      System.out.println(entryAsString);
      String userInput = scanner.nextLine();
      switch (userInput) {
        case "1":
          starWars.individuals().add(entry);
          break;
        case "2":
          hitchhikers.individuals().add(entry);
          break;
        case "3":
          marvel.individuals().add(entry);
          break;
        case "4":
          rings.individuals().add(entry);
          break;
        default:
          System.out.println("Invalid input");
      }
    }

    scanner.close();
    mapper.writeValue(new File("src/main/resources/output/starwars.json"), starWars);
    mapper.writeValue(new File("src/main/resources/output/hitchhiker.json"), hitchhikers);
    mapper.writeValue(new File("src/main/resources/output/rings.json"), rings);
    mapper.writeValue(new File("src/main/resources/output/marvel.json"), marvel);
  }
*/


  public static void main(String[] args){
    IndividualTraits individual1 = new IndividualTraits();
    ArrayList<String> traits1 = new ArrayList<>();
    traits1.add("HAIRY");
    traits1.add("TALL");
    individual1.setId(1);
    individual1.setAge(25);
    individual1.setHumanoid(false);
    individual1.setPlanet("Kashyyk");
    individual1.setTraits(traits1);

    System.out.println("\nIndividual nr. " + individual1.getId() + " :");
    System.out.println("\nId: "+individual1.getId());
    System.out.println("\nAge: "+individual1.getAge());
    System.out.println("\nHumanoid: "+individual1.isHumanoid());
    System.out.println("\nPlanet: "+individual1.getPlanet());
    System.out.println("\nTraits: "+individual1.getTraits());

  }
}

/*
 record Universe(
    String name,
    List<JsonNode> individuals
) { }
 */
