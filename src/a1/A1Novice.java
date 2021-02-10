package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customer = scan.nextInt();
		for(int i = 0; i < customer; i++ ){
			String name1 = scan.next();
			String name2 = scan.next();
			double total = 0;
		
			int itemnum = scan.nextInt();
			
			for (int k = 0; k < itemnum; k++);{
		
				int amount = scan.nextInt();
				double cost = scan.nextDouble();
				total = cost * amount;
			}
			System.out.println(name1.toUpperCase().charAt(0) +"."+ name2 +":"+ total);
		}
		scan.close();
	}
}
