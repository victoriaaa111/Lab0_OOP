package oop.practice;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadPrintFile {
    private JsonNode rootNode;

    //method to read data from file
    public void ReadFile(String FilePath) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            File jsonFile = new File(FilePath);
            rootNode = mapper.readTree(jsonFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //method to print data from file
    public void PrintFile() {
        if(rootNode != null) {
            System.out.println(rootNode.toPrettyString());
        }else{
            System.out.println("No data in JSON file");
        }
    }

    public void PrintEachObject(){
        if(rootNode != null && rootNode.has("data")) {
            JsonNode DataNode = rootNode.get("data");
            for(JsonNode individual : DataNode) {
                System.out.println("--------------");
                System.out.println("\nIndividual");
                if (individual.has("id")) {
                    System.out.println("\n Individual nr. " + individual.get("id").asInt() + ":");
                }else{
                    System.out.println("\n Id not found");
                }
                if (individual.has("isHumanoid")) {
                    System.out.println("\n Is Humanoid: " + individual.get("isHumanoid").asBoolean());
                }else{
                    System.out.println("\n Humanoid status not found");
                }
                if (individual.has("planet")) {
                    System.out.println("\n Planet: " + individual.get("planet").asText());
                }else{
                    System.out.println("\n Planet name not found");
                }
                if (individual.has("age")) {
                    System.out.println("\n Age: " + individual.get("age").asText());
                }else{
                    System.out.println("\n Age not found");
                }
                if (individual.has("traits")) {
                    System.out.println("\n Traits: ");
                    for (JsonNode trait : individual.get("traits")) {
                        System.out.println(" - " + trait.asText());
                    }
                }else{
                    System.out.println("\n Traits not found");
                }
            }
        } else {
            System.out.println("No data in JSON file");
        }
        }


    public void PrintObjectById(int Id){
        if(rootNode != null && rootNode.has("data")) {
            JsonNode DataNode = rootNode.get("data");
            boolean found = false;
            for(JsonNode individual : DataNode) {
                if (individual.has("id") && individual.get("id").asInt() == Id) {
                    System.out.println("\n Individual nr. " + individual.get("id").asInt() + ":");

                    if (individual.has("isHumanoid")) {
                        System.out.println("\n Is Humanoid: " + individual.get("isHumanoid").asBoolean());
                    }else{
                        System.out.println("\n Humanoid status not found");
                    }
                    if (individual.has("planet")) {
                        System.out.println("\n Planet: " + individual.get("planet").asText());
                    }else{
                        System.out.println("\n Planet name not found");
                    }
                    if (individual.has("age")) {
                        System.out.println("\n Age: " + individual.get("age").asText());
                    }else{
                        System.out.println("\n Age not found");
                    }
                    if (individual.has("traits")) {
                        System.out.println("\n Traits: ");
                        for (JsonNode trait : individual.get("traits")) {
                            System.out.println(" - " + trait.asText());
                        }
                    }else{
                        System.out.println("\n Traits not found");
                    }
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("\nNo Individual with id " + Id + " found");
            }
        }else{
            System.out.println("No data in JSON file");
        }
    }
    }
