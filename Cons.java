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
public class Cons {
    //private boolean f;
    public Cons(){
        System.out.println("default cons");
    }
    public Cons(int i){
    //static int i;
    float f=0;
    Cons obj =new Cons();
        System.out.println(f);
}
    static {
        System.out.println("kapil");
        System.out.println("kripa");
        for(int i =0; i<5 ;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        //System.out.println(i);
        Cons obj =new Cons();
        Cons obj1 = new Cons(8);
        //System.out.println(obj.f);
             
    
}
}
