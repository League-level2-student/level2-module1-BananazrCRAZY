package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		String s;
		int i;
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("Hello WRLD");
		strings.add("sup brew dawg");
		strings.add("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		strings.add("hi");
		strings.add("UwU");
		//3. Print all the Strings using a standard for-loop
		for (i = 0; i < strings.size(); i++) {
			s = strings.get(i);
			System.out.println(s);
		}
		System.out.println();
		//4. Print all the Strings using a for-each loop
		for (String a: strings) {
			System.out.println(a);
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for (i = 0; i < strings.size(); i++) {
			if ((i % 2) == 0) {
				s = strings.get(i);
				System.out.println(s);
			}
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for (i = strings.size() - 1; i >= 0; i--) {
			s = strings.get(i);
			System.out.println(s);
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for (String a: strings) {
			if (a.contains("e")) {
				System.out.println(a);	
			}
		}
	}
}
