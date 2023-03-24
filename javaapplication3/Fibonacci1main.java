
package javaapplication3;

import java.util.Scanner;
import static javaapplication3.Fibonacci1.fibonacci;

public class Fibonacci1main {
    
     public static void main(String[] args) {

         Fibonacci1 s1=new Fibonacci1();
         Fibonacci1 s2=new Fibonacci1();
         s1.fibonacci(5);
         s2.fibonacci(15);
         
      Scanner klavye=new Scanner(System.in);//kullanıcıdan değer almak için 
        System.out.println("Fibonacci degerini bulmak istediginiz degeri giriniz:");
        int Fibonacci2=klavye.nextInt();
        
        System.out.println(fibonacci(Fibonacci2)); //girilen değerin fibonaccisini yazdıracak 
} 
}
