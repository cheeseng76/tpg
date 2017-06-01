package com.tpg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	private int id;
	
	private String firstName;
	
	private Double gpa; 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	
	public Student(int id, String firstName, Double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.gpa = gpa;
    }

	
	@Override
	public int compareTo(Student student) {
		
		int i = student.gpa.compareTo(gpa);
	    if (i != 0) return i;
		
		i = firstName.compareTo(student.firstName);
	    if (i != 0) return i;

	    return this.id - student.id;
		
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 47 * hash + (this.gpa != null ? this.gpa.hashCode() : 0);
        return hash;

	}

	@Override
	/*
	public String toString() {
		return "Student{" + "id=" + id + ", firstName=" + firstName + ", GPA=" + gpa + '}';
	}
	*/
	
	public String toString() {
		return firstName;
	}
	
	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<Student>();
		 
        listStudents.add(new Student(33, "Tina", Double.valueOf(3.68)));
        listStudents.add(new Student(85, "Louis", Double.valueOf(3.85)));
        listStudents.add(new Student(56, "Samil", Double.valueOf(3.75)));
        listStudents.add(new Student(19, "Samar", Double.valueOf(3.75)));
        listStudents.add(new Student(22, "Lorry", Double.valueOf(3.76)));
        
        Collections.sort(listStudents);
        
        for (Student emp : listStudents) {
            System.out.println(emp);
        }

	}
}
