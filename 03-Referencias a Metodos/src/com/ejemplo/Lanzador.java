package com.ejemplo;

import java.util.function.Function;

public class Lanzador {
	
	public static void main(String[] args) {
		
		Function<Double, Double> square = Hey::square;
		
		double ans = square.apply(23.23d);
		
		System.out.println(ans);
	}

}

class Hey{
    public static double square(double num){
       return Math.pow(num , 2);
   }
}
