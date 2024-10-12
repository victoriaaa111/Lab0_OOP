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

    public ArrayList<IndividualTraits> getIndividualTraits() {
        return individuals;
    }

}
