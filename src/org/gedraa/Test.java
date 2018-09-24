package org.gedraa;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		//	reducedPM = (-1.00) * (V + 5* Math.log(totalPM)+5);
		double V = 18.1;
		double totalPM = 0.036;
		double loga = Math.log(totalPM);
		loga = loga + 5 ;
		//double reducedPM = ((-1) * loga) ;
		double reducedPM = ((-1.00) * (V + 5 * loga));
		reducedPM = reducedPM +10; 
		//reducedPM = reducedPM +5;
		System.out.println("Hv =  "+ reducedPM);
		MamajekTables m = new MamajekTables();


	}

}
