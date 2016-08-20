/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.Serializable;
import java.rmi.Remote;

/**
 *
 * @author skripa
 */
public class Encap implements Serializable,Remote{ // marker interface
    public static void main(String[] args) {
        Emp obj =new Emp();
        Emp obj1 =new Emp();
        Emp obj2 =new Emp();
        Emp obj3 =new Emp();
        obj.setEmpId(3);
        obj.setEmpName("kripa");
       // obj.empId=50;
        System.out.println(obj.getClass());
        System.out.println(obj.getEmpId());
        System.out.println(obj.getEmpName());
    }
    
}
class Emp {
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int id) {
        empId = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    
}
