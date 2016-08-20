/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author skripa
 */
public class Filehand {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Java Study Material\\QRCODE\\Abc.txt");
        FileOutputStream fs = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fs);
        String str= "hii>>>>>>>>>>><<<<<<<<<<<<<<<<<";
        dos.writeUTF(str);
        
        FileInputStream fin = new FileInputStream(f);
        DataInputStream din = new DataInputStream(fin);
        String str1 = din.readUTF();
        System.out.println(str1);
    }
   
}
