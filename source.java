class source{
	public static void main(String[] argv){

	}

	
	//Cust Class - interaction... this method...parameter vs reference
	public static void customer(){
		cust obj1=new cust();
		cust obj2=new cust();
		obj1.setdata(14);
		obj2.setdata(20);
		System.out.println(obj1.getdata());
		compare(obj1,obj2);
		compare(obj1.getdata(),obj2.getdata());
	}

	//Traveler Assignment - traveler class and check class
	public static void travel(){	
		boolean status;
		traveler obj1=new traveler();
		check obj2=new check();
		obj1.SetTravelerId(4515);
		obj1.SetNocStatus(true);
		obj1.SetExpiryYear(2020);
		obj1.SetBaggageAmount(15);
		status=obj2.checkBaggage(obj1)&&obj2.checkSecurity(obj1)&&obj2.checkImmigration(obj1);
		System.out.println(status);	
	}
	
	
	//Deletion in an Array
	public static void delArray(){
		int array[]={5,4,2,3,6,0};
		int index,elem=5,value=5,i;
		//Search in array
		for(index=0;array[index]!=value&&index<elem;index++){
		}
		//Delete and shift index
		for(i=index;i<elem;i++){
			array[i]=array[i+1];
		}
		//Display array
		for(i=0;i<elem;i++){
			System.out.println(array[i]);
		}	
	}

	//Insertion in an Array
	public static void insArray(){
		int array[]={5,4,2,3,6,0};
		int index=4,elem=5,value=5,i;
		//Make space in a Array by shifting
		for(i=elem;i>index;i--){
			array[i]=array[i-1];
		}
		array[index]=33;
		
		//Display array
		for(i=0;i<elem;i++){
			System.out.println(array[i]);
		}	
	}


	//Compare method for Cust class passing Reference
	public static void compare(cust obj1,cust obj2){
		if(obj1.getdata()>obj2.getdata()){
			System.out.println(obj1.getdata());
		}
		else{
			System.out.println(obj2.getdata());
			obj2.setdata(50);
		}
	}

	//Compare method for Cust class passing values
	public static void compare(int obj1,int obj2){
		if(obj1>obj2){
			System.out.println(obj1);
		}
		else{
			System.out.println(obj2);
		}
	}
}
