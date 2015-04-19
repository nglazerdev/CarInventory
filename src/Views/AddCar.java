/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Map;
import Controllers.Database;
import Controllers.FormHandler;
import Models.Car;

import java.awt.Component;

/**
 *
 * @author Nicholas
 */
public class AddCar extends javax.swing.JPanel {

    /**
     * Creates new form AddCar
     */

    private JTextField[] textFields;
    private JComboBox[] comboBoxes;
    private Map<String, String[]> modelDictionary;
    public AddCar()
    {
        initComponents();

        //Let's go through and add the textfields and comboboxes to their own arrays

        ArrayList<JTextField> textFieldList = new ArrayList<JTextField>();
        ArrayList<JComboBox> comoBoxList = new ArrayList<JComboBox>();

        Component[] components = this.getComponents();

        for(Component panelComponent : components)
        {
            if(panelComponent.getClass() == JTextField.class)
            {
                textFieldList.add((JTextField) panelComponent);
            }

            if(panelComponent.getClass() == JComboBox.class)
            {
                comoBoxList.add((JComboBox) panelComponent);
            }
        }

        this.textFields = textFieldList.toArray(new JTextField[textFieldList.size()]);
        this.comboBoxes = comoBoxList.toArray(new JComboBox[comoBoxList.size()]);

        this.modelDictionary = Car.modelDictionary();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMake = new javax.swing.JLabel();
        jlModel = new javax.swing.JLabel();
        jlYear = new javax.swing.JLabel();
        jtfYear = new javax.swing.JTextField();
        jcbModel = new javax.swing.JComboBox();
        jlTransmission = new javax.swing.JLabel();
        jlEngine = new javax.swing.JLabel();
        jlDrivetrain = new javax.swing.JLabel();
        jcbDrivetrain = new javax.swing.JComboBox();
        jtfEngine = new javax.swing.JTextField();
        jlColor = new javax.swing.JLabel();
        jlCylinders = new javax.swing.JLabel();
        jtfCylinders = new javax.swing.JTextField();
        jlGas = new javax.swing.JLabel();
        jcbGasType = new javax.swing.JComboBox();
        jlPurchaseInformation = new javax.swing.JLabel();
        jlVehicleInfomation = new javax.swing.JLabel();
        jlVehicleType = new javax.swing.JLabel();
        jlBodyType = new javax.swing.JLabel();
        jcbVehicleType = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jlMileage = new javax.swing.JLabel();
        jtfMileage = new javax.swing.JTextField();
        jcbMake = new javax.swing.JComboBox();
        jcbTransmission = new javax.swing.JComboBox();
        jcbColor = new javax.swing.JComboBox();
        jcbBodyType = new javax.swing.JComboBox();
        jbAdd = new javax.swing.JButton();
        jlVIN = new javax.swing.JLabel();
        jtfVIN = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(750, 450));

        jlMake.setText("Make");

        jlModel.setText("Model");

        jlYear.setText("Year");

        jtfYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfYearActionPerformed(evt);
            }
        });

        jcbModel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Model-" }));

        jlTransmission.setText("Transmission");

        jlEngine.setText("Engine");

        jlDrivetrain.setText("Drivetrain");

        jcbDrivetrain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Drive-", "2WD", "4WD", "AWD" }));

        jlColor.setText("Color");

        jlCylinders.setText("Cylinders");

        jtfCylinders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCylindersActionPerformed(evt);
            }
        });

        jlGas.setText("Gas");

        jcbGasType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Gas-", "Regular", "Mid", "Premium", "Diesel" }));

        jlVehicleInfomation.setText("Vehicle Information");

        jlVehicleType.setText("Vehicle Type");

        jlBodyType.setText("Body Type");

        jcbVehicleType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Coupe", "Sedan", "Van", "Truck", " " }));

        jlMileage.setText("Mileage");

        jtfMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMileageActionPerformed(evt);
            }
        });

        jcbMake.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Make-", "Acura", "Chevrolet", "Dodge", "Honda", "Toyota" }));
        jcbMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMakeActionPerformed(evt);
            }
        });

        jcbTransmission.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Transmission-", "Automatic", "Manual", "Combo" }));

        jcbColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Color-", "Black", "Blue", "Brown", "Green", "Orange", "Red", "White", "Yellow" }));

        jcbBodyType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Body-", "2 Door", "4 Door" }));
        jcbBodyType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBodyTypeActionPerformed(evt);
            }
        });

        jbAdd.setText("Add");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jlVIN.setText("VIN #");

        jtfVIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfVINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPurchaseInformation)
                    .addComponent(jbAdd)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlMileage)
                            .addComponent(jlVIN))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jtfMileage, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfVIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlMake)
                            .addComponent(jlModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlTransmission)
                                            .addComponent(jlEngine))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlDrivetrain)))
                            .addComponent(jcbModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlVehicleInfomation)
                    .addComponent(jLabel18)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlYear)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jlBodyType)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbDrivetrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbBodyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlColor)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlVehicleType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlGas)
                            .addComponent(jlCylinders))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCylinders, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbGasType, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlVehicleInfomation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMake)
                            .addComponent(jlTransmission)
                            .addComponent(jcbMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlModel)
                            .addComponent(jcbModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlEngine)
                            .addComponent(jtfEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlYear))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlDrivetrain)
                                .addComponent(jcbDrivetrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbBodyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlMileage)
                                .addComponent(jtfMileage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlBodyType))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlColor)
                            .addComponent(jcbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCylinders)
                            .addComponent(jtfCylinders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlGas)
                            .addComponent(jcbGasType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlVehicleType))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVIN)
                    .addComponent(jtfVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jlPurchaseInformation)
                .addGap(107, 107, 107)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jbAdd)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfYearActionPerformed

    private void jcbBodyTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBodyTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbBodyTypeActionPerformed

    private void jtfMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMileageActionPerformed

    private void jtfCylindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCylindersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCylindersActionPerformed

    private void jtfVINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfVINActionPerformed

    private void jcbMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMakeActionPerformed
        // TODO add your handling code here:

        this.jcbModel.removeAllItems();

        if(this.jcbMake.getSelectedIndex() != 0)
        {
            String selectedMake = (String) this.jcbMake.getSelectedItem();
            for(String model : this.modelDictionary.get(selectedMake))
            {
                this.jcbModel.addItem(model);
            }
        }

    }//GEN-LAST:event_jcbMakeActionPerformed

    private String stringFromDropDown(JComboBox comboBox)
    {
        String dropDownString;
        if(comboBox.getSelectedIndex() == 0)
        {
            return null;
        }

        return (String) comboBox.getSelectedItem();

    }

    private String stringFromTextfield(JTextField textField)
    {
        String textFieldString;

        if(textField.getText().equals(""))
        {
            return null;
        }

        return textField.getText();
    }

    /**
     * Clear all the textfields and combo boxes
     */
    private void clearFields()
    {
        for(JTextField panelTextField : this.textFields)
        {
            panelTextField.setText("");
        }

        for(JComboBox panelComboBox : this.comboBoxes)
        {
            if(panelComboBox == this.jcbModel)
            {
                this.jcbModel.addItem("-Model-");
            }

            panelComboBox.setSelectedIndex(0);
        }
    }

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt)
    {            
        ArrayList<String> errors = new ArrayList<>();
        int result;
        double dresult;
        
        String make = FormHandler.stringFromDropDown(this.jcbMake);
        if (make == null) {
            errors.add("Invalid Make");
        }
        String transmission = FormHandler.stringFromDropDown(this.jcbTransmission);
        String color = FormHandler.stringFromDropDown(jcbColor);
        String model = (String) this.jcbModel.getSelectedItem();

        if(model.equals("-Model-"))
        {
            model = null;
        }
        String engineLiters = FormHandler.stringFromTextfield(jtfEngine);
        if (engineLiters != null) {
            try {
                dresult = Double.parseDouble(engineLiters);
            } catch(NumberFormatException e){
                errors.add("Invalid Engine Displacement");
            }
        }
        
        String cylinders = FormHandler.stringFromTextfield(jtfCylinders);
        if (cylinders != null) {
            try {
                result = Integer.parseInt(cylinders);
            } catch(NumberFormatException e){
                errors.add("Invalid Cylinders");
            }
        }
        
        String year = FormHandler.stringFromTextfield(jtfYear);
        if (year != null) {
            try {
                result = Integer.parseInt(year);
            } catch(NumberFormatException e){
                errors.add("Invalid Year");
            }
        }
        
        String driveTrain = FormHandler.stringFromDropDown(this.jcbDrivetrain);
        String gas = FormHandler.stringFromDropDown(this.jcbGasType);
        String mileage = FormHandler.stringFromTextfield(jtfMileage);
        if (mileage != null) {
            try {
                result = Integer.parseInt(mileage);
            } catch(NumberFormatException e){
                errors.add("Invalid Mileage");
            }
        }
        
        String bodyType = FormHandler.stringFromDropDown(this.jcbBodyType);
        String vehicleType = FormHandler.stringFromDropDown(this.jcbVehicleType);
        String vin = FormHandler.stringFromTextfield(jtfVIN);
        if (vin != null) {
            if (!vin.matches("^[^\\Wioq]{17}$")) {
                errors.add("Invalid Vin");
            }
        }

        if (!errors.isEmpty()) {
            System.out.println("Errors");
            StringBuilder builder = new StringBuilder();
            for (String substring : errors) {
                builder.append(substring);
                builder.append("\n");
            }
            String message = builder.toString();
            JOptionPane.showMessageDialog(this,
                message,
                "Error",
                JOptionPane.ERROR_MESSAGE);
                return;
        }
        Map intFields = new HashMap<String, String>();
        Map stringFields = new HashMap<String, String>();

        stringFields.put("Vin", vin);
        stringFields.put("Make", make);
        stringFields.put("Transmission", transmission);
        stringFields.put("Model", model);
        stringFields.put("Color", color);
        intFields.put("Year", year);
        intFields.put("Mileage", mileage);
        intFields.put("Engine_Liters", engineLiters);
        intFields.put("Engine_Cylinders", cylinders);
        stringFields.put("Body_Type", bodyType);
        stringFields.put("Vehicle_Type", vehicleType);
        stringFields.put("Drivetrain", driveTrain);
        stringFields.put("Gas", gas);
        stringFields.put("Status", "New");

        Database database = new Database();
        database.insertCar(stringFields, intFields);

        String sqlStatement = String.format("select * from Cars where Vin = '%s'", vin);
        Car insertedCar = database.carsFromResults(database.executeQuery(sqlStatement))[0];

        database.recordCarHistory(insertedCar, "New");

        this.clearFields();

    }                                     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel18;
    private javax.swing.JButton jbAdd;
    private javax.swing.JComboBox jcbBodyType;
    private javax.swing.JComboBox jcbColor;
    private javax.swing.JComboBox jcbDrivetrain;
    private javax.swing.JComboBox jcbGasType;
    private javax.swing.JComboBox jcbMake;
    private javax.swing.JComboBox jcbModel;
    private javax.swing.JComboBox jcbTransmission;
    private javax.swing.JComboBox jcbVehicleType;
    private javax.swing.JLabel jlBodyType;
    private javax.swing.JLabel jlColor;
    private javax.swing.JLabel jlCylinders;
    private javax.swing.JLabel jlDrivetrain;
    private javax.swing.JLabel jlEngine;
    private javax.swing.JLabel jlGas;
    private javax.swing.JLabel jlMake;
    private javax.swing.JLabel jlMileage;
    private javax.swing.JLabel jlModel;
    private javax.swing.JLabel jlPurchaseInformation;
    private javax.swing.JLabel jlTransmission;
    private javax.swing.JLabel jlVIN;
    private javax.swing.JLabel jlVehicleInfomation;
    private javax.swing.JLabel jlVehicleType;
    private javax.swing.JLabel jlYear;
    private javax.swing.JTextField jtfCylinders;
    private javax.swing.JTextField jtfEngine;
    private javax.swing.JTextField jtfMileage;
    private javax.swing.JTextField jtfVIN;
    private javax.swing.JTextField jtfYear;
    // End of variables declaration//GEN-END:variables
}
