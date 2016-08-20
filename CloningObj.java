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
public class CloningObj implements Cloneable{
    int i,j;

    @Override
    public String toString() {
        return "CloningObj{" + "i=" + i + ", j=" + j + '}';
    }
    
    @Override
    public Object clone () throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        CloningObj obj = new CloningObj();
        obj.i=8;
        obj.j=13;
        //System.out.println(obj);
        //CloningObj obj1=obj;  >>>>>>>>>> shallow copy
        //System.out.println(obj1);
        
        // deep copy
//        CloningObj obj1 = new CloningObj();
//        obj1.i=obj.i;
//        obj1.j=obj.j;
//        System.out.println(obj1);
        
        // cloning 
        CloningObj obj1 = (CloningObj)obj.clone();
        obj1.i=4;
        System.out.println(obj);
        System.out.println(obj1);
        
    }
}
