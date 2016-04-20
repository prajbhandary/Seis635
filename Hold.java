package Project;

public class Hold {

	private Boolean onHold;
	
	public void getHold(){
		if (onHold == false){
			onHold = true;
		}
	}
	
	public void removeHold(){
		if (onHold == true){
			onHold = false;
		}
	}
	
	public boolean getStatus(){
		return onHold;
	}
}
