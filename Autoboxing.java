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
public class Autoboxing {
    static void autoBoxing(){
        int i=9,j=10;
        Integer obj=new Integer(i);
        Integer obj1=new Integer(j);
        System.out.println(obj+obj1);
        //Integer ref=new Integer(null);
        int k=obj.intValue();
        System.out.println(k);
        String str = "k,t,r,e,e,s,s,a,s,s,r";
        str ="j,s";
        String [] names=str.split(",");
        try {
        System.out.println(names[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
       
    }
    public static void main(String[] args) {
        autoBoxing();
    }
    
}
