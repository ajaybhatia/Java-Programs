/*
 * AccessModifiers.java
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

// JavaBean / POJO - Plain Old Java Object
class Fruit {
	private int id;
	private String name;
	private String taste;
	
	public void show() {
		System.out.println("Fruit " + name + " is " + taste);
	}
	
	//Modifiers/Setters
	public void setId(int i) {
		id = i;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setTaste(String t) {
		taste = t;
	}
	
	//Accessors/Getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTaste() {
		return taste;
	}
	
	@Override
	public String toString() {
		return "Fruit " + name + " is " + taste;
	}
}

public class AccessModifiers {
	public static void main(String args[]) {
		Fruit mango = new Fruit();
		
		mango.setId(100);
		mango.setName("Dashehri");
		mango.setTaste("too sweet");
		
		System.out.println(mango);
	}
}

