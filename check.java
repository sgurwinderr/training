class check{
	public boolean checkBaggage(traveler obj){
		if(obj.GetBaggageAmount()>0&&obj.GetBaggageAmount()<40){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean checkImmigration(traveler obj){	
		if(obj.GetExpiryYear()>=2001&&obj.GetExpiryYear()<2025){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean checkSecurity(traveler obj){	
		return obj.GetNocStatus();
	}
}
