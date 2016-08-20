/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author skripa
 */
public class Inherit {
    
    public static void main(String[] args) {
//        B ref =new B();
//        ref.num1=7;
//        ref.num2=8;
//        System.out.println(ref.sub());
//        A obj =new A();
//        obj.m1();
//        System.out.println(obj.i);
        B obj = new B(5);
    }
}

class A {
    //int i;
    public A(){
        System.out.println("default cons A");
    }
    public A(int a){
        System.out.println("first const of A");
    }
//    public void m1(){
//        this.i=10;
//    }
//    int num1,num2,result;
//    int add(){
//////       return result=num1+num2;
//    }
}

class B extends A {
    public B(){
        System.out.println("default const of B");
    }
    public B(int a){
        super(a);
        System.out.println("first const of B");
    }
//     int sub (){
//        return result = num1-num2;
//     }
    
}