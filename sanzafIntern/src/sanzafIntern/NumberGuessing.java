package sanzafIntern;

import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int randomNum=(int)(Math.random()*100);
		System.out.println(randomNum);
		int userGuessNum=0;
		int count=0;
		while(userGuessNum!=randomNum) {
			userGuessNum=input.nextInt();
			System.out.println(userGuessNum);
			count++;
			if(userGuessNum>randomNum) {
				System.out.println("Too high! Try again");
			}else if(userGuessNum<randomNum) {
				System.out.println("Too low! Try again");
			}else {
				System.out.println("Congratulations! It's correct guess");
				System.out.println("Number of attempts : "+count);
			}
		}
	}
}
