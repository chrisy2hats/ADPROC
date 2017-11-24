/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc_coursework;

import java.util.ArrayList;

/**
 *
 *
 */
public class ADPROC_Coursework {

	/**
	 * @param args the command line arguments
	 */
	private ArrayList<LongPipe> ListOfOrderedPipes = new ArrayList();

	public static void main(String[] args) {
		// TODO code application logic here
		newPipeForm test = new newPipeForm();
		test.main();
	}

	public void addPipeToList(LongPipe newPipe) {
		ListOfOrderedPipes.add(newPipe);
	}
}
