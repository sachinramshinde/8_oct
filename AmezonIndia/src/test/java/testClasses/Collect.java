package testClasses;

import java.util.ArrayList;

public class Collect {
   public static void main(String[] args) {
	   
	   ArrayList<Integer> a= new ArrayList<Integer>();
	   
	   a.add(45);
	   a.add(44);
	   a.add(10);
	   a.add(10);
	   for(int i=0; i<a.size();i++)
	   {
	   System.out.println(a.get(i));
	   }
	   a.remove(0);
	   for(int i=0; i<a.size();i++)
	   {
	   System.out.println(a.get(i));
	   }
}
}
