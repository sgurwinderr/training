class traveler{
	private int travelerId;
	private int baggageAmount;
	private int expiryYear;
	private boolean nocStatus;
	public void SetTravelerId(int id){
		travelerId=id;
	}
	public int GetTravelerId(){
		return travelerId;
	}
	public void SetBaggageAmount(int bamount){
		baggageAmount=bamount;
	}
	public int GetBaggageAmount(){
		return baggageAmount;
	}
	public boolean GetNocStatus(){
		return nocStatus;
	}
	public void SetNocStatus(boolean status){
		nocStatus=status;
	}
	public void SetExpiryYear(int year){
		expiryYear=year;
	}
	public int GetExpiryYear(){
		return expiryYear;
	}
}
