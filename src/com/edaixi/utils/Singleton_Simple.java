package com.edaixi.utils;

public class Singleton_Simple {  
    
    private static final Singleton_Simple simple = new Singleton_Simple();  
      
    private Singleton_Simple(){}  
      
    public static Singleton_Simple getInstance(){  
        return simple;  
    }  
  
} 