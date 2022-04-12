package batch2pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab4program4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Products");
		int n = sc.nextInt();
		System.out.println("enter the products");
		ArrayList<String> Products = new ArrayList<String>(n);
		for(int i=0;i<n;i++) {
			Products.add(sc.next());
		}
		for(int i=0;i<n;i++) {
			Collections.sort(Products);
		}
      System.out.println(Products);

	}

}
