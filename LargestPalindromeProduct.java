/*
 * LargestPalindromeProduct.java
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


public class LargestPalindromeProduct {
	public static boolean isPalindrome(int n) {
		return ((Integer.parseInt(new StringBuffer(String.valueOf(n)).reverse().toString()) == n) ? true : false);
	}
	
	public static void main(String[] args) {
		String result = null;
		
		for (int i = 100; i <= 999; i++) 
			for (int j = 100; j <= 999; j++)
				if (isPalindrome(i * j))
					result = i + ", " + j;
					
		System.out.println(result);
	}
}

