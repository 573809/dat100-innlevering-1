package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {
	public static void main(String[] args) {
		String heilTxt = showInputDialog("Skriv eit heiltal n: ");
		int n = parseInt(heilTxt);

		int y = 1;

		for (int i = 1; i <= n; i++) {
			y = i * y;
		}

		showMessageDialog(null, "Svaret er " + y + ".");
	}
}
