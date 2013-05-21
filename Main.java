/**
Katherine Loren M. Tan
CMSC 170 U-3L
**/

import java.io.*;

public class Main {

	
	public static void main(String[] args) throws IOException {
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(a);
		System.out.print("Enter the number of generations: ");
		String generation = b.readLine();
		int gen =Integer.parseInt(generation);
		System.out.println("No of generations: "+gen);
		GeneticSolver problem = new GeneticSolver(gen);
		//problem.solve();

	}

}
