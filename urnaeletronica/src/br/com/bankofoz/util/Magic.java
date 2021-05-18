package br.com.bankofoz.util;

import javax.swing.JOptionPane;

public class Magic {

	
	public static boolean b(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Titulo", JOptionPane.YES_NO_OPTION)==0) {
			return true;
		}
		return false;
	}
	
	public static double d(String msg) {
		return Double.parseDouble(s(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	
}
