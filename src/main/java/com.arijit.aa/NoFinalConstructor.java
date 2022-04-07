package com.arijit.aa;

public class NoFinalConstructor {

    public NoFinalConstructor(){
        System.out.println("Default constructor called");
    }

    // We cannot make a constructor final. But why?
    public final NoFinalConstructor(String var){
        System.out.println(" Constructor overloaded: " + var);
    }


}
