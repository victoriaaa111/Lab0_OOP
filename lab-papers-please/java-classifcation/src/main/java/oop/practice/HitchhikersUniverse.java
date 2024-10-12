package oop.practice;
import java.util.ArrayList;

public class HitchhikersUniverse {
    private ArrayList<IndividualTraits> individuals;
    public HitchhikersUniverse() {
        individuals = new ArrayList<>();
    }
    public boolean checkBetelgeusian(IndividualTraits individual) {
        //betelgeusian
        if(individual.getPlanet()!= null) {
            String planet = individual.getPlanet();
            if(planet.equals("Betelgeuse")) {
                individuals.add(individual);
                return true;
            }else{
                return false;
            }
        }else if(!individual.getTraits().isEmpty()) {
            ArrayList<String> traits = new ArrayList<String>();
            traits.add("EXTRA_ARMS");
            traits.add("EXTRA_HEAD");

            for(String trait : individual.getTraits()) {
                if(!traits.contains(trait)) {
                    return false;
                }
            }
            if(individual.getTraits().contains("EXTRA_ARMS") && individual.getTraits().contains("EXTRA_HEAD")) {
                individuals.add(individual);
                return true;
            }else if((individual.getTraits().contains("EXTRA_ARMS") || individual.getTraits().contains("EXTRA_HEAD")) && individual.getAge() <=100) {
                individuals.add(individual);
                return true;
            }else{
                return false;
            }
        }else if(individual.getAge()>0 && individual.getAge() <= 100 && individual.getIsHumanoid()) {

            individuals.add(individual);
            return true;
        } else{
            return false;
        }
    }

    public boolean checkVogons(IndividualTraits individual) {
        if(individual.getPlanet()!= null) { //vogons
            String planet = individual.getPlanet();
            if(planet.equals("Vogsphere")) {
                individuals.add(individual);
                return true;
            }else{
                return false;
            }
        }else if(!individual.getTraits().isEmpty()) {
            ArrayList<String> traits = new ArrayList<String>();
            traits.add("GREEN");
            traits.add("BULKY");

            for(String trait : individual.getTraits()) {
                if(!traits.contains(trait)) {
                    return false;
                }
            }
            if(individual.getTraits().contains("GREEN") && individual.getTraits().contains("BULKY")) {
                individuals.add(individual);
                return true;
            }else if((individual.getTraits().contains("GREEN") || individual.getTraits().contains("BULKY")) && individual.getAge() <=200 && !individual.getIsHumanoid()) {
                individuals.add(individual);
                return true;
            }else{
                return false;
            }
        }else if(individual.getAge()>0 && individual.getAge() <= 200 && !individual.getIsHumanoid()) {

            individuals.add(individual);
            return true;
        }else{
            return false;
        }
    }

    public void PrintHitchhikersUniverse() {
        for(IndividualTraits ind:individuals) {
            System.out.println("\n------------");
            System.out.println("Hitchhiker Universe");
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

