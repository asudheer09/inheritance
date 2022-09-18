package com.example;

class A{
    int i,j;//0

    public void printAData(){
        System.out.println("A-s method");
    }
    A(int i,int j){
       this.i=i;//this.i=10;
        this.j=j;
        System.out.println("A-s parameterized constructor");
    }
    A(){
        System.out.println("A-s default constructor");
    }
}

class B extends  A{
    int i,j;
    B(){
        super(10,20);
        System.out.println("B-s default constructor");
    }

    B(int i, int j){
        super(10,20);
        this.i=i;
        this.j=j;                 // A.i      A.j
        System.out.println("A - "+super.i+" "+super.j);
        System.out.println("B - "+this.i+" "+this.j);
    }

    public void printBData(){
        System.out.println("B-s method");
    }
}

public class single {

    public static void main(String[] args) {
        B b= new B(30,40);
        b.printAData();
        System.out.println(b.i);
        System.out.println(b.j);
        //System.out.println(b.super.i);
        //System.out.println(b.super.j);
        b.printBData();
    }
}
