package com.arijit.aa;


public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        //Anonymous Inner class
        TemperatureConvertFunctionInterface intfaceA = new TemperatureConvertFunctionInterface(){

            @Override
            public Double concertTemperature(Double temp, String toScale) {

                if (("C").equalsIgnoreCase(toScale)){
                    return ((temp - 32)*5)/9;

                }else if (("F").equalsIgnoreCase(toScale)){
                    return ((temp/5)*9)+32;
                }else return null;
            }
        };

        System.out.println(intfaceA.concertTemperature(74.0, "C"));


        // Using Lambda expression
        TemperatureConvertFunctionInterface intfaceB = (Double a, String b) -> {
            if (("C").equalsIgnoreCase(b)){
                return ((a - 32)*5)/9;

            }else if (("F").equalsIgnoreCase(b)){
                return (((a*9.0)/5.0)+32.0);
            }else return null;
        };

        System.out.println(intfaceB.concertTemperature(32.0, "F"));
    }

}
