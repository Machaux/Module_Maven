package dta.ihm;

public class ArreterProgramme implements Action{

	public Integer getId() {
		return 0;
	}

	public String getMenu() {
		return "Arr�ter le programme";
	}

	public void execute() {
		System.exit(0);		
	}
	
}
