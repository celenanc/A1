package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int inventory = scan.nextInt();
		
		String[] offeredI = new String[inventory];
		double[] cost = new double[inventory];
		double[] item = new double[inventory];
		String[] name = new String[inventory];
				
		for (int i = 0; i < inventory; i++) {
			offeredI[i] = scan.next();
			cost[i] = scan.nextDouble();
		}
		
		int person = scan.nextInt();
		
		for (int i = 0; i < person; i++) {
			String fullName = scan.next() + scan.next();
			name[i] = fullName;
			int diffTypes = scan.nextInt();
			double total = 0;
			for (int j = 0; j < diffTypes; j++) {
				int all = scan.nextInt();
				total += all * findItemPrice(scan.next(), offeredI, cost);
			}
			item[i] = total;
		}
	}
}
