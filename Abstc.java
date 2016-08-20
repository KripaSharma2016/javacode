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
interface Intrf {
    void m1();

    public void m2();
    
}
public class Abstc implements Intrf{
    @Override
    public void m1(){
        System.out.println("implementing...........");
    }
    public void m2(){
        System.out.println("......pinging............");
    }
    public static void main(String[] args) {
        Intrf ref = new Abstc();
        ref.m1();
        ref.m2();
    }
}
