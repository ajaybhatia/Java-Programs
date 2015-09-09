/*
 * MainStudent.java
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

package college;

import java.util.List;
import java.util.ArrayList;

public class MainStudent {
	public static void main(String args[]) {
		List<Student> list = new ArrayList<>();
		
		// Insertion in ArrayList
		list.add(new Student(1336464, "Jayanka Suman", "BCA"));
		list.add(new Student(1336493, "Ritu Rani", "BCA"));
		list.add(new Student(1336474, "Mandip Kaur", "BCA"));
		list.add(new Student(1336459, "Hardeep Kaur", "BCA"));
		list.add(new Student(1336497, "Shivam Nayyar", "BCA"));
		list.add(new Student(1336486, "Prabhdeep", "BCA"));
		list.add(new Student(1336485, "Param Pratap Singh", "BCA"));
		list.add(new Student(1336449, "Baljinder Singh", "BCA"));
		list.add(new Student(1436341, "Harjit Singh", "BCA"));
		
		System.out.println("\nAFTER ADDITION");
		System.out.println("===== ========");
		// Display list
		show(list);	
		
		list.remove(5);
		list.remove(7);
		
		System.out.println("\nAFTER DELETION");
		System.out.println("===== ========");
		// Display list
		show(list);	
	}
	
	/**
	 * Displays list of students
	 */
	public static void show(List<Student> list) {
		for (Student student : list) 
			System.out.println(student);
	}
}

