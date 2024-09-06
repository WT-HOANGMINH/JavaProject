
package lec8;


public class invoke {
    
    public static void m(){
        System.out.println("method's invoked "); 
    }
    public static void n()
    {
        invoke.m(); // call (invoked) m
    }
    public static void p()
    {
        n(); // has be invoked
    }
    public static void main(String[] args) {
        invoke a = new invoke();
        a.p();
    }
    
}
