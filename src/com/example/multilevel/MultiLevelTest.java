package com.example.multilevel;

class X{
    int i;

    X(int i){
        this.i=i;
        System.out.println(" X -object created");
    }


    void printXData(){
        System.out.println(i);
    }
}
class Y extends X{
    int j;
    Y(int i,int j){
        super(i); //super(1)
        this.j=j;
        System.out.println(" Y-object created");
    }
    void printYData(){
        System.out.println(j);
    }
}
class Z extends Y{
    int k;
    Z(int i,int j,int k){
        super(i,j); //super(1,2)
        this.k=k;
        System.out.println(" Z -object created");
    }
    void printZData(){
        System.out.println(k);
    }
}

public class MultiLevelTest{
    public static void main(String[] args) {
        Z z= new Z(1,2,3);
        z.printXData();
        z.printYData();
        z.printZData();
        System.out.println("================");
        Y y= new Y(10,20);
        y.printXData();
        y.printYData();
        System.out.println("================");
        X x= new X(30);
        x.printXData();
    }

}


