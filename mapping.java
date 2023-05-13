/*package mapping;
import java.util.HashMap;

public class mapping {
	void m1()
	{
	HashMap<Integer,String> employemap=new HashMap<Integer,String>();
	employemap.put(1,"car");
	employemap.put(2,"bus");

	employemap.put(3,"bike");
	employemap.put(4,"lorry");
	
	//System.out.println("employemap:" +empolyemap);
	
	employemap.put(11,"XYZ");
	employemap.put(null,"ABC");
	System.out.println("employemap:" +employemap);

	}
    
	
	
	  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mapping ob=new mapping();
		ob.m1();
	}

}*/


package mapping;
import java.util.*;
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
