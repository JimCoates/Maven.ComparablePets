package io.zipcoder;

public class Dog extends Pet{
    String name;
    String type;

    public Dog (){
        this.name = "random doggo";
    }

    @Override
    public String speak(){
        return "Bark";
    }

    public Dog (String name){
        this.name = name;
        this.type = "Dog";
    }

    public String getName() {
        return this.name;
    }

    public String getType(){
        return this.type;
    }

}
