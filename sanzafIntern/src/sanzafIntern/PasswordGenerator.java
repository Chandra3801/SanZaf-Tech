package sanzafIntern;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		Random random=new Random();
		String password="";
		int upper=126;
		int lower=33;
		while(password.length()<length) {
			char ch=(char)(lower+random.nextInt(upper-lower+1));
			password+=ch;
		}
		System.out.println("Generated Password : "+password);
	}

}
