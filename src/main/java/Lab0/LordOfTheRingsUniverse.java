package Lab0;
import java.util.ArrayList;

public class LordOfTheRingsUniverse {
    private final ArrayList<IndividualTraits> individuals;
    public LordOfTheRingsUniverse() {
        individuals = new ArrayList<>();
    }

    public boolean checkElf(IndividualTraits individual) {
        //elf
        if(!individual.getTraits().isEmpty()) {
            ArrayList<String> traits = new ArrayList<>();
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
            ArrayList<String> traits = new ArrayList<>();
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
            } else{
                return false;
        }
    }

    //getter for list of individuals from Lord Of The Rings
    public ArrayList<IndividualTraits> getIndividuals() {
        return individuals;
    }
}
