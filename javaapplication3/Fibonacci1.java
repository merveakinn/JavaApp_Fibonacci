
 package javaapplication3;

import java.util.Scanner;

public class Fibonacci1 { //iteratif
    
   static int fibonacci(int n) {
  if(n<=0)  return 0;   //0 dan küçük sayı giirlirse 0 döndürecek
int fibn2 =1, fibn1=0,fibn;//fibonacci(1) değeri 0,fibonacci(2)değeri de 1

for(int i=3;i<=n;i++) {
}     //1 ve 2 dışında 3 ten büyük değerler girildiğinde 

if(n==1){   //eğer girilen değer 1 ise 
return fibn1; //fibonacci(1) i döndürecek
}  
else if(n==2)  {    //eğer girilen değer 2 ise
    return fibn2;   //fibonacci(2) yi döndürecek
}   
else {    //değer farklı girilirse içerdeki denklemi uygulayıp döndürecek
    return fibonacci(n-1)+fibonacci(n-2);//return denklemin bittiği anlamında
}
   } }












 


