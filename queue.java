class queue{
	private final int size=5;
	private int arr[]=new int[size];
	private int rear=0,front=0;
	private int fcount=0,rcount=0;
	public void insert(int elem){
		for(;rear==size;rear=0,rcount++){
			System.out.println("Full");
		}
		arr[rear]=elem;
		rear++;
		System.out.println("Inserted item "+elem);
	}
	public void delete(){
		if(front==rear&&fcount==rcount){
			System.out.println("Empty");
		}
		else{
			System.out.println("Deleted item "+ arr[front]);
			if(front!=size){
				front++;
			}
			for(;front==size;front=0,fcount++){}
		}
	}
}
