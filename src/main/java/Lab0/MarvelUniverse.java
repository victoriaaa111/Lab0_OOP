package Lab0;
import java.util.ArrayList;

public class MarvelUniverse {
    private final ArrayList<IndividualTraits> individuals;
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
            ArrayList<String> traits = new ArrayList<>();
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


    public ArrayList<IndividualTraits> getIndividuals() {
        return individuals;
    }
}
