/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc_coursework;

/**
 *
 *
 */
public class TextBoxValidatorMethods {

	public static boolean isValidInt(String input) {
		if (input.equals("0")) {
			return false;
		}
		try {
			Integer.parseInt(input);

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static boolean isValidFloat(String input) {
		if (input.equals("0.0") || input.equals("0")) {
			return false;
		}
		try {
			Float.parseFloat(input);

		} catch (NumberFormatException e) {
			return false;
		}
		if (!input.substring(input.length() - 1).equals(".")) { //Makes any string ending in "." invalid e.g. "." or "5."
			return true;
		} else {
			return false;
		}
//			return true;
	}

}
