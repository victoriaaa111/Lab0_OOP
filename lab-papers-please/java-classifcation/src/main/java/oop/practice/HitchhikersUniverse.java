package oop.practice;
import java.util.ArrayList;

public class HitchhikersUniverse {
    private ArrayList<IndividualTraits> individuals;
    public HitchhikersUniverse() {
        individuals = new ArrayList<>();
    }
    public void addIndividual(IndividualTraits individual) {
        String planet = individual.getPlanet();
        boolean isHumanoid = individual.getIsHumanoid();
        int age = individual.getAge();
        ArrayList<String> traits = individual.getTraits();

    }

    public ArrayList<IndividualTraits> getIndividuals() {
        return individuals;
    }
}

