package dreieck;

import javax.swing.*;
public class Dreieck {
	public static double a,b,c,flaeche,umfang;
	
	
	public static void begruessung(){
		JOptionPane.showMessageDialog(null,"Willkommen zur Dreiecksberechnung");
	}
	public static void ausgabe(){
		JOptionPane.showMessageDialog(null,"Die Flaeche von a="+a+", b="+b+", c="+c+" betraegt: "  + flaeche);
		JOptionPane.showMessageDialog(null,"Der Umfang von a="+a+", b="+b+", c="+c+" betraegt: "  + umfang);
	}
	public static void einlesen(){
		a=Double.parseDouble(JOptionPane.showInputDialog("Bitte einen Wert für a eingeben: ", 0));
		b=Double.parseDouble(JOptionPane.showInputDialog("Bitte einen Wert für b eingeben: ", 0));
		c=Double.parseDouble(JOptionPane.showInputDialog("Bitte einen Wert für c eingeben: ", 0));
	}
	public static void verarbeitung(){
		umfang=a+b+c;
		double s=umfang/2.0;
		flaeche=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dreieck.begruessung();
		Dreieck.einlesen();
		Dreieck.verarbeitung();
		Dreieck.ausgabe();
		
	}

}
