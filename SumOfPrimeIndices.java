/*
 * SumOfPrimeIndices.java
 * 
 * Copyright 2015 Ajay Bhatia <prof.ajaybhatia@gmail.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class SumOfPrimeIndices {
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
				
		return true;
	}
	
	public static void main(String[] args) {
		int[] array = new int[args.length];
		
		for (int i = 0; i < args.length; i++)
			array[i] = Integer.parseInt(args[i]);
			
		int sum = 0;
		for (int i = 2; i < args.length; i++)
			if (isPrime(i))
				sum += array[i];
				
		System.out.println("Sum of all values at prime indices is " + sum);
	}
}

