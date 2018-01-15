package com.peg;

public class LessonArray {
	public static void main(String[] args) {
		 int salaryArray[] = {
		 2500, 2100, 2600, 3000, 2000, 3000, 2000, 6000, 5000
		 };
		
		 int total = 0;
		 
		 for(int i = 0;i<salaryArray.length;i=i+1) {
			 int nowSalary = salaryArray[i];
//			 System.out.println("第"+(i+1)+"天薪水="+nowSalary);
			 total = total+nowSalary;
		 }
//		 System.out.println("Total Salary = "+total);
//		 System.out.println("Average Salary = "+total/salaryArray.length);

		 int i = 0;
		for(int nowSalary:salaryArray) {
			System.out.println("第"+(i+1)+"天薪水="+nowSalary);
			i=i+1;
			 total = total+nowSalary;
		}



	}
}
