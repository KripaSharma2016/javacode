/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Scanner;

/**
 *
 * @author skripa
 */
public class Str {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        String str1,str2;
        str1=obj.nextLine();
        System.out.println("enter next string");
        str2=obj.nextLine();
        String str3=str1.concat(str2);
        
        System.out.println(str1+str2);
    }
    
}
