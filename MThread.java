/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skripa
 */
public class MThread {
//    public static void main(String[] args) throws InterruptedException {
////        Abc obj =new Abc();
////        Xyz obj1=new Xyz();
////        obj.start();
////        obj1.start();
//        
//    }
    
//}
//class Abc extends Thread{
//    @Override
//    public void run(){
//        System.out.println(Thread.currentThread().getPriority());
//       show(); 
//        System.out.println(Thread.currentThread().getName());
//    }
//    public void show(){
//        for(int i=0;i<10;i++){
//        System.out.println("Abc");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Abc.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//}
//
//class Xyz extends Thread{
//    @Override
//    public void run(){
//        System.out.println(Thread.currentThread().getPriority());
//        show();
//        System.out.println(Thread.currentThread().getName());
//    }
//    public void show(){
//        for(int i=0;i<10;i++){
//        System.out.println("Xyz");
//        try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Abc.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
    public static void main(String[] args) {
//        B_ obj =new B_();
//        Runnable r=new Runnable() // inner class concept with multithreading
//        {
//            public void run(){
//                System.out.println("hello");
//            }
//        };
        Thread t1=new Thread(new Runnable() // inner class concept with multithreading
        {
            public void run(){
                System.out.println("hello");
            }
        });
        t1.start();
    }
}
class A_{
    
}
class B_ extends A_  implements Runnable{
    public void run(){
        for(int i=0;i<10;i++)
        System.out.println("kripa");
    }
}