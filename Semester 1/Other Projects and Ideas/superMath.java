import javax.swing.*;
public class superMath extends javax.swing.JFrame {

    public superMath() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        areaTab = new javax.swing.JPanel();
        dimInput1 = new javax.swing.JTextField();
        run = new javax.swing.JButton();
        shapeSelect = new javax.swing.JComboBox();
        dimLabel1 = new javax.swing.JLabel();
        answerTitle = new javax.swing.JLabel();
        dimInput2 = new javax.swing.JTextField();
        dimLabel2 = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        quadraticTab = new javax.swing.JPanel();
        bInput = new javax.swing.JTextField();
        cInput = new javax.swing.JTextField();
        quadLabel = new javax.swing.JLabel();
        xSquared = new javax.swing.JLabel();
        xFirst = new javax.swing.JLabel();
        constant = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        aInput = new javax.swing.JTextField();
        answer = new javax.swing.JLabel();
        derivativeTab = new javax.swing.JPanel();
        derivAnswer = new javax.swing.JButton();
        coeffInput = new javax.swing.JTextField();
        expInput = new javax.swing.JTextField();
        coeffLabel = new javax.swing.JLabel();
        expLabel = new javax.swing.JLabel();
        equLabel = new javax.swing.JLabel();
        derivLabel = new javax.swing.JLabel();
        fEquals = new javax.swing.JLabel();
        fPrime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Program");
        setResizable(false);

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

