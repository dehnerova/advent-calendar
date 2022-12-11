package advent1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChallengeOne {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();

		
		String s[]= scanner.next().split("\n\n");
		
		for(int i =0 ;i < s.length;i++){
			
			list.add(Integer.parseInt(s[i]));
			
		}
		
		for (Integer i: list) {
			System.out.println(i);
		}
		
	} 
//	
//List<Integer> values = new ArrayList<Integer>();
//	while (scanner.hasNextInt())
//	  list.add(scanner.nextInt());
	

	
//	Scanner kb = new Scanner(System.in);
	
	
}
