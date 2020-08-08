/*
 * Created by JFormDesigner on Sat Aug 08 01:44:16 PDT 2020
 */

package com.company;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Gursimran Saini
 */
public class jFrame extends JFrame {
    public jFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gursimran Saini
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[85,fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("text");
        contentPane.add(label1, "cell 1 1");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gursimran Saini
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
