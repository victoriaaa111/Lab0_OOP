package oop.practice;
import java.util.ArrayList;

public class StarWarsUniverse {
    private ArrayList<IndividualTraits> individuals;

    public StarWarsUniverse() {
        individuals = new ArrayList<>();
    }

    public boolean checkIndividual(IndividualTraits individual) {
        if(individual.getPlanet()!= null) {
            String planet = individual.getPlanet();
            if(planet.equals("Kashyyyk") || planet.equals("Endor")) {
                individuals.add(individual);
                return true;
            }else{
                return false;
            }
        }else if(!individual.getTraits().isEmpty()) {
            ArrayList<String> traits = new ArrayList<String>();
            traits.add("SHORT");
            traits.add("TALL");
            traits.add("HAIRY");
            for(String trait : individual.getTraits()) {
                if(!traits.contains(trait)) {
                    return false;
                }
            }
            if((individual.getTraits().contains("HAIRY") && individual.getTraits().contains("TALL")) || (individual.getTraits().contains("HAIRY") && individual.getTraits().contains("SHORT"))) {
                individuals.add(individual);
                return true;
            }else if(individual.getTraits().contains("HAIRY")){
                individuals.add(individual);
                return true;
            }else if(individual.getTraits().contains("TALL")){
                if(individual.getAge()>0 && individual.getAge() <= 400) {
                    individuals.add(individual);
                    return true;
                }else{
                    return false;
                }
            }else if(individual.getTraits().contains("SHORT")){
                if(individual.getAge()>0 && individual.getAge() <= 60) {
                    individuals.add(individual);
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else if(individual.getAge()>0 && individual.getAge() <= 400 && !individual.getIsHumanoid()) {

            individuals.add(individual);
            return true;
        }else{
            return false;
        }
    }

    public void PrintStarWarsUniverse() {
        for(IndividualTraits ind:individuals) {
            System.out.println("\n------------");
            System.out.println("Star Wars Universe");
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
    public ArrayList<IndividualTraits> getIndividuals() {
        return individuals;
    }
}
