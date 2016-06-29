class stack{
	private final int size=10;
	int arr[]=new int[size];
	int top=-1;
	public void push(int elem){
		if(top<size-1){
			top++;	
			arr[top]=elem;
			System.out.println("Push elem "+ elem);
		}
		else{
			System.out.println("Try something different homie");
		}	
	}
	public void pop(){
		if(top>-1){
			top--;
		}
		else{
			System.out.println("Try something different again homie");
		}	
	}
}
