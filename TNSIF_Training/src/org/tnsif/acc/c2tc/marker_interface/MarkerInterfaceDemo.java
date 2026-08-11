package org.tnsif.acc.c2tc.marker_interface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registerable s=new Student(12,"Gani",20000,"Java Programming");
		Registerable s1=new Student(13,"Vardhan",30000,"Java Programming");
		
        Object obj=new Object();
		if(obj instanceof Registerable)
		
		{
			System.out.println("Student is registered for this course");
		}
		else
		{
			System.out.println("Student is not registered for this course");
		}
		

	}

}
