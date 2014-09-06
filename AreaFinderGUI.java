import javax.swing.*;
public class AreaFinderGUI extends javax.swing.JFrame {

    public AreaFinderGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {	//Fancy design crap

        dimInput1 = new javax.swing.JTextField();
        run = new javax.swing.JButton();
        shapeSelect = new javax.swing.JComboBox();
        dimLabel1 = new javax.swing.JLabel();
        answerTitle = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        dimInput2 = new javax.swing.JTextField();
        dimLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Area Finder");

        run.setText("Calculate");
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });

        shapeSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ellipse", "Triangle", "Rectangle" }));
        shapeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeSelectActionPerformed(evt);
            }
        });

        dimLabel1.setText("Dimension 1");

        answerTitle.setText("Area:");

        dimLabel2.setText("Dimension 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dimInput1)
                    .addComponent(shapeSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dimInput2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(run)
                            .addComponent(dimLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(answerTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dimLabel2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(run)
                    .addComponent(shapeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerTitle)
                    .addComponent(areaLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dimLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dimLabel2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }
    
	private void runActionPerformed(java.awt.event.ActionEvent evt) {	//The math done when "Calculate" is pressed
		String shape = (String)shapeSelect.getSelectedItem();
		if(shape.equals("Ellipse")){
			double axis1 = Double.parseDouble(dimInput1.getText());
			double axis2 = Double.parseDouble(dimInput2.getText());
			areaLabel.setText((axis1*axis2)+"pi");
        }
		else if(shape.equals("Triangle")){
			double base = Double.parseDouble(dimInput1.getText());
			double height = Double.parseDouble(dimInput2.getText());
			areaLabel.setText(""+(base*height)/2);
		}
		else if(shape.equals("Rectangle")){
			double length = Double.parseDouble(dimInput1.getText());
			double width = Double.parseDouble(dimInput2.getText());
			areaLabel.setText(""+length*width);
        }
    }

    private void shapeSelectActionPerformed(java.awt.event.ActionEvent evt) {	//Changes labels based on selected shape
     String shape = (String)shapeSelect.getSelectedItem();
     if(shape.equals("Ellipse")){
         dimLabel1.setText("Axis 1");
         dimLabel2.setText("Axis 2");
         
     }
     else if(shape.equals("Triangle")){
        dimLabel1.setText("Base");
        dimLabel2.setText("Height");
     }
     else if(shape.equals("Rectangle")){
        dimLabel1.setText("Length");
        dimLabel2.setText("Width");
     }
    }

    public static void main(String args[]) {	//I don't even know
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AreaFinderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaFinderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaFinderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaFinderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaFinderGUI().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel answerTitle;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField dimInput1;
    private javax.swing.JTextField dimInput2;
    private javax.swing.JLabel dimLabel1;
    private javax.swing.JLabel dimLabel2;
    private javax.swing.JButton run;
    private javax.swing.JComboBox shapeSelect;
}
