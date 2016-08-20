/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.util.Arrays;

/**
 *
 * @author skripa
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

// Program for finding the duplicate value in array

class Duplicate {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,2,4,2,1,7,8,9 };
        int [] arr1;
        Arrays.sort(arr);
        for (int i=1; i< arr.length; i++) {
            if (arr[i]==arr[i-1]) {
                System.out.println("duplicate value is"+arr[i]);
            }
        }
    }
}

class Duplicate_1 {
    static int [] arr = new int [] {1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
    public static void main(String[] args) {
        int num = arr[0];
        //boolean val = false;
        for(int i=0; i< arr.length; i++ ) {
            if (num == arr[i] ) {
                //val = true;
            } else if (num != arr[i]) {
                System.out.println(num);
                num = arr[i];
                //val = false;
            }
        }
        
    }
}

// Find out middle index where sum of both ends are equal.

class MiddleIndex {
    static int middleIndex (int [] arr){
        int startIndex=0;
        int endIndex=arr.length-1;
        int leftSum=0;
        int rightSum=0;
        while(true) {
            if ( leftSum > rightSum ) {
                rightSum += arr[endIndex--];
            }
            else {
                leftSum +=arr[startIndex++];
            }
            if ( startIndex > endIndex ) {
                if (leftSum == rightSum) {
                    break;
                } else {
                    System.out.println("Error: Please ENTER a valid array");
                }
            }
        }
        return endIndex;
    }
    public static void main(String[] args) {
        int [] arr = { 3,4,3,10 };
        int a =MiddleIndex.middleIndex(arr);
        System.out.println("middle index is "+a);
    }
}

/*
----------------------------- Singalton Class -------------------------------------------
We can make constructor as private. So that We can not create an object outside of the class.
This property is useful to create singleton class in java.
Singleton pattern helps us to keep only one instance of a class at any time.
The purpose of singleton is to control object creation by keeping private constructor.
*/

class Singalton {
    private static Singalton ref;
    private Singalton(){
        
    }
    
    static Singalton getInstance () {
        if(ref==null) {
             ref = new Singalton();
              }
    return ref;
    }
    
    void method() {
        System.out.println("---------------hi-----------");
    }
    public static void main(String[] args) {
        Singalton obj = Singalton.getInstance();
        Singalton obj1 = Singalton.getInstance();
        obj1.method();
        obj.method();
    }
}

// String reverse 
/*
 import java.io.FileNotFoundException;
import java.io.IOException;

/**
*
*@author Javin
/
public class StringReverseExample {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

        //iterative method to reverse String in Java
        reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

        //recursive method to reverse String in Java
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}
*/

