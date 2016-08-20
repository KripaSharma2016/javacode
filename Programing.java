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
public class Programing {
    static int n1=1,n2=1,n3=0;
    static void fab(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" " +n3);
            fab(count-1);
        }
    }
        public static void main(String [] args){
            int count =50;
            System.out.print(n1 + " " +n2);
            fab(count-2);
        }
    }
    

