package com.example;

class I{
    void m1(){
        System.out.println("from m1() of I ");
    }

}

class J extends I{
    void m2(){
        System.out.println("from m2() of J ");
    }
}

class K extends I{
    void m3(){
        System.out.println("from m3() of K ");
    }

}

public class HirarichalTest {

    public static void main(String[] args) {
        J j= new J();
        j.m1();
        j.m2();

        K k= new K();
        k.m1();
        k.m3();
    }
}
