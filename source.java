class source{
	public static void main(String[] argv){
		System.out.println(argv[0]);	
		int i=Integer.parseInt(argv[0]);
		System.out.println(i);	
	}
	

	//Constructor using Cust class
	public static void constr(){
		cust obj1=new cust();
		System.out.println(obj1.getdata());
		System.out.println(obj1.getcustName());
		cust obj2=new cust();
		cust obj3=new cust();
		System.out.println(obj2.getdata());
		System.out.println(obj2.getcustName());
		System.out.println(obj3.getdata());
		System.out.println(obj3.getcustName());
		System.out.println(obj1.gettotal());
	}


	//String implementation Assignment
	public static void strop(){
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		str1.toUpperCase();
		String str3=str1;
		System.out.println(str3==str2);
		System.out.println(str3.equalsIgnoreCase(str2));

		System.out.println(str3.concat(str2));

		str2="";
		for(int i=str1.length()-1;i>=0;i--){
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);	
	}

	//String implementaion in Cust class
	public static void custstr(){
		cust obj=new cust();
		obj.setcustName("Abcd");
		if(obj.validateName()){
			System.out.println(obj.getcustName());
		}
		else{
			System.out.println("Re-enter Name");
		}
	}

	//Linked list creation, insertion, display  - list class
	public static void linked_list(){
		list head=new list();
		head.data=5;
		insert_node(head,35);
		insert_node(head,3);
		list_display(head);
	}
	public static void insert_node(list head,int data){
		list ptr=head;
		if(ptr!=null){
			while(ptr.next!=null){
				ptr=ptr.next;
			}
		}
		ptr.next=new list();
		ptr.next.data=data;
	}
	public static void list_display(list head){
		list ptr=head;
		while(ptr!=null){
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}


	//Queue and circular queue implementaion - Queue class	
	public static void queueop(){
		queue obj=new queue();
		obj.insert(4);
		obj.insert(2);
		obj.insert(45);
		obj.insert(62);
		obj.insert(84);
		obj.insert(24);
		obj.delete();
		obj.delete();
		obj.delete();
		obj.delete();
		obj.delete();
		obj.delete();
		obj.delete();
	}

	//Operation on Stack on Stack class
	public static void stackop(){
		stack obj=new stack();
		obj.push(1);
		obj.push(4);
		obj.pop();
		obj.push(3);
		obj.push(5);
		obj.push(10);
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
