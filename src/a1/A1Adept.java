package a1;

import java.util.Scanner;

public class A1Adept {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int inverntryNum = scan.nextInt();
		String[] ittype = new String[inverntryNum];
		double[] cost = new double[inverntryNum];
		
		double final4Customer = scan.nextInt();
		double finaltotal = scan.nextInt();
		
		for(int i = 0; i < inverntryNum; i++){
			ittype[i] = scan.next();
			cost[i] = scan.nextDouble();
		}
		int customerNum = scan.nextInt();
		String[] name = scan.nextDouble();

		for( int j = 0; j < customerNum; j++){
			name[i] = scan.next();
			name[i] += " " + scan.next();

			int total = scan.nextInt();
			// Intiialize customer total and final total
			
			amount = scan.nextInt();
			final4Customer = 0;
			for(int k = 0, k < amount, k++){
				int itemcost = scan.nextInt();
				String item = scan.next();
				final4Customer = (itemcost * cost(ittype,item,cost));
			}
			finaltotal += final4Customer;
			if(final4Customer > biggest.amount)
		}




	}
}
