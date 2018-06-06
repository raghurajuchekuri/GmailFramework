import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class rough {

	public static void main(String[] args) throws Throwable {

		List<Integer> l = Arrays.asList(10,5,1,3);
		l.sort(Comparator.reverseOrder());
		l.sort(Comparator.naturalOrder());
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);
		
		System.out.println("*****************************");
				
		String s1 = "abc";
		String s2 = "abc";		
		System.out.println("s1 == s2 is:" + s1 == s2); // true
		System.out.println("s1 == s2 is:" + s1.equals(s2)); // false
		
		System.out.println("*****************************");
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));// 6 ourn
		
		System.out.println("*****************************");
		
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
		shortSet.add(i);
		shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size()); //100
		
		System.out.println("*****************************");
		
				
		String str1 = "Experience";
        
        
    }
			
			
		
		    
	}
