package com.arijit.aa;

public class NoFinalConstructor {

    public NoFinalConstructor(){
        System.out.println("Default constructor called");
    }

    // We cannot make a constructor final. But why?
    // Ans: constructors cannot be inherited in Java therefore you cannot override constructors
    public /*final*/ NoFinalConstructor(String var){
        System.out.println(" Constructor overloaded: " + var);
    }


}
