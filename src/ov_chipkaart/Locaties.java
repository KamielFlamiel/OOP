package ov_chipkaart;

public class Locaties {
	private double Nijmegen;
	private double Utrecht;
	private double Amsterdam;
	private boolean inNijmegen;
	private boolean inAmsterdam;
	private boolean inUtrecht;
	
	public void getLocatie() {
		if (inUtrecht) {
			return Utrecht;
		} else if (inNijmegen = true) {
			return Nijmegen;
		} else if (inAmsterdam = true) {
			return Amsterdam;
		}
	
		
	}
	
	public void setLocatie(boolean inNijmegen) {
		this.inNijmegen = inNijmegen;
	}
	

}
