package Lab1.Task2;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    //constructor
    public TextData(String text){
        this.fileName = "";
        this.text = text;
        this.numberOfVowels = 0;
        this.numberOfConsonants = 0;
        this.numberOfLetters = 0;
        this.numberOfSentences = 0;
        this.longestWord = "";
    }

    public void setFilename(String filename) {
        this.fileName = filename;
    }

    public String getFilename() {
        return fileName;
    }
    public String getText() {
        return text;
    }
    public int getNumberOfVowels() {
        if (text != null && !text.isEmpty()) {
            for (char c : text.toCharArray()) {
                //checks if character part of vowels
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    numberOfVowels++;
                }
            }
        }
        return numberOfVowels;
    }
    public int getNumberOfConsonants() {
        if (text != null && !text.isEmpty()) {
            for (char c : text.toCharArray()) {
                //checks if character is letter and if character is not part of vowels
                if (Character.isLetter(c) && "AEIOUaeiou".indexOf(c) == -1) {
                    numberOfConsonants++;
                }
            }
        }
        return numberOfConsonants;
    }
    public int getNumberOfLetters() {
        if (text != null && !text.isEmpty()) {
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    numberOfLetters++;
                }
            }
        }
        return numberOfLetters;
    }
    public int getNumberOfSentences() {
        if(text !=null && !text.isEmpty()){
            numberOfSentences = text.split("[.!?]+").length;
        }
        return numberOfSentences;
    }
    public String getLongestWord() {
        if(text !=null && !text.isEmpty()){
            String[] words = text.split("\\s+");
            for (String word : words) {
                //removes punctuation
                String noPunctuation = word.replaceAll("[^a-zA-Z]", "");
                if (noPunctuation.length() > longestWord.length()) {
                    longestWord = noPunctuation;
                }
            }
        }
        return longestWord;
    }
}
