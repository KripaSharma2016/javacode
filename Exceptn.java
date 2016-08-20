/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skripa
 */
public class Exceptn {
    public static void main(String[] args) {
        int i=5;
        try {
            if (i<10){
                throw new KripaException("Error");
            }
        } catch(Exception e){
            System.out.println(e);
        }
   
    }
    
}
class KripaException extends Exception {

    public KripaException(String msg) {
        super(msg);
    }
    
}
