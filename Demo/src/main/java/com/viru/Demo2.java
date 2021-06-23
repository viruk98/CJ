package com.viru;

class Demo2 {
    public static void main(String[] args) {
        System.out.println("main, "); 
        m1();
    }
    
   static void m1(){
        System.out.println(" m1  ;"); 
        main(new String[1]);
   }
}