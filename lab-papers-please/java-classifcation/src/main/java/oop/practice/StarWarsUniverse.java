package oop.practice;
import java.util.ArrayList;

public class StarWarsUniverse {
    private ArrayList<IndividualTraits> individuals;

    public StarWarsUniverse() {
        individuals = new ArrayList<>();
    }

    public boolean checkIndividual(IndividualTraits individual) {
        String planet = individual.getPlanet();
        ArrayList<String> traits = individual.getTraits();
        int age = individual.getAge();

        if (planet != null && (planet.equals("Kashyyk") || planet.equals("Endor"))) {
            individuals.add(individual);
            return true;
        }

        if (traits != null) {
            ArrayList<String> validTraits = new ArrayList<>();
            validTraits.add("SHORT");
            validTraits.add("TALL");
            validTraits.add("HAIRY");

            for (String trait : traits) {
                if (!validTraits.contains(trait)) return false;
            }

            if (traits.contains("HAIRY") || (traits.contains("TALL") && age <= 400) || (traits.contains("SHORT") && age <= 60)) {
                individuals.add(individual);
                return true;
            }

            return false;
        }

        if (age >= 0 && age <= 400 && !individual.getIsHumanoid()) {
            individuals.add(individual);
            return true;
        }

        return false;
    }

    public ArrayList<IndividualTraits> getStarWarsIndividuals() {
        return individuals;
    }
}
