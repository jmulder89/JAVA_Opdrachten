package oefening_601;

class Datum {
	private int 	dag, 
					maand, 
					jaar;
	
	//GETTERS
	public int getDag(){
		return dag;
	}
	
	public int getMaand(){
		return maand;
	}
	
	public int getJaar(){
		return jaar;
	}
	
	//SETTERS
	public void setDag(int dag){
		this.dag = dag;
	}
	
	public void setMaand(int maand){
		this.maand = maand;
	}
	
	public void setJaar(int jaar){
		this.jaar = jaar;
	}
}
