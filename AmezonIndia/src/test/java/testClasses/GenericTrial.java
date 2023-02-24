package testClasses;

public class GenericTrial <T,V> {
	
	T a;
	V b;
	public static void main(String[] args) {
		GenericTrial<String,Integer> z = new GenericTrial<String,Integer>();
        z.a="abc";
        z.b=55;
        
		GenericTrial<Integer,String> x = new GenericTrial<Integer,String>();
        x.a=45;
        x.b="sach";

}
}