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

	public static boolean checkForPositiveInt(String input) {
		//http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
		//Checks for one or more digits then the end of the line
		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = pattern.matcher(input);
		return (matcher.find() && !input.equals("0"));
	}

	public static boolean checkForPositiveFloat(String input) {
		//Checks for the start of a line any number of digits then one or zero "." then any number of digits then the end of the line
		Pattern pattern = Pattern.compile("^\\d+\\.?\\d+$"); 
		Matcher matcher = pattern.matcher(input);
		return (matcher.find() && !input.equals("0.0"));
	}
}
