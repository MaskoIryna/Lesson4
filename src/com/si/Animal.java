package com.si;

public class Animal {
    private String breed;
    private String color;
    private String nickname;


    public Animal(String breed, String color, String nickname){
        this.breed = breed;
        this.color = color;
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return  color;
    }
    public String getNickname() {
        return nickname;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public  void setColor(String color) {
        this.color = color;
    }
    public  void  setNickname(String nickname) {
        this.nickname = nickname;
    }
}
