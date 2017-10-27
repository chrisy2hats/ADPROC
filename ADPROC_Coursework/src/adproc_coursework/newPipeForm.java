/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc_coursework;


/**
 * Diameter and length are text fields
 * Grade , colours and quantity are combo boxes
 * Insulation , reinforcement and chemical resistance are radio buttons
 * The submit button is a Button
 */
public class newPipeForm extends javax.swing.JFrame {

	/**
	 * Creates new form newPipeForm
	 */
	public newPipeForm() {
		initComponents();
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
                QuantityComboBox = new javax.swing.JComboBox<>();
                SubmitButton = new javax.swing.JButton();
                InsulationCheckBox = new javax.swing.JCheckBox();
                ReinforcementCheckBox = new javax.swing.JCheckBox();
                ChemicalResistanceCheckBox = new javax.swing.JCheckBox();
                ErrorReportingLabel = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                DiameterLabel.setText("Diameter");

                LengthLabel.setText("Length");

                DiameterTextField.setText("Enter Diameter");
                DiameterTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                DiameterTextFieldActionPerformed(evt);
                        }
                });
                DiameterTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                DiameterTextFieldKeyTyped(evt);
                        }
                });

                LengthTextField.setText("Enter Length");
                LengthTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                LengthTextFieldActionPerformed(evt);
                        }
                });
                LengthTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                LengthTextFieldKeyTyped(evt);
                        }
                });

                GradeLabel.setText("Grade");

                ColoursLabel.setText("Colours");

                GradeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                ColoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                QuantityLabel.setText("Quantity");

                QuantityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                SubmitButton.setText("Submit");
                SubmitButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SubmitButtonActionPerformed(evt);
                        }
                });

                InsulationCheckBox.setText("Insulation");

                ReinforcementCheckBox.setText("Reinforcement");

                ChemicalResistanceCheckBox.setText("Chemical Resistance");

                ErrorReportingLabel.setText("This box will say when invalid input is done");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(DiameterLabel)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(GradeLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ErrorReportingLabel))
                                                        .addComponent(DiameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(GradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(LengthLabel)
                                                        .addComponent(ColoursLabel)
                                                        .addComponent(LengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ColoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(96, 96, 96))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(QuantityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(QuantityLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(InsulationCheckBox)
                                                        .addComponent(ReinforcementCheckBox)
                                                        .addComponent(ChemicalResistanceCheckBox))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SubmitButton)
                                .addContainerGap())
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
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(GradeLabel)
                                                        .addComponent(ColoursLabel)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(ErrorReportingLabel)))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(QuantityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubmitButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents
	//Below are the event handlers for form elements.
	//To remove a event binding go to design -> right click on element -> properties -> events and delete it there
        private void DiameterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiameterTextFieldActionPerformed
                // TODO add your handling code here:
		//This code is run when the user presses enter in the text box
		System.out.println("Enter pressed in Diameter text field");
        }//GEN-LAST:event_DiameterTextFieldActionPerformed

        private void LengthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LengthTextFieldActionPerformed
                // TODO add your handling code here:
		System.out.println("Enter pressed inside length text field");
        }//GEN-LAST:event_LengthTextFieldActionPerformed

        private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
                // TODO add your handling code here:
		System.out.println("Submit button pressed");
		System.out.println("Contents of grade drop down box is: "+GradeComboBox.getSelectedItem());
		System.out.println("In position: "+GradeComboBox.getSelectedIndex()); //This is 0 indexed
		if (ChemicalResistanceCheckBox.isSelected()){
			System.out.println("ChemicalResistanceCheckBox is ticked");
		}else{
			System.out.println("ChemicalResistanceCheckBox Isn't ticked");
		}
		System.out.println("Contents of DiameterTextField now set to potato");
		DiameterTextField.setText("potato");
		if (ErrorReportingLabel.isShowing()){

		ErrorReportingLabel.setVisible(false);
		}else{
		 	ErrorReportingLabel.setText("potato");
		ErrorReportingLabel.setVisible(true);

		}
		
        }//GEN-LAST:event_SubmitButtonActionPerformed

        private void DiameterTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiameterTextFieldKeyTyped
                // TODO add your handling code here:
		System.out.println("This is called whenever a letter is typed into diameter text field");
		System.out.println("This is the contents of field: "+DiameterTextField.getText());
        }//GEN-LAST:event_DiameterTextFieldKeyTyped

        private void LengthTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LengthTextFieldKeyTyped
                // TODO add your handling code here:
		System.out.println("This is called whenever a letter is typed into length text field");
        }//GEN-LAST:event_LengthTextFieldKeyTyped
	

		
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
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
			java.util.logging.Logger.getLogger(newPipeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(newPipeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        private javax.swing.JLabel DiameterLabel;
        private javax.swing.JTextField DiameterTextField;
        private javax.swing.JLabel ErrorReportingLabel;
        private javax.swing.JComboBox<String> GradeComboBox;
        private javax.swing.JLabel GradeLabel;
        private javax.swing.JCheckBox InsulationCheckBox;
        private javax.swing.JLabel LengthLabel;
        private javax.swing.JTextField LengthTextField;
        private javax.swing.JComboBox<String> QuantityComboBox;
        private javax.swing.JLabel QuantityLabel;
        private javax.swing.JCheckBox ReinforcementCheckBox;
        private javax.swing.JButton SubmitButton;
        // End of variables declaration//GEN-END:variables
}
