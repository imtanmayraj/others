import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class Demo {
    public static void main(String[] args){   
    	
//    	Map<String, Integer> students=new HashMap<>();
    	Map<String, Integer> students=new Hashtable<>();
    	
    	students.put("Tanmay",92);
    	students.put("Tushar",23);
    	students.put("Mayur",67);
    	students.put("Mohit",56);
    	students.put("Mohit",45);
    	
    	System.out.println(students.keySet());
    	
    	for(String key : students.keySet())
    	{
    		System.out.println(key + ":" + students.get(key));
    	}
    	
    }
}