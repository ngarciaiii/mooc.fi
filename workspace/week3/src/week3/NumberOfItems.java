package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfItems{

	public static int countItems(ArrayList<String> list) {
		int num = 0;
		for (String word : list) {
			num++;
		}
		return num;
	}
	
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Moi");
		list.add("Ciao");
		list.add("Hello");
		System.out.println("There are this many items on the list:");
		System.out.println(countItems(list));
	}
}