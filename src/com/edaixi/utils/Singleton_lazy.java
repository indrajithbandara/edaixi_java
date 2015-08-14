package com.edaixi.utils;

public class Singleton_lazy {  
	  
    private static Singleton_lazy lazy = null;  
      
    private Singleton_lazy(){}  
      
    public static synchronized Singleton_lazy getInstance(){  
        if( lazy == null ){  
            lazy = new Singleton_lazy();  
        }  
        return lazy;  
    }  
}