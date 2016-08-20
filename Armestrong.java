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
public class Armestrong {
    static int countDigit(int n){
        int count=0;
        System.out.println("...........");
        while(n>0){
            n=n/10;
            count++;   
        }
        System.out.println("count is "+ count);
        return count;
    }
    static int opration(int n, int count){
        int sum=0;
        int r=0;
        while(n>0){
            r=n%10;
            sum+=Math.pow(r, count);
            n=n/10;
        }
        System.out.println("sum...........is "+sum);
        return sum;
    }
    public static void main(String[] args) {
        int n=153;
        int count = countDigit(n);
        int sum=opration(n, count);
        if (sum==n){
            System.out.println("ammmmmmmm.....");
        } else {
            System.out.println("nooooooooooooo......");
        }
    }
    
}
