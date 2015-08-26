/*
 * StackDemo.java
 * 
 * Copyright 2015 Unknown <ajay@localhost>
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

class Stack {
	private final int SIZE = 5;
	private int[] s = new int[SIZE];
	private int top = -1;
	
	public void push(int item) {
		top++;		
		s[top] = item;
	}
	
	public int pop() {
		if (top < 0) {
			System.out.println("STACK IS EMPTY!!!");
			return -1;
		}
		
		int item = s[top];
		top--;
		
		return item;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = top; i >= 0; i--)
			sb.append(s[i]).append("\n");
			
		return sb.toString();
	}
}

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(5);
		stack.push(12);
		stack.push(21);
		stack.push(1);
		stack.push(100);
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
	}
}

