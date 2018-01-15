package com.peg;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

        switch(n) {
        case 1:
        	System.out.print("星期一");
        	break;
        case 2:
        	System.out.print("星期二");
        	break;
        case 3:
        	System.out.print("星期三");
        	break;
        case 4:
        	System.out.print("星期四");
        	break;
        case 5:
        	System.out.print("星期五");
        	break;
        case 6:
        	System.out.print("星期六");
        	break;
        case 7:
        	System.out.print("星期日");
        	break;
        	default:
        	 	System.out.print("超出範圍");
        
        
        
        }
		
		
		
		
		
		
	}

}
