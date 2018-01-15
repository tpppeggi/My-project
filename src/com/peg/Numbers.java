package com.peg;
import java.util.Scanner;
public class Numbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("請輸入數字");
     Scanner scanner = new Scanner(System.in);
     int a = Integer.parseInt(scanner.nextLine());
   
     for(int b =0; b<=a&&b<=10;b++ )
     {
    	 
     if(b%5==0){
    	 
    	 System.out.print("#");
     }if (a>10){
    	 System.out.print(b+" ");
 	}
     
     
     }
		
		
		
	}
	
	

}
