
public class Sample {
	 int x ;
	 int z = 200;
	 double d = 200;
	 public void add  (int y) { 
		 z = (z - y) - 50;
		System.out.println("Substraction of two numbers :" + z);
		} 
public String toString() {
	 return String.format("$%.2f", d);
}
	 
}
