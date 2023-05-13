package mapping;
import java.util.*;
// add lines
public class mapping {
	public static void main(String[] args) {
     Map<String,String> map =new HashMap<>();
     map.put("A", "padma");
     map.put("C", "boomi");
     map.put("B", "jeeva");
     map.put("D", "barath");
     map.put("D", "sarath");
     System.out.println(map.containsValue("sarath"));
     System.out.println(map);
     map.remove("D","sarath");
     System.out.println(map);
    System.out.println(map.containsKey("B"));
     System.out.println(map.containsValue("barath"));// over ride
     map.replace("A","nivas");
     System.out.println(map);
      System.out.println(map.size());
   //ArrayList<String> c= (ArrayList<String>) map.values();
     Collection<String> s= map.values();
     //<String> c=(ArrayList<String>) s;
 //    System.out.println(c);
     //System.out.println(s);
     Set<String> set =map.keySet();
    Iterator<String> i= set.iterator();
    while(i.hasNext()) {
    	String ss=i.next();
    	//System.out.println(ss);
    	//System.out.println(map.get(ss));
    	//System.out.println(i.next());
    }
    Set<Map.Entry<String, String>> set1=map.entrySet();
  Iterator<Map.Entry<String, String>> ii= set1.iterator();
    while(ii.hasNext()) {
    	Map.Entry<String, String>  e=	ii.next();
    	//System.out.println(ii);
    //	e.setValue("kamala");
    	System.out.println(e.getKey()+" : "+ e.getValue());
    //	System.out.println(e.equals(e));
    }  
  }

}
