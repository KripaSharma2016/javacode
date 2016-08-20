/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.lang.*;
import java.util.*;

/**
 *
 * @author skripa
 */
public class Exersice { 
    int math1(){
        return (0+15)/2;
    }
    void math2(){
        System.out.println(true && false || true && true);
        System.out.println((1+2.236)/2);
        System.out.println(1+2+3+4.0);
        System.out.println(4.1>=4);
        System.out.println(1+2+"3");
        /*int sum =0;
        for(int i=1;i<1000;i++)
            for(int j=0; j<i; j++) {
                sum++;
                System.out.println(j);
            }
        System.out.println(sum);
                */
        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println('a'+4);
        System.out.println((char)('a'+4));
        String s="";
        for(int n=10;n>0;n/=2){
            s=(n%2)+s;
            System.out.println(s);
        }
        int [] a=new int[10];
        for(int i=0;i<10;i++) {
            a[i]=i+1;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Exersice obj =new Exersice();
        System.out.println(obj.math1());
        obj.math2();
        /*int f=0;
        int g=1;
        for(int i=0; i<=15;i++) {
            System.out.println(f);
            f=f+g;
            g=f-g;
        }*/
    }
}

class TransposeMatrix {
    public static void main(String[] args) {
        int m,n,a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        m=in.nextInt();
        n=in.nextInt();
        
        int [][] arr1= new int[m][n];
        System.out.println("Enter the alements");
        for(a=0;a<m;a++)
            for(b=0;b<n;b++)
                arr1[a][b]=in.nextInt();
        
        int [][] trans = new int[n][m];
        
        for(int i=0; i<n;i++)
            for(int j=0;j<m;j++)
                trans[i][j]=arr1[j][i];
        System.out.println("Transpose Matrix is");
        for(int i=0; i<n;i++) {
            for(int j=0;j<m;j++)
                System.out.println(trans[i][j]+"\t");
            System.out.println("\n");
        }
    }
}

class OtherEx{
    public static String exR1(int n) {
        if(n<=0) return "";
        return exR1(n-3)+n+exR1(n-2)+n;
    }
    public  static int method2(int a,int b){
        if(b==0) return 0;
        if(b%2==0) return method2(a+a, b/2);
        return method2(a+a, b/2)+a;
    }
    public static void main(String[] args) {
        //System.out.println(exR1(6));
        //System.out.println(method2(3, 11));
        for(int i=0;i<10;i++){
            System.out.println("N="+fabonacci(i));
        }
    }
    public static long fabonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fabonacci(n-1)+fabonacci(n-2);
    }
}


class Tuesday {
    Tuesday(){
        System.out.println("kripa");
    }
    
    static double fact(int n) {
        
     if (n <0) {
         System.out.println("Please, enter positive number");
     } 
     if(n==0) {
        return 1;
    }
     return n*fact(n-1);
    }
    public static void main(String[] args) {
        //System.out.println(fact(1000));
        checkFinal(70, 80);
        args(1,2,3,4);
    }
    static void checkFinal(int a, final int b){
        a=90;
        //b=70;
        Tuesday obj = new Tuesday();
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    static void args(int ... a){
        System.out.println("args"+Arrays.toString(a));
        int n=a.length-1;
        for(int i=0;i<=n;i++){
            System.out.println(a[i]);
        }
    }
}

class SuperShape{
    public void showShape(){
        System.out.println("hi-this is super class");
    }
}

class SubShape extends SuperShape{
    public void method1(){
        System.out.println("hi- this is sub class");
    }
}
class Sub_SubShape extends SuperShape{
    public void method2(){
        System.out.println("this -------------------");
    }
    public static void display(SuperShape shape){
        shape.showShape();
    }
     public static void main(String[] args) {
        SubShape obj = new SubShape();
        Sub_SubShape obj1= new Sub_SubShape();
        SuperShape shape = new SubShape();
         display(obj);
         display(obj1);
         display(shape);
    }
     
class Animal {
    public void eat (){
        System.out.println("Animal class");
    }
}
}

class UsingToString {
    public static void main(String[] args) {
        UsingToString obj = new UsingToString();
        //System.out.println(obj); // program.UsingToString@2a139a55
        Kripa obj1=new Kripa("kripa", "bsr");
        System.out.println(obj1);
        obj1.add(19);
    }
}
class Kripa{
    String name;
    String city;
    int age =90;
    private int getVal;
    public Kripa(int val){
        getVal=val;    
    }
    public int getValue(){
        return getVal;
    }
    public Kripa( String name,String city) {
        this.name=name;
        this.city=city;
    }
    @Override
    public String toString(){
        return "hy i am "+name+" living in  "+city;
    }
    public void add(int age){
        this.age+=age;
        System.out.println(this.age);
    }
    
    @Override
    public boolean equals(Object o){
        //if ((o instanceof Kripa) && (((Kripa)o).getValue)==)
    return false;    
    }
}
class Moof {
private int moofValue;
Moof(int val) {
moofValue = val;
}
public int getMoofValue() {
return moofValue;
}
public boolean equals(Object o) {
if ((o instanceof Moof) && (((Moof)o).getMoofValue()== this.moofValue)) {
return true;
} else {
return false;
}
}
}

class UsinEquals {
    public static void main(String[] args) {
        Moof ref1 = new Moof(8);
        Moof ref2 = new Moof(8);
        if((ref1 instanceof Moof) == (ref2 instanceof Moof)) {
            System.out.println("both ref are equals");
        }
        if (ref1.equals(ref2)){
            System.out.println("using equals method");
        }
    }
}

// Collection >>>>>>>>>>>>>>>>>>>>>>>>>>.............................
class MyCollections{
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("one");
        obj.add("two");
        obj.add("three");
        System.out.println(obj.contains("two"));
        System.out.println(obj.indexOf("one"));
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        System.out.println(obj.remove("four"));
        Collections.sort(obj);
        System.out.println(obj);
        
    }
    
}

// searching -------- Array and collection
class SearchArray{
    public static void main(String[] args) {
        String [] arr = {"kk","jss","ghggs","hello","rn" };
        Arrays.sort(arr);
        for(String s:arr)
            System.out.println(s+" ");
            System.out.println("\none="+Arrays.binarySearch(arr, "hello"));
        Compare_1 cmpare_arr = new Compare_1();
        Arrays.sort(arr, cmpare_arr);
        System.out.println(Arrays.binarySearch(arr, "dd", cmpare_arr));
    }
}
class  Compare_1 implements Comparator<String> {
    @Override
    public int compare(String a, String b){
        return a.compareTo(b);
    }
}
//List to Array or vice varsa
class ListToArray {
    public static void main(String[] args) {
        String [] arr = { "dd","bsr","blr","del"};
        List ls = Arrays.asList(arr);
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
        ArrayList<Integer> ls1=new ArrayList<Integer>();
        for(int i=1; i<=8 ; i++)
            ls1.add(i);
        int [] a = new int [9];
        usingIterator();
        usingHasSet();
        System.out.println("========================");
        usingMap();
        //a=ls1.toArray(a);
    }
    static void usingIterator() {
        ArrayList ls=new ArrayList();
        ls.add("k");
        ls.add(11);
        ls.add('a');
        ls.add(1.5f);
        Iterator it =ls.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    static void usingHasSet(){
        //Set<String> s= new HashSet<String>();
        Set<String> s=new TreeSet<>();
        s.add("kripa");
        s.add("ayushi");
        s.add("vipul");
        s.add("kripa");
        Iterator it =s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    static void usingMap(){
        Map m = new HashMap();
        m.put(1, "kripa");
        m.put(2, new Dog("kapil"));
        m.put(new Dog("kk"),"bsr");
        System.out.println(m.get(1));
        System.out.println(m.get(2));
        System.out.println(m.getClass());
        System.out.println(m.get(new Dog("kk")));
        System.out.println(m);
    }
}
class Dog {
    public String name;
    public Dog(String name){
        this.name=name;
    }
    @Override
    public boolean equals(Object o){
        if ((o instanceof Dog) && (((Dog)o).name == name )){
            return true;
        } else {
            return false;
        }
    }
   public int hashCode(){
     return name.length();
   }
}
class UsingArray {
    String name;
    public UsingArray(String name) {
    this.name=name;
    }
    @Override
    public int hashCode(){
        return name.length();
    }
    @Override
    public boolean equals(Object o){
        if((o instanceof UsingArray) && (((UsingArray)o).name==name)){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        UsingArray [] arr=new UsingArray[5];
        for(int i =0;i<=arr.length-1;i++){
            String s = "kripa"+ i;
            arr[i]= new UsingArray(s);
            System.out.println(arr[i]);
        }
    }
}
// static block 
class UsingStatic {
    static {
        System.out.println("first static");
    }
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("second static");
    }
    {
        System.out.println("instance second block");
    }
    public static void main(String[] args) {
        new UsingStatic();
        new UsingStatic();
        new UsingStatic();
        new UsingStatic();
        new UsingStatic();
    }
}

class UsingGc{
    public static void main(String[] args) {
        Runtime rt =Runtime.getRuntime();
        Date d=null;
        System.out.println("JVM memory"+rt.totalMemory());
        System.out.println("free memory"+rt.freeMemory());
        for(int i=0;i<1000;i++){
            d =new Date();
            d=null;
        }
        System.out.println("befor GC"+rt.freeMemory());
        System.gc();
        System.out.println("after GC"+rt.freeMemory());
    }
}
class CardBoard {
Short story = 200;
CardBoard go(CardBoard cb) {
cb = null;
return cb;
}
public static void main(String[] args) {
CardBoard c1 = new CardBoard();
CardBoard c2 = new CardBoard();
CardBoard c3 = c1.go(c2);
c1 = null;
// do Stuff
} }
class Alien {
String invade(short ships) { return "a few"; }
String invade(short... ships) { return "many"; }
}
class Defender {
public static void main(String [] args) {
    Alien obj = new Alien();
//System.out.println(obj.invade(7));
}
}
class UsingOprator{
    public static void main(String[] args) {
        int x=5;
        int y = ++x;
        System.out.println(y);
        System.out.println(x);
        //System.out.println(x++);
        //System.out.println(++x);
        //System.out.println(z);
    }
}


