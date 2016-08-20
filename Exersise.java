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
public class Exersise {
    static void printPrime(){
        //boolean flag=true;
        for(int n=1;n<=100;n++){
            int count=0;
            for(int i=n;i>0;i--){
                
            if(n%i==0){
                count = count +1;
                //System.out.println("count is" + count);
            }}
            if (count==2){
                System.out.print(" " +n);
            }
        }
        
    }
    static void fabonacci(){
        int n1=1,n2=1,n3=0;
        System.out.print( n1 + " "+n2);
        while(n3<100) {
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
    }
    }
    public static void main(String[] args) {
        System.out.println("prime numbers are");
        printPrime();
//        System.out.println(" ");
//        System.out.println("fab series is");
//        fabonacci();
    }
}
