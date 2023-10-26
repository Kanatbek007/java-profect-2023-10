package src;

import static java.lang.Math.abs;
public class Test {
 
static double f(float x){
    double f;
    return f = Math.cos(x) - Math.sqrt(x);
}
 
public static void main(){
    
    float a,b,x = 0,c, eps = 0.00001f ;
    System.out.println("Найти корень уравнения cos(x)-sqrt(x)=0 на интервале [0;1] при eps=0.00001");
    System.out.println();
    System.out.println("Метод дихотомии: ");
    
    a = 0;
    b = 1;
    
    while ( abs(a-b) > eps) {
        c = (a+b)/2;
        if (f(a) * f(c)<= 0) b = c;
        else
        {
        a = c;
        x = (a+b)/2;
        }
    }
        
    System.out.println("x = " + x + " f(x) = " + f(x));
    
        
    }
 
}