package io.zipcoder;

public class Parrot extends Pet {
    String name;
    String type;

    public Parrot (){
        this.name = "random parrot";
    }

    @Override
    public String speak(){
        return "Hello";
    }

    public Parrot (String name){
        this.name = name;
        this.type = "Parrot";
    }

    public String getName() {
        return this.name;
    }

    public String getType(){
        return this.type;
    }
}
