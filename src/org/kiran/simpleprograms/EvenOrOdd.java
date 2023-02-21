package org.kiran.simpleprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		System.out.println("Enter a Number : ");
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			if(num<0) {
				throw new IllegalArgumentException("Invalid Number Entered :: " + num);
			}else {
				if(num%2==0) {
					System.out.println("Even");
				}else {
					System.out.println("Odd");
				}
			}
		}
	}

}
