package com.edaixi.utils;

public class Singleton_DoubleKey {  
	  
    private static Singleton_DoubleKey doubleKey = null;  
      
    private Singleton_DoubleKey (){}  
      
    public static Singleton_DoubleKey getInstance(){  
        if( doubleKey == null ){    //①  
            synchronized(Singleton_DoubleKey.class){    //②  
                if( doubleKey == null ){    //③  
                    doubleKey = new Singleton_DoubleKey();  //④  
                }  
            }  
        }  
        return doubleKey;  
    }  
}  