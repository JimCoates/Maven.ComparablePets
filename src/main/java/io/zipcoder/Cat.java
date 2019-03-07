package io.zipcoder;

public class Cat extends Pet {
    String name;
    String type;

    public Cat (){
        this.name = "random cat";
    }

    @Override
    public String speak(){
        return "Meow";
    }

    public Cat (String name){
        this.name = name;
        this.type = "Cat";
    }

    public String getName() {
        return this.name;
    }

    public String getType(){
        return this.type;
    }
}
