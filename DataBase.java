/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.sql.*;
/**
 *
 * @author skripa
 */
public class DataBase {
    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","IOT","IOT");
            st=con.createStatement();
            rs=st.executeQuery("select sysdate from dual");
            while(rs.next()){
                String myDate=rs.getString(1);
                System.out.println(myDate);
            }
        } catch ( ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException sq) {
            System.out.println(sq);
        }
               
    }
}
