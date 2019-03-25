package com.erasmo.icaro;

public class Main {

	public static void main(String[] args) {
		binomial(5, 2, 0.98);
	}
	
	public static double binomial(int n, int x, double p) {
		System.out.println("n = "+n);
		System.out.println("x = "+x);
		System.out.println("p = "+p);
		double q = round(1 - p);
		System.out.println("q = "+q);
		int arranjo = arranjo(n, x);
		System.out.println("arranjo = "+arranjo);
		double pPowX = round(Math.pow(p, x));
		System.out.println("p^x = "+pPowX);
		double qPowNMinusX = Math.pow(q, n-x);
		System.out.println("q^(n-x) = "+qPowNMinusX);
		double binomial = arranjo * pPowX * qPowNMinusX;
		System.out.println("binomial = "+binomial);
		return binomial;
	}
	
	public static int arranjo(int n, int p) {
		return fatorial(n)/(fatorial(p)*fatorial(n-p));
	}
	
	public static int fatorial(int n) {
		int result = 1;
		
		do {
			result *= n;
		}while((n--) > 1);
		
		return result;
	}
	
	public static double round(double val) {
		return Math.round(val*Math.pow(10,4))/Math.pow(10,4);
	}
}