        javax.swing.GroupLayout areaTabLayout = new javax.swing.GroupLayout(areaTab);
        areaTab.setLayout(areaTabLayout);
        areaTabLayout.setHorizontalGroup(
            areaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTabLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(areaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shapeSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dimInput1)
                    .addComponent(dimInput2))
                .addGap(18, 18, 18)
                .addGroup(areaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dimLabel2)
                    .addComponent(dimLabel1)
                    .addGroup(areaTabLayout.createSequentialGroup()
                        .addComponent(run)
                        .addGap(18, 18, 18)
                        .addComponent(answerTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaLabel)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        areaTabLayout.setVerticalGroup(
            areaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTabLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(areaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shapeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerTitle)
                    .addComponent(run)
                    .addComponent(areaLabel))
                .addGap(18, 18, 18)
                .addGroup(areaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimLabel1)
                    .addComponent(dimInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimLabel2)
                    .addComponent(dimInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Area", areaTab);

        bInput.setText("b");

        cInput.setText("c");

        quadLabel.setText("Quadratic Equation");

        xSquared.setText("Coeffiecient of x squared:");

        xFirst.setText("Coefficient of x:");

        constant.setText("Constant:");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        aInput.setText("a");

        javax.swing.GroupLayout quadraticTabLayout = new javax.swing.GroupLayout(quadraticTab);
        quadraticTab.setLayout(quadraticTabLayout);
        quadraticTabLayout.setHorizontalGroup(
            quadraticTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadraticTabLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(quadraticTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quadraticTabLayout.createSequentialGroup()
                        .addComponent(constant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quadraticTabLayout.createSequentialGroup()
                        .addComponent(quadLabel)
                        .addGap(68, 68, 68)
                        .addComponent(calculate))
                    .addGroup(quadraticTabLayout.createSequentialGroup()
                        .addGroup(quadraticTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xSquared)
                            .addGroup(quadraticTabLayout.createSequentialGroup()
                                .addComponent(xFirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(quadraticTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answer)
                            .addComponent(aInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        quadraticTabLayout.setVerticalGroup(
            quadraticTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadraticTabLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(quadraticTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quadLabel)
                    .addComponent(calculate))
                .addGap(18, 18, 18)
                .addGroup(quadraticTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xSquared)
                    .addComponent(aInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(quadraticTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xFirst)
                    .addComponent(bInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(quadraticTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(constant)
                    .addComponent(cInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quadratic", quadraticTab);

        derivAnswer.setText("Calculate");
        derivAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivAnswerActionPerformed(evt);
            }
        });

        coeffLabel.setText("Coefficient:");

        expLabel.setText("Exponent:");

        fEquals.setText("f(x)=");

        fPrime.setText("f'(x)=");

        javax.swing.GroupLayout derivativeTabLayout = new javax.swing.GroupLayout(derivativeTab);
        derivativeTab.setLayout(derivativeTabLayout);
        derivativeTabLayout.setHorizontalGroup(
            derivativeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derivativeTabLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(derivativeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(expLabel)
                    .addComponent(coeffLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(derivativeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(expInput, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(coeffInput))
                .addGap(40, 40, 40)
                .addGroup(derivativeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fEquals)
                    .addComponent(fPrime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(derivativeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(derivAnswer)
                    .addComponent(equLabel)
                    .addComponent(derivLabel))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        derivativeTabLayout.setVerticalGroup(
            derivativeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derivativeTabLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(derivAnswer)
                .addGap(18, 18, 18)
                .addGroup(derivativeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeffInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coeffLabel)
                    .addComponent(equLabel)
                    .addComponent(fEquals))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(derivativeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expLabel)
                    .addComponent(derivLabel)
                    .addComponent(fPrime))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Derivative", derivativeTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed
        String shape = (String)shapeSelect.getSelectedItem();
        if(shape.equals("Ellipse")){
            double axis1 = Double.parseDouble(dimInput1.getText());
            double axis2 = Double.parseDouble(dimInput2.getText());
            areaLabel.setText((axis1*axis2)+"π");
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
    }//GEN-LAST:event_runActionPerformed

    private void shapeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeSelectActionPerformed
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
    }//GEN-LAST:event_shapeSelectActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        double a = Double.parseDouble(aInput.getText());
        double b = Double.parseDouble(bInput.getText());
        double c = Double.parseDouble(cInput.getText());
        double maths = Math.pow(b,2)-(4*a*c);
        double root1 = ((-1*b)+Math.sqrt(maths))/(2*a);
        double root2 =  ((-1*b)-Math.sqrt(maths))/(2*a);
        answer.setText("The roots are: "+root1+" and "+root2);
    }//GEN-LAST:event_calculateActionPerformed

    private void derivAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivAnswerActionPerformed
        int coeff = (int)Double.parseDouble(coeffInput.getText());
        int exp = (int)Double.parseDouble(expInput.getText());
        int newCoeff =(coeff*exp);
        int newExp = (exp-1);
        equLabel.setText("<html>"+coeff+"x<sup>"+exp+"</sup></html>");
        derivLabel.setText("<html>"+newCoeff+"x<sup>"+newExp+"</sup></html>");
    }//GEN-LAST:event_derivAnswerActionPerformed

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
            java.util.logging.Logger.getLogger(superMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(superMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(superMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(superMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new superMath().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aInput;
    private javax.swing.JLabel answer;
    private javax.swing.JLabel answerTitle;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JPanel areaTab;
    private javax.swing.JTextField bInput;
    private javax.swing.JTextField cInput;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField coeffInput;
    private javax.swing.JLabel coeffLabel;
    private javax.swing.JLabel constant;
    private javax.swing.JButton derivAnswer;
    private javax.swing.JLabel derivLabel;
    private javax.swing.JPanel derivativeTab;
    private javax.swing.JTextField dimInput1;
    private javax.swing.JTextField dimInput2;
    private javax.swing.JLabel dimLabel1;
    private javax.swing.JLabel dimLabel2;
    private javax.swing.JLabel equLabel;
    private javax.swing.JTextField expInput;
    private javax.swing.JLabel expLabel;
    private javax.swing.JLabel fEquals;
    private javax.swing.JLabel fPrime;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel quadLabel;
    private javax.swing.JPanel quadraticTab;
    private javax.swing.JButton run;
    private javax.swing.JComboBox shapeSelect;
    private javax.swing.JLabel xFirst;
    private javax.swing.JLabel xSquared;
    // End of variables declaration//GEN-END:variables
}
