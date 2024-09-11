package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	public static void main(String[] args) {
		String lønTxt = showInputDialog("Skriv brutto inntekt for å finne trinnskatta di: ");
		int lønn = parseInt(lønTxt);
//	ctrl + 7 	
		System.out.println("Lønn: " + lønn);

		double[] skattesats = {0, 1.7, 4, 13.6, 16.6, 17.6};
	    int[] nedre_grense = {0, 208051, 292851, 670001, 937901, 1350001};
	    int[] ovre_grense = {208050, 292850, 670000, 937900, 1350000};
		
		int trinn = 0;
	    
		if (lønn >= nedre_grense[5]) { //trinn 5
			trinn = 5;
		} else if (lønn >= nedre_grense[4] && lønn <= ovre_grense[4]) { //trinn 4
			trinn = 4;
		} else if (lønn >= nedre_grense[3] && lønn <= ovre_grense[3]) { //trinn 3
			trinn = 3;
		} else if (lønn >= nedre_grense[2] && lønn <= ovre_grense[2]) { //trinn 2
			trinn = 2;
		} else if (lønn >= nedre_grense[1] && lønn <= ovre_grense[1]) { //trinn 1
			trinn = 1;
		} else if (lønn <= ovre_grense[0]) {
			trinn = 0;
		} 
		
		double sumskatt = (lønn - nedre_grense[trinn])*(skattesats[trinn]/100); 
		System.out.println("Rekna skatt for trinn " + trinn + " er " + sumskatt);
		trinn -= 1;
		
		while (trinn > 0) {
			sumskatt += ((ovre_grense[trinn] - nedre_grense[trinn])*(skattesats[trinn]/100));
			System.out.println("Rekna skatt for trinn " + trinn + " er " + ((ovre_grense[trinn] - nedre_grense[trinn])*(skattesats[trinn]/100)));
			trinn -= 1;
		}
		
		showMessageDialog(null, "Trinnskatta di er: " + sumskatt);
	}
	
//(lønn > 0 && lønn <208051)
}
