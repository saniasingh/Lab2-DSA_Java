package com.greatlearing.lab.currency;

public class Main {
	
	public static void main(String[] args) {
		int denominations[] = {60, 5, 12, 78, 25};
		int payValue = 128;
		MergeSortDes sort = new MergeSortDes();
		sort.sort(denominations, 0, denominations.length-1);
		
		System.out.print(""); 
		Currency curr = new Currency();
		curr.currencyCount(denominations, payValue);
		
	}

}
