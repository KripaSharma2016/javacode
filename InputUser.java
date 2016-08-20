/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author skripa
 */
public class InputUser {
        static void usingBufferedReader() throws IOException{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            String str=obj.readLine();
            System.out.println(str);
        }
        public static void main(String[] args) throws IOException {
        usingBufferedReader();
    }
}
