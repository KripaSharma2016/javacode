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
public class Practice {
    
    public static void main(String[] args) throws Exception{
        // by default it will take double size 8 byte
        // double a=4.5;
        // double b=6.5;
        //float a=4.5f;
        //float b=6.5f;
        //char x='a';
        //System.out.println(a+b);
        //System.out.println((int)x);
        //System.out.println((char)123);
        //Naming conversion Interface,Class,method,variable,CONSTANT
        /*int a =0b10101010_00_11;
        System.out.println(a);
        */
        //int i =9;
        //int j=i+++i+++i;
        /*int i=5;
        int j=++i+++i;
        System.out.println(i);
        */
        /*int i =9;
        i=++i;
        System.out.println(i);
        */
        /*int a=90;
        if (a%2==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        
        int i=7,j=9,k=12;
        if (i >j && i>k)
            System.out.println("i");
        else if(j>k)
            System.out.println("j");
        else
            System.out.println("k");
        
        //Object obj;
        if(System.out.printf("hello")==null){
            
        }
        int i=1;
        switch(i)
        {
            case 1:
                System.out.println("hi");
                break;
            case 9:
                System.out.println("hello");
                break;
            default:
                System.out.println("bye");
        }
                
        kripa:
        for(int i =0 ; i<=4; i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
                
        int x =System.in.read();
        System.out.println(x);
        Scanner obj = new Scanner(System.in);
        System.gc();
        
    int[] arr ={1,2,3,4};
        System.out.println(arr.length);
        for(Object i :arr){
            System.out.println(i);
        }
               
     int [][][] a =new int[4][4][4];
     for(int i =0; i<4;i++){
         for(int j=0; j<4;j++){
             for(int k=0;k<4;k++){
                 a[i][j][k]=k;
             }
         }
        }
     kripa:
     for(int i =0; i<4;i++){
         for(int j=0; j<4;j++){
             for(int k=0;k<4;k++){
                 if(k==1){
                 System.out.println(a[i][j][k]);
                 break kripa;
                 }
             }
         }
        }*/
        for (int i =1;i<=4;i++)
        {
            for(int j=i;j<=i+3;j++)
            {
                    System.out.print(j);
            }
        System.out.println();
        }
    }
    
}    
    

