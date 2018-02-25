

import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining{
	public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
		ArrayList<Integer> whole = new ArrayList<Integer>();
		int i = 0;
		for (int num : second) {
			i++;
			if (!first.contains(num)) {
				first.add(num);
			}
		}

		System.out.println(first);
	}

	public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        System.out.println(list1);
        System.out.println(list2);
        smartCombine(list1, list2);
	}

//	  MOOC solution:
//    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
//        for (Integer number : list2) {
//            if (!list1.contains(number)) {
//                list1.add(number);
//            }
//        }
//    }

}
