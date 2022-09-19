package com.example;
class Parent{
    int i,j;

    public Parent(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Child extends Parent{
    int k,l;

    public Child(int i, int j,int k, int l) {
        super(i, j);
        this.k=k;
        this.l=l;
    }

    @Override
    public String toString() {
        return "Child{" +
                "k=" + k +
                ", l=" + l +
                ", i=" + i +
                ", j=" + j +
                '}';
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        Child child= new Child(10,20,30,40);
        System.out.println(child);
    }
}
