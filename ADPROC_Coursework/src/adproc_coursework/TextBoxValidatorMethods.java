/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc_coursework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 */
public class TextBoxValidatorMethods {

	public static boolean isValidInt(String input) {
		try {
			Integer.parseInt(input);

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static boolean isValidFloat(String input) {
		try {
			Float.parseFloat(input);

		} catch (NumberFormatException e) {
			return false;
		}
		if (!input.substring(input.length() - 1).equals(".")) {
			return true;
		} else {
			return false;
		}
	}

}
