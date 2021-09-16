package thi;
import java.util.*;
import java.util.Map.Entry;

public class Cau_2 {
    static class Student {
		String Name;
		String Phone;
		
		void setStudent() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name: ");
			Name = sc.nextLine();
			System.out.println("Enter Phone: ");
			Phone = sc.nextLine();
		}
		
		void getStudent() {
			System.out.println("Name: " + Name);
			System.out.println("Phone: " + Phone);
		}
	}
		
    public static void main(String args[]) {

  	  Scanner sc = new Scanner(System.in);
  	  
      HashMap<String, String> hm = new HashMap<String, String>();

      String Name;
  	  String Phone;
      while(true) {
 		 System.out.println("Enter Student's Name: ");
 		 Name = sc.nextLine();
 		 if(Name.equals("x") == true || Name.equals("X") == true) break;
 		 System.out.println("Enter Student's Phone: ");
 		 Phone = sc.nextLine();
 		 hm.put(Name, Phone);
       }
      
      Set<Entry<String, String>> set = hm.entrySet();
      
      Iterator<Entry<String, String>> i = set.iterator();
      
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
   }
}
