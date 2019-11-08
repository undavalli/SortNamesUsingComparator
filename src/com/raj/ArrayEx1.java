package com.raj;

import java.util.*;

public class ArrayEx1 {
	
	class Student{
		
		public String firstName;
		
		public String alphabet;
		
		public int number;


		public String getName() {
			return this.firstName;
		}
		
		public String getAlphabet() {
			return this.alphabet; 
		}
		
		public Integer getNumber() {
			return this.number;
		}
		
		public void setName(String firstName) {
			this.firstName = firstName;
		}
		
		public void setAlphabet(String alphabet) {
			this.alphabet = alphabet;
		}
		
		public void setNumber(Integer number) {
			this.number = number;
		}
		
		
		public Comparator<Student> alphabeticComparator= new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.getAlphabet().compareTo(o1.getAlphabet());
			}
			
		};

		@Override
		public String toString() {
			return "Student [firstName=" + firstName + ", alphabet=" + alphabet + ", number=" + number;
		}
		

		
	}
	
	public static void main(String args[]) {
		
		Student stu = new ArrayEx1().new Student();
		
		List<String> list1 = new ArrayList<>();
		list1.add("prudhvi a 10");
		list1.add("prudhvi b 20");
		list1.add("prudhvi c 30");
		list1.add("prudhvi d 40");
		
		//map strings to pojo class Student
		List<Student> studentList = new ArrayList<>();
		for(String s: list1) {
			System.out.println(Arrays.asList(s.split(" ")));
			stu.setAlphabet(Arrays.asList(s.split(" ")).get(1));
			stu.setName(Arrays.asList(s.split(" ")).get(0));
			stu.setNumber(Integer.valueOf(Arrays.asList(s.split(" ")).get(2)));
			studentList.add(stu);
		}
		
		Collections.sort(studentList, new ArrayEx1().new Student().alphabeticComparator);
		
		for(Student s: studentList) {
			System.out.println(s.toString());
		}
	
		
	}

}
