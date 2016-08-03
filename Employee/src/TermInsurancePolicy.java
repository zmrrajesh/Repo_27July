public class TermInsurancePolicy extends Policy{
	private int term=100;
	public void read(){
		//Read term
	}
	 public void write(){
		//super.write();
		System.out.println(term);
		super.write();
	} 
	
	/**public void fun() { System.out.println("new fun"); } ***/
	//Other Methods
	public static void main (String[] args) {
		TermInsurancePolicy tpolicy = new TermInsurancePolicy();
		tpolicy.write();
		//tpolicy.fun();
	}
}
