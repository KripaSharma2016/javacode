/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.lang.reflect.Method;

/**
 *
 * @author skripa
 */
public class Reflaction {
    public static void main(String[] args) throws Exception{
//        Test obj =new Test();
//        obj.show();
        Class c = Class.forName("program.Test");
        Test obj = (Test)c.newInstance();
        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(obj,null);
//        Test obj =new Test();
//        System.out.println(obj);
        
    }
    
}

class Test {
    private void show(){
        System.out.println("helloo india.............");
    }
    
}
