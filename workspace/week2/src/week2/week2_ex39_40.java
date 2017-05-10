package week2;

import java.util.Scanner;

public class week2_ex39_40{
	
	private static void printStars(int amount) {
		int i = 0;
		while(i < amount) {
			System.out.print("*");                          
			i++;
		} System.out.println();
	}
	
	public static void printSquare(int sideSize){
		int j = 0;
		while (j < sideSize) {
			printStars(sideSize);
			j++;
		} System.out.println();
	}
	
	public static void printRectangle(int width, int height) {
		int k = 0;
		while (k < height) {
			printStars(width);
			k++;
		} System.out.println();
	}
	
//	public static void printTriangle(int size) {
//		int l = 0;
//		while (l <= size) {
//			printStars(l);
//			l++;
//		}
//	}
	
	public static void printWhitespace(int size){
		int m = 0;
		while(m < size) {
			System.out.print(" ");
			m++;
		}
	}
	
	public static void printTriangle(int size) {
		int n = 0;
		while(n <= size) {
			printWhitespace(size - n);
			printStars(n);
			n++;
		}
	}
	
	public static void xmasTree(int height) {
		int o = 0;
		while (o <= height) {
			printWhitespace(height - o);
			printStars(2 * o - 1);
			o++;
		}
		
		o = 2;		
		while (--o >= 0) {
	        printWhitespace(height - 2);
	        printStars(3);
	    }
	}
	
	public static void main(String[] args) {
		printStars(5);
		printStars(3);
		printStars(9);
		System.out.println();
		printSquare(4);
		printRectangle(17, 3);
		printWhitespace(4);
		System.out.println();
		printTriangle(4);
		System.out.println();
		xmasTree(10);
	}
}