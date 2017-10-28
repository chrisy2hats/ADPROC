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
public class formValidatorMethods {

	//This method checks the input is made up of only digits
	//This also checks that the number isn't negative.
	//This should be used for the quantity and length text fields
	public static boolean checkForPositiveInt(String input) {
		//http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
		//Start of line one or more digits end of line
		Pattern pattern = Pattern.compile("^\\d+$");
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}

	public static boolean checkForPositiveFloat(String input) {
		//start of line , one or more digits, zero or more ".", one or more digits
		Pattern pattern = Pattern.compile("^\\d+\\.?\\d+$"); //Th
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}
}
