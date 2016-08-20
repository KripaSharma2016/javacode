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
public class Singaltn{
    public static void main(String[] args) {
        Singltn obj=Singltn.getInstance();
        Singltn obj1=Singltn.getInstance();
        System.out.println(obj);
        System.out.println(obj1);
    }
    
}
class Singltn{
private static Singltn ref;
    private Singltn(){
        
    }
    public static Singltn getInstance(){
        if(ref==null){
            ref=new Singltn();
            System.out.println("objecct has been created...");
        } else {
            System.out.println("only one object you can create......");
        }
    return ref;    
    }
}