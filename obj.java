/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author skripa
 */
public class obj {
    int [] a;
    public static void main(String[] args) {
       int [] b = {1,2,4,6,7};
       int [] c = {1,2,4,6,7};
       if(Arrays.equals(b, c))
            System.out.println("hi");
     Date obj = new Date();
        System.out.println(obj.toString());
        int [] a=new int[0];
        try
        {
        System.out.println(a[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("element is not there");
        }
    }
    
    
}
