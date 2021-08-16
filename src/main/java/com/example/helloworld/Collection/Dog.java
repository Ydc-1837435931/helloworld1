package com.example.helloworld.Collection;

public class Dog {
    String name;
    Dog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
    String getObjectAddress(){
        return super.toString();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("hello");
        try {
            System.out.println(dog.getObjectAddress());
            System.out.println(dog.hashCode());
            System.out.println(dog);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
