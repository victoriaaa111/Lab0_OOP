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
    public void PrintFile(String FilePath) {
        if(rootNode != null) {
            System.out.println(rootNode.toPrettyString());
        }else{
            System.out.println("No data in JSON file");
        }
    }
}
