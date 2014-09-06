import javax.swing.*;
public class TestGUI extends javax.swing.JFrame {

    public TestGUI() {
        initComponents();
    }
	
	@SuppressWarnings("unchecked")
    private void initComponents() {

        radiusInput = new javax.swing.JTextField(); //need another input field for base/width
        run = new javax.swing.JButton();
        shapeSelect = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();  //added jLabel3 for base width
        areaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //main window stuff
		setTitle("Area Test");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        run.setText("Calculate"); //Calculate Button
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });

        shapeSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enter Shape", "Circle", "Triangle", "Rectangle" })); //added "Enter Shape" for start
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radiusInput)
                    .addComponent(shapeSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)     //need another input box here jLabel3
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(run)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(run)
                    .addComponent(shapeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(areaLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiusInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
	String input = shapeSelect.getSelectedItem().toString();	
	if(input.equals("Circle"))                // READS COMBOBOX I THINK
	{
	    jLabel1.setText("Radius");
		jLabel2.setText("Area:");		// seems to work but doesnt actually display labels probably because they are in the if statements
	}
	else if(input.equals("Triangle"))
	{
		jLabel1.setText("Base");
		jLabel3.setText("Height");
		jLabel2.setText("Area:");
	}	
	else if(input.equals("Rectangle"))
	{
		jLabel1.setText("Length");
		jLabel3.setText("Width");
		jLabel2.setText("Area");
	}
    }
    private void runActionPerformed(java.awt.event.ActionEvent evt) {    //will have to add more for 2 shapes; put inside if statement but without separate class?
     double radius = Double.parseDouble(radiusInput.getText());
     double area = Math.pow(radius, 2)*Math.PI; //the actual math
     areaLabel.setText(""+area);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestGUI().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel areaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField radiusInput;
    private javax.swing.JButton run;
    private javax.swing.JComboBox shapeSelect;
}
