package org.example.classes;

import javax.swing.JLabel;

public class Display {
    float value;
    String stringValue;
    JLabel valueLabel;

    public Display(){
        valueLabel = new JLabel("0.0");
        value = 0;
        stringValue = "0";
    }

    public void updateDisplayValue(float newValue){
        String valueAsString = String.valueOf(newValue);
        value = newValue;
        stringValue = valueAsString;
        valueLabel.setText(stringValue);
    }

    public void updateDisplayValue(String newValue){
        value = Float.valueOf(newValue);
        stringValue = newValue;
        valueLabel.setText(stringValue);

    }

    public JLabel getLabel (){
        return valueLabel;
    }
}
