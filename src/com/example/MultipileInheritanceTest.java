package com.example;

class P{
    void method1(){
        System.out.println("m1 from A");
    }
}

class Q{
    void method1(){
        System.out.println("m1 from A");
    }
}

/*class R extends P,Q{ // Class cannot extend multiple classes

}*/


public class MultipileInheritanceTest {
    public static void main(String[] args) {
       // R r= new R();
       // r.method1();
    }
}
