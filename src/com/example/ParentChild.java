package com.example;

class Father{
    int i=10;
    void printFatherDetails(){
        System.out.println("Father method: "+i);

    }
}

class Son extends Father{
    int j=20;
    void printSonDetails(){
        System.out.println("son method: "+j);
    }

    void printFatherDetails(){
        System.out.println("Father method: Iam calling from son "+i);

    }

}
public class ParentChild {
    public static void main(String[] args) {
        /*Son son= new Son();
        System.out.println(son.i);
        System.out.println(son.j);
        son.printSonDetails();
        son.printFatherDetails();*/

        /*Father f= new Father();
        System.out.println(f.i);
        f.printFatherDetails();*/

        Father f= new Son();
        System.out.println(f.i); //10
        f.printFatherDetails(); // Father method 10



    }

}