class ArrayOp {
    void copyArray(int [] a ,int n) {
        int [] b= new int[n];
        for(int i =0;i<=a.length-1;i++){
            b[i]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
    
    void reverseArray(int []a , int n){
        int tmp;
        for(int i=0;i<n/2;i++){
            tmp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=tmp; 
        }
        System.out.println(Arrays.toString(a));
    }
    void harmonic(int n){
        double sum=0;
        for(int i=1;i<=n;i++) {
            sum+=1.0/i;
        }
        System.out.println(sum);
    }
    int binarySearch(int key,int [] arr){
      int l0=0;
      int hi =arr.length-1;
      while(l0<=hi) {
          int mid = l0+(hi-l0)/2;
          if(key<arr[mid]) {
              hi=mid-1;
          } else if(key>arr[mid]) {
              l0=mid+1;
          } else {
              return mid;
          }
      }
       return -1; 
    }
    public static void main(String[] args) {
        ArrayOp obj = new ArrayOp();
        int [] a={1,2,3,4,5,6};
        int n =a.length;
        obj.copyArray(a,n);
        obj.reverseArray(a, n);
        obj.harmonic(2);
        if(obj.binarySearch(9, a)<0){
            System.out.println("key found in array");
        } else {
            System.out.println("Error: Key not found");
        }
    }
} 

// reverse a number
class ReverseNumber{
    int reverseNumber(int n){
        if(n==0){
            return 0;
        }
        int rev=0;
        while(n!=0){
            rev = (rev*10)+ (n%10);
            n = n/10;
        }
        return rev;
    }
    int convertDecimal(int n){
        if(n==0){
            return 0;
        }
        int [] arr=new int[25];
        int i =0;
        while(n>0){
            arr[i++]=n%10;
            n=n/10;
        }
        for(i=n-1;i>=0;i--) {
            System.out.println(arr[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        //System.out.println(obj.reverseNumber(45632));
        obj.convertDecimal(10);
    }
}
enum TakeTea { LARGE, MEDIUM, SMALL }
class UsingEnum{
    enum FistEnum {FIRST,SECOND,THIRD}
    TakeTea ref;
    public static void main(String[] args) {
        UsingEnum obj = new UsingEnum();
        System.out.println(obj.ref=TakeTea.LARGE);
    }
}

class UsingEnum_1{
    UsingEnum.FistEnum ref;
}

class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,2,6,4,6,7,8,9};
        bubbleSort(arr);
    }
    public static void bubbleSort(int [] arr){
        int num = arr.length;
        int k;
        for(int m=num;m>=0;m--){
            for(int i=0;i<num-1;i++){
                k=i+1;
                if(arr[i]>arr[k])
                    swapNumber(i,k,arr);
            }
        }
        printArray(arr);
    }
    static void swapNumber(int i,int j,int[] arr){
        int tmp;
        tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    static void printArray(int [] arr){
        for(int i=0;i<=arr.length-1;i++)
            System.out.println(arr[i]);
    }
}

class SelectionSort{
    public static void main(String[] args) {
        int [] arr = new int[] {6,3,1,6,7,8,3};
        int[] arr1=selectionSort(arr);
        printArray(arr1);
        
    }
    public static int[] selectionSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[index])
                    index=j;
            }
            int smallerNumber=arr[index];
            arr[index]=arr[i];
            arr[i]=smallerNumber;
        }
        return arr;
    }
    static void printArray(int[]arr){
    for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
    }
    }
}

class InsertionSort{
    public static void main(String[] args) {
        int [] arr ={2,3,4,1,5,7};
        int []arr1=insertionSort(arr);
        BubbleSort.printArray(arr1);
    }
    static int[] insertionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                 int tmp = arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=tmp;
                }
            }
        }
        return arr;
    }
}
class MergeSort{
    static int [] array;
    static int [] tmpArray;
    static int length;
    public static void main(String[] args) {
        int [] arr ={2,4,1,5,6,2,3,6};
        sort(arr);
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]);
        }
    }
    public static void sort(int [] arr){
        array=arr;
        length=arr.length;
        tmpArray= new int[length];
        doMergeSort(0,length-1);
    }
    public static void doMergeSort(int lindex,int hindex){
        
        if(lindex<hindex){
            int mid= (lindex+(hindex-lindex)/2);
            doMergeSort(lindex,mid);
            doMergeSort(mid+1, hindex);
            merging(lindex,mid,hindex);
        }
    }
    public static void merging(int lindex,int mid,int hindex){
        for(int i =0;i<=hindex;i++){
            tmpArray[i]=array[i];
        }
        int i=lindex;
        int j=mid+1;
        int k=lindex;
        while(i<=mid && j<=hindex){
            if(tmpArray[i]<=tmpArray[j]){
                array[k]=tmpArray[i];
                i++;
            } else{
                array[k]=tmpArray[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            array[k]=tmpArray[i];
            k++;
            i++;
        }
    }
}

class QiuckSort{
    private static int [] arr1;
    public static void main(String[] args) {
        int [] arr = {4,5,6,2,3,4,1,7,8,9};
        quickSort(arr);
        for(int i=0;i<arr1.length-1;i++){
            System.out.println(arr1[i]);
        }
    }
    public static void quickSort(int[] arr){
        if((arr==null) || arr.length==0)
            System.out.println("arrayis empty");
        arr1=arr;
        sort(0,arr.length-1);
    }
    public static void sort (int lindex,int hindex){
      int i =lindex;
      int j = hindex;
      int pivot = arr1[i+(j-i)/2];
      while(i<=j){
          while(arr1[i]<pivot){
              i++;
          }
          while(arr1[j]>pivot){
              j--;
          }
          if(i<=j){
              swapNumber(i,j);
              i++;
              j--;
          }
              
      }
      if(lindex<j)
          sort(lindex, j);
      if(i<hindex)
          sort(i, hindex);
    }
    public static void swapNumber(int i,int j){
        int temp = arr1[i];
        arr1[i]=arr1[j];
        arr1[j]=temp;
}
}