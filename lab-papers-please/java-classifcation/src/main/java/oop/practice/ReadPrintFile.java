package oop.practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadPrintFile {
    private ArrayList<IndividualTraits> individuals = new ArrayList<>(); //list to store objects

    //method to read data from file and store objects in list
    public void ReadFile(String FilePath) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            File jsonFile = new File(FilePath);
            JsonNode rootNode = mapper.readTree(jsonFile);
            if(rootNode != null && rootNode.has("data")){
                JsonNode data = rootNode.get("data");
                for(JsonNode individual : data){
                    IndividualTraits ind = new IndividualTraits();
                    //set data
                    if(individual.has("id")){
                        ind.setId(individual.get("id").asInt());
                    }
                    if(individual.has("isHumanoid")){
                        ind.setHumanoid(individual.get("isHumanoid").asBoolean());
                    }
                    if(individual.has("planet")){
                        ind.setPlanet(individual.get("planet").asText());
                    }
                    if(individual.has("age")){
                        ind.setAge(individual.get("age").asInt());
                    }
                    if(individual.has("traits")){
                        ArrayList<String> traitList = new ArrayList<>();
                        for(JsonNode trait : individual.get("traits")) {
                            traitList.add(trait.asText());
                        }
                        ind.setTraits(traitList);
                    }
                    individuals.add(ind); //adds object to list
                }
            }else{
                System.out.println("No data in JSON file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //prints all individual records
    public void PrintEachObject(){
        if(individuals.isEmpty()){
            System.out.println("No data in JSON file");
        }else{
            System.out.println("All records:");
            for(IndividualTraits ind : individuals){
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

    //prints all ids
    public void PrintIds(){
        if(individuals.isEmpty()){
            System.out.println("No data in JSON file");
        }else{
            System.out.println("\nAll Ids:");
            for(IndividualTraits ind : individuals){
                System.out.println("\nId: "+ ind.getId());
            }
        }
    }

    //prints records with odd ids
    public void PrintOdd(){
        if(individuals.isEmpty()){
            System.out.println("No data in JSON file");
        }else{
            System.out.println("\n------------");
            System.out.println("\nOdd Ids:");
            for(IndividualTraits ind : individuals){
                if(ind.getId() % 2 == 1){
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
    }

    //prints records with even ids
    public void PrintEven(){
        if(individuals.isEmpty()){
            System.out.println("No data in JSON file");
        }else{
            System.out.println("\n------------");
            System.out.println("\nEven Ids:");
            for(IndividualTraits ind : individuals){
                if(ind.getId() % 2 == 0){
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
    }

    public ArrayList<IndividualTraits> getIndividualTraits() {
        return individuals;
    }



//    public void PrintObjectById(int Id){
//        if(rootNode != null && rootNode.has("data")) {
//            JsonNode DataNode = rootNode.get("data");
//            boolean found = false;
//            for(JsonNode individual : DataNode) {
//                if (individual.has("id") && individual.get("id").asInt() == Id) {
//                    System.out.println("\n Individual nr. " + individual.get("id").asInt() + ":");
//
//                    if (individual.has("isHumanoid")) {
//                        System.out.println("\n Is Humanoid: " + individual.get("isHumanoid").asBoolean());
//                    }else{
//                        System.out.println("\n Humanoid status not found");
//                    }
//                    if (individual.has("planet")) {
//                        System.out.println("\n Planet: " + individual.get("planet").asText());
//                    }else{
//                        System.out.println("\n Planet name not found");
//                    }
//                    if (individual.has("age")) {
//                        System.out.println("\n Age: " + individual.get("age").asText());
//                    }else{
//                        System.out.println("\n Age not found");
//                    }
//                    if (individual.has("traits")) {
//                        System.out.println("\n Traits: " + individual.get("traits").asText());
//                    }else{
//                        System.out.println("\n Traits not found");
//                    }
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                System.out.println("\nNo Individual with id " + Id + " found");
//            }
//        }else{
//            System.out.println("No data in JSON file");
//        }
//    }

}
