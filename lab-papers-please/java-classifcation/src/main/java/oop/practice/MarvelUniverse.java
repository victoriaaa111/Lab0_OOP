package oop.practice;
import java.util.ArrayList;

public class MarvelUniverse {
    private ArrayList<IndividualTraits> individuals;
    public MarvelUniverse() {
        individuals = new ArrayList<>();
    }

    public boolean checkIndividual(IndividualTraits individual) {
        if(individual.getPlanet()!= null) {
            String planet = individual.getPlanet();
            if(planet.equals("Asgard")) {
                individuals.add(individual);
                return true;
            }else{
                return false;
            }
        }else if(!individual.getTraits().isEmpty()) {
            ArrayList<String> traits = new ArrayList<String>();
            traits.add("BLONDE");
            traits.add("TALL");
            for(String trait : individual.getTraits()) {
                if(!traits.contains(trait)) {
                    return false;
                }
            }
            if(individual.getTraits().contains("BLONDE") && individual.getTraits().contains("TALL")) {
                individuals.add(individual);
                return true;
            }else if((individual.getTraits().contains("BLONDE") || individual.getTraits().contains("TALL")) && individual.getAge() <=5000) {
                individuals.add(individual);
                return true;
            }else{
                return false;
            }
        }else if(individual.getAge()>0 && individual.getAge() <= 5000 && !individual.getIsHumanoid()) {

            individuals.add(individual);
            return true;
        }else{
            return false;
        }
    }

    public void PrintMarvelUniverse() {
        for(IndividualTraits ind:individuals) {
            System.out.println("\n------------");
            System.out.println("Marvel Universe");
            System.out.println("\n------------");
            System.out.println("\nIndividual nr. " + ind.getId() + ":");
            System.out.println("\nId: "+ind.getId());
            System.out.println("\nAge: "+ind.getAge());
            System.out.println("\nHumanoid: "+ind.getIsHumanoid());
            System.out.println("\nPlanet: "+ind.getPlanet());
            if(ind.getTraits().isEmpty()){
                System.out.println("\n No traits");
            }else{
                System.out.println("\nTraits: ");
                for(String trait : ind.getTraits()) {
                    System.out.println("\n - " + trait);
                }
            }
        }
    }

}
