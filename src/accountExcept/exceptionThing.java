package accountExcept;

public class exceptionThing {
	
	public static void main (String abc[]) {
		
		Accounts Qa = new Accounts();
		
		try {
			Qa.Tax(9500, 10);
		}
		catch(AbsentyException E) {
			System.out.println(" say something ");
		}
	}

}

class AbsentyException extends Exception{}


class Accounts{
	
	public void Tax(int Salary, int Absenties) throws AbsentyException{
		
		float t = 0; 
		
		if (Absenties >= 5) {
			AbsentyException E = new AbsentyException();
			throw E; 
		}
		else {
			t = Salary*15f/100f;
			System.out.println(t); 
		}
		
	}
	
}