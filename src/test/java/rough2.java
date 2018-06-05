import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class rough2 {

	public static void main(String[] args) {
			
		String str = "ishika sri chekuri";
		
		HashMap<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
	    char[] chrs = str.toLowerCase().toCharArray();
	       
	    for(Character ch:chrs)
	     {
	    	 
	            if(dupMap.containsKey(ch))
	            {
	            	
	                dupMap.put(ch, dupMap.get(ch)+1);
	               
	            } 
	            else 
	            {
	                dupMap.put(ch, 1);
	            }
	      }
	   
	    Set<Character> keys = dupMap.keySet();
	        for(Character ch:keys)
	        {
	            if(dupMap.get(ch) > 1)
	            {
	                System.out.println(ch+"--->"+dupMap.get(ch));
	            }
	        }		
	}

}
