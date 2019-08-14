package com.RobinBailey;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1,1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("dog.eat called");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("dog.chew called");
    }

    public void walk(){
        System.out.println("dog.walk called");
        move(5);
    }

    public void run(){
        System.out.println("dog.run called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("dog.moveLegs called");
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
