package Lab1.Task4;

import Lab1.Task2.FileReader;
import Lab1.Task2.TextData;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Lab1.Task2.Main <file1> <file2> ... <fileN>");
            return;
        }
        for(String filePath : args) {
            File file = new File(filePath);
            String fileName = file.getName();
            try{
                FileReader fileReader = new FileReader();
                String content = fileReader.readFileIntoString(filePath);
                TextData textData = new TextData(content);
                textData.setFilename(fileName);
                //print object
                System.out.println(textData);
                System.out.println("##########");
                System.out.println("\n1. File Name : " + textData.getFilename()+"\n");
                System.out.println("2. Text from file : " + textData.getText()+"\n");
                System.out.println("3. Number of vowels : " + textData.getNumberOfVowels()+"\n");
                System.out.println("4. Number of consonants : " + textData.getNumberOfConsonants()+"\n");
                System.out.println("5. Number of letters : " + textData.getNumberOfLetters()+"\n");
                System.out.println("6. Number of sentences : " + textData.getNumberOfSentences()+"\n");
                System.out.println("7. Longest word : " + textData.getLongestWord()+"\n");
            }catch (IOException e) {
                System.out.println("Error reading the file with path: " + filePath + " " + e.getMessage());
            }
        }

    }
}

