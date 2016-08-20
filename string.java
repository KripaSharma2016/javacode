/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author skripa
 */
public final class string {
    class Inner {
        void test(){
            if(string.this.flag);{
            sample();
        }
        }
    }
    private boolean flag=true;
    public void sample () {
        System.out.println("sample");
    }
    public string(){
        (new Inner()).test();
    }
    public static void main(String[] args) {
        new string();
    }
    
    
}
