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
				
		
		
        
        
    }
			
			
		
		    
	}
