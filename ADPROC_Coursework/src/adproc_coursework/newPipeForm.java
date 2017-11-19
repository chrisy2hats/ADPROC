/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc_coursework;

/**
 * Diameter and length are text fields Grade , colours and quantity are combo
 * boxes Insulation , reinforcement and chemical resistance are radio buttons
 * The submit button is a Button
 */
public class newPipeForm extends javax.swing.JFrame {

	/**
	 * Creates new form newPipeForm
	 */
	public newPipeForm() {
		initComponents();
		//Makes the error labels invisible to the user at the start without having to deal with .setVisible
		DiameterErrorReportingLabel.setText(" ");
		QuantityErrorReportingLabel.setText("");
		LengthErrorReportingLabel.setText(" ");
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                DiameterLabel = new javax.swing.JLabel();
                LengthLabel = new javax.swing.JLabel();
                DiameterTextField = new javax.swing.JTextField();
                LengthTextField = new javax.swing.JTextField();
                GradeLabel = new javax.swing.JLabel();
                ColoursLabel = new javax.swing.JLabel();
                GradeComboBox = new javax.swing.JComboBox<>();
                ColoursComboBox = new javax.swing.JComboBox<>();
                QuantityLabel = new javax.swing.JLabel();
                SubmitButton = new javax.swing.JButton();
                InsulationCheckBox = new javax.swing.JCheckBox();
                ReinforcementCheckBox = new javax.swing.JCheckBox();
                ChemicalResistanceCheckBox = new javax.swing.JCheckBox();
                LengthErrorReportingLabel = new javax.swing.JLabel();
                QuantityTextField = new javax.swing.JTextField();
                QuantityErrorReportingLabel = new javax.swing.JLabel();
                DiameterErrorReportingLabel = new javax.swing.JLabel();
                SubmitFailiureLabel = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                DiameterLabel.setText("Diameter");

                LengthLabel.setText("Length");

                DiameterTextField.setText("Enter Diameter");
                DiameterTextField.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                DiameterTextFieldMouseClicked(evt);
                        }
                });
                DiameterTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                DiameterTextFieldKeyReleased(evt);
                        }
                });

                LengthTextField.setText("Enter Length");
                LengthTextField.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                LengthTextFieldMouseClicked(evt);
                        }
                });
                LengthTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                LengthTextFieldKeyReleased(evt);
                        }
                });

                GradeLabel.setText("Grade");

                ColoursLabel.setText("Colours");

                GradeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "3", "4", "5" }));

                ColoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Colours", "One Colour", "Two Colours" }));

                QuantityLabel.setText("Quantity");

                SubmitButton.setText("Submit");
                SubmitButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SubmitButtonActionPerformed(evt);
                        }
                });

                InsulationCheckBox.setText("Insulation");

                ReinforcementCheckBox.setText("Reinforcement");

                ChemicalResistanceCheckBox.setText("Chemical Resistance");

                LengthErrorReportingLabel.setText("LengthErrorReportingLabel");

                QuantityTextField.setText("Quantity Wanted");
                QuantityTextField.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                QuantityTextFieldMouseClicked(evt);
                        }
                });
                QuantityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                QuantityTextFieldKeyReleased(evt);
                        }
                });

                QuantityErrorReportingLabel.setText("QuantityErrorReportingLabel");

                DiameterErrorReportingLabel.setText("DiameterErrorReportingLabel");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(GradeLabel)
                                                        .addComponent(DiameterLabel)
                                                        .addComponent(DiameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(GradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(LengthLabel)
                                                        .addComponent(ColoursLabel)
                                                        .addComponent(ColoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(LengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(54, 54, 54))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(DiameterErrorReportingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(LengthErrorReportingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(QuantityLabel)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(InsulationCheckBox)
                                                                                        .addComponent(ReinforcementCheckBox)
                                                                                        .addComponent(ChemicalResistanceCheckBox))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(QuantityErrorReportingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                                .addGap(380, 380, 380))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(SubmitFailiureLabel)
                                                                                .addGap(141, 141, 141)))
                                                                .addComponent(SubmitButton))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(QuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(DiameterLabel)
                                        .addComponent(LengthLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DiameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(DiameterErrorReportingLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LengthErrorReportingLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GradeLabel)
                                        .addComponent(ColoursLabel))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(GradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(InsulationCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReinforcementCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(QuantityLabel)
                                        .addComponent(ChemicalResistanceCheckBox))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(QuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SubmitButton)
                                                        .addComponent(QuantityErrorReportingLabel)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(SubmitFailiureLabel)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

		//If there are no reported errors with the users input
		if ((!LengthErrorReportingLabel.getText().equals("")) || (!DiameterErrorReportingLabel.getText().equals("")) || (!QuantityErrorReportingLabel.getText().equals(""))) {
			SubmitFailiureLabel.setText("New pipe not created.Please fix errors with input first");

		//If they have entered input in all of the text fields
		} else if ((LengthTextField.getText().equals("")) || (DiameterTextField.getText().equals("")) || (QuantityTextField.getText().equals(""))) {
			SubmitFailiureLabel.setText("New pipe not created.Requireed input is missing");
		} else {
			SubmitFailiureLabel.setText("New pipe successfully created!");

			//Code to get value of a combo box
			//int grade = Integer.parseInt((String) GradeComboBox.getSelectedItem());// "(int)" converts from an object to a int

			//TODO Code to check if code entered is a valid kind of pipe.(One offered by the company)
			//TODO Code to actually create a pipe in here
		}
        }//GEN-LAST:event_SubmitButtonActionPerformed

	//3 methods below remove initial text from text boxes when they are clicked on
        private void DiameterTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiameterTextFieldMouseClicked
		//When user clicks to edit the text in the text field
		DiameterTextField.setText("");
        }//GEN-LAST:event_DiameterTextFieldMouseClicked

        private void LengthTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LengthTextFieldMouseClicked
		//When user clicks to edit the text in the text field
		LengthTextField.setText("");
        }//GEN-LAST:event_LengthTextFieldMouseClicked

        private void QuantityTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantityTextFieldMouseClicked
		//When user clicks to edit the text in the text field
		QuantityTextField.setText("");
        }//GEN-LAST:event_QuantityTextFieldMouseClicked

        private void LengthTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LengthTextFieldKeyReleased
		//Checks if it is a valid int or float and is less than 6m long
		Boolean ValidInt = TextBoxValidatorMethods.isValidInt(LengthTextField.getText());
		Boolean ValidFloat = TextBoxValidatorMethods.isValidFloat(LengthTextField.getText());
		if (!(ValidInt || ValidFloat)) { 
			LengthErrorReportingLabel.setText("Invalid input in length");
		} else if (Float.parseFloat(LengthTextField.getText()) <= 6) {
			LengthErrorReportingLabel.setText("");
		} else {
			LengthErrorReportingLabel.setText("Length cannot be more than 6");
		}
        }//GEN-LAST:event_LengthTextFieldKeyReleased

        private void DiameterTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiameterTextFieldKeyReleased
		Boolean ValidInt = TextBoxValidatorMethods.isValidInt(DiameterTextField.getText());
		Boolean ValidFloat = TextBoxValidatorMethods.isValidFloat(DiameterTextField.getText());
		if (!(ValidInt || ValidFloat)) {
			DiameterErrorReportingLabel.setText("Invalid input in diameter");
        }//GEN-LAST:event_DiameterTextFieldKeyReleased
		else {
			DiameterErrorReportingLabel.setText("");
		}
	}

        private void QuantityTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityTextFieldKeyReleased
		//Only allow integers.You can't order 5.5 pipes
		Boolean ValidInt = TextBoxValidatorMethods.isValidInt(QuantityTextField.getText());
		if (!ValidInt) {
			QuantityErrorReportingLabel.setText("Invalid input in quantity");
		} else {
			QuantityErrorReportingLabel.setText("");
		}
        }//GEN-LAST:event_QuantityTextFieldKeyReleased
	/**
	 * @param args the command line arguments
	 */
	public static void main() {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;

				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class
				.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class
				.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class
				.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class
				.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new newPipeForm().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JCheckBox ChemicalResistanceCheckBox;
        private javax.swing.JComboBox<String> ColoursComboBox;
        private javax.swing.JLabel ColoursLabel;
        private javax.swing.JLabel DiameterErrorReportingLabel;
        private javax.swing.JLabel DiameterLabel;
        private javax.swing.JTextField DiameterTextField;
        private javax.swing.JComboBox<String> GradeComboBox;
        private javax.swing.JLabel GradeLabel;
        private javax.swing.JCheckBox InsulationCheckBox;
        private javax.swing.JLabel LengthErrorReportingLabel;
        private javax.swing.JLabel LengthLabel;
        private javax.swing.JTextField LengthTextField;
        private javax.swing.JLabel QuantityErrorReportingLabel;
        private javax.swing.JLabel QuantityLabel;
        private javax.swing.JTextField QuantityTextField;
        private javax.swing.JCheckBox ReinforcementCheckBox;
        private javax.swing.JButton SubmitButton;
        private javax.swing.JLabel SubmitFailiureLabel;
        // End of variables declaration//GEN-END:variables
}
