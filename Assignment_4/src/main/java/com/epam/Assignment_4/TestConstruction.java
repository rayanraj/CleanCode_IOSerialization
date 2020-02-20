package com.epam.Assignment_4;

import java.util.Scanner;

public class TestConstruction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			System.out.println("MENU");
			System.out.println("Select Material:");
			System.out.println("	1.Standard Material");
			System.out.println("	2.Above Standard Material");
			System.out.println("	3.High Standard Material");
			System.out.println("Enter your requirements:");
			int material_standard=sc.nextInt();
			
			System.out.println("Enter the square feet:");
			int square_feet=sc.nextInt();
			
			System.out.println("Select Fully Automation:True if Yes or False if No");
			boolean fully_automated=sc.nextBoolean();
			
			HouseConstruction houseConstruction=new HouseConstruction(material_standard, square_feet, fully_automated);
			double total_cost=houseConstruction.calculateCost();
			total_cost=houseConstruction.calculateCostAutomated();
			System.out.println("The total cost is: "+total_cost);
	}
}

