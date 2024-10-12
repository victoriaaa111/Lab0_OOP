package oop.practice;
import java.util.ArrayList;

public class LordOfTheRingsUniverse {
    private ArrayList<IndividualTraits> individuals;
    public LordOfTheRingsUniverse() {
        individuals = new ArrayList<>();
    }

    public boolean checkElf(IndividualTraits individual) {
        //elf
        if(!individual.getTraits().isEmpty()) {
            ArrayList<String> traits = new ArrayList<String>();
            traits.add("BLONDE");
            traits.add("POINTY_EARS");

            for (String trait : individual.getTraits()) {
                if (!traits.contains(trait)) {
                    return false;
                }
            }
            if (individual.getTraits().contains("BLONDE") && individual.getTraits().contains("POINTY_EARS")) {
                individuals.add(individual);
                return true;
            } else if (individual.getTraits().contains("BLONDE") || individual.getTraits().contains("POINTY_EARS")) {
                individuals.add(individual);
                return true;
            } else {
                return false;
            }
        }else if(individual.getPlanet()!= null) {
            String planet = individual.getPlanet();
            if(planet.equals("Earth")) {
                individuals.add(individual);
                return true;
            }else{
                return false;
            }
        }else if(individual.getAge() > 0 && individual.getIsHumanoid()) {

            individuals.add(individual);
            return true;
        } else{
            return false;
        }
    }

    public boolean checkDwarf(IndividualTraits individual) {
        if(!individual.getTraits().isEmpty()) {
            ArrayList<String> traits = new ArrayList<String>();
            traits.add("SHORT");
            traits.add("BULKY");

            for(String trait : individual.getTraits()) {
                if(!traits.contains(trait)) {
                    return false;
                }
            }
            if(individual.getTraits().contains("SHORT") && individual.getTraits().contains("BULKY")) {
                individuals.add(individual);
                return true;
            }else if((individual.getTraits().contains("SHORT") || individual.getTraits().contains("BULKY")) && individual.getAge() <=200 ) {
                individuals.add(individual);
                return true;
            }else {
                return false;
            }
            }else if(individual.getPlanet()!= null) { //dwarf
            String planet = individual.getPlanet();
            if (planet.equals("Earth")) {
                individuals.add(individual);
                return true;
            } else {
                return false;
            }
            }else if(individual.getAge()>0 && individual.getAge() <= 200 && individual.getIsHumanoid()) {

            individuals.add(individual);
            return true;
        }else{
            return false;
        }
    }
    public void PrintLordOfTheRingsUniverse() {
        for(IndividualTraits ind:individuals) {
            System.out.println("\n------------");
            System.out.println("Lord Of The Rings Universe");
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
