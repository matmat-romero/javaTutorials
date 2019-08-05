package arraylist1;
import java.util.*;

public class ArrayList1 {

    public static void main(String[] args) {
       ArrayList<String> b99 = new ArrayList<String>();
       
       //add values to arrays
       b99.add("Jake");
       b99.add("Terry");
       b99.add("Amy");
       
       //show an arraylist
       System.out.println(b99);
       
       //size of an array
       System.out.println(b99.size());
       
       //access an index in an arraylist
       b99.get(3);
       
       
       //replace an index in an arraylist
       b99.set(0, "Cheddar");

    }
    
}
