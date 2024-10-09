package oop.practice;

import java.util.ArrayList;

public class IndividualTraits {

    //characteristics variables
    private int id;
    private boolean isHumanoid;
    private String planet;
    private int age;
    private ArrayList<String> traits;


    //null constructor
    public IndividualTraits() {
        this.id = 0;
        this.isHumanoid = false;
        this.planet = null;
        this.age = 0;
        this.traits = new ArrayList<>();
    }


    //getters
    public int getId() {
        return id;
    }

    public boolean isHumanoid() {
        return isHumanoid;
    }

    public String getPlanet(){
        return planet;
    }

    public int getAge(){
        return age;
    }

    public ArrayList<String> getTraits(){
        return traits;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setHumanoid(boolean isHumanoid) {
        this.isHumanoid = isHumanoid;
    }

    public void setPlanet(String planet){
        this.planet = planet;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setTraits(ArrayList<String> traits){
        this.traits = traits;
    }
}
