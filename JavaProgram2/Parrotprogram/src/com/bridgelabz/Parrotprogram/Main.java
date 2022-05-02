package com.bridgelabz.Parrotprogram;

import java.util.Date;

public class Main {
    byte a = 10;
    short b = 20;
    int c = 30;
    long d = 40;
    float e = 50.25f;
    double f = 60.50;
    boolean g = true;
    char h = 'a';

    static String i = "Hello";
    Byte j = 70;
    Short k = 80;
    Integer l = 90;
    Long m = 100l;
    Float n = 110.10f;
    Double o = 120.68;
    Boolean p = false;
    Character q = 'R';

    Date r = new Date();
  

    Date[] t; //Array

    static final float PI = 3.14f; //write constants in Capitals

    public static void main(String[] args)
    {
        System.out.println("Welcome to JAVA Fundamentals");

        Main m = new Main();
        int sum = m.add(10,20);
        System.out.println(sum);

        Parrot parrot1 = new Parrot();
        parrot1.name = "Green Parrot";
        parrot1.colour = "Green";
        parrot1.species = "Bird";
        

        parrot1.fly();
        parrot1.swim();
        
       
        

        Parrot parrot2 = new Parrot();
        System.out.println(Parrot.name + " " + Parrot.name);
        parrot2.name = "White Parrot";
        parrot2.colour = "White";
        parrot2.species = "Bird";
        

        parrot2.fly();
        parrot2.swim();

        System.out.println(Parrot.name + " " + Parrot.name + " " + Parrot.name);

        Math math = new Math();
        int x = math.add(10, 20);
        int y = math.minus(10, 5);
        int z = math.multiply(5, 2);
        int c = math.divide(10, 5);

        System.out.println("X = " + x + ", Y = " + y + ", Z = " + z + ", C = " + c);

        System.out.println(m.a);
    }
    int add(int a, int b) {
        return a + b;
    }

    void display(){
        Main m2 = new Main();
        add(10,20);
        m2.add(20, 40);
    }
}

public class Parrot {
    static String name;
    protected String colour;
    String species;

    public Parrot() {
		// TODO Auto-generated constructor stub
	}

	void fly() {
        System.out.println("Parrot can fly.");
        
    }

    void swim() {
        System.out.println("Parrot cannot swim.");
    }        
        
}





