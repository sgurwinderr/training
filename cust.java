class cust{
	private static int id=1000;
	private int custid;
	private String customerName;
	
	public cust(){
		custid=id++;
		customerName="default";
	}
	public cust(int custid,String custName){
		this.custid=custid;
		customerName=custName;
		id++;
	}
	
	public void setcustName(String customerName){
		this.customerName=customerName;
	}
	public String getcustName(){
		return customerName;
	}
	public void setdata(int id){
		custid=id;
	}
	public int getdata(){
		return custid;
	}
	public int gettotal(){
		return id-1000;
	}
	public boolean validateName(){
		if(customerName.length()>3 && customerName.length()<20){
			return true;
		}
		else{
			return false;
		}
	}
	public void display(){
		System.out.println("Cust called");
	}
}
