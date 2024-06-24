package org.example.classes;

import javax.swing.JLabel;
import java.util.Arrays;

public class Display {
    String[] wholeValue;
    String[] fractionalValue;
    float value;
    JLabel valueLabel;

    public Display(){
        valueLabel = new JLabel(String.valueOf(value));
        wholeValue = new String[]{"0", "0", "0", "0", "0","0", "0", "0"};
        fractionalValue = new String[]{"0", "0", "0", "0", "0","0", "0", "0"};
        matchValue();
        System.out.println(value);
    }

    public void matchValue(){
        StringBuilder tempWholeValue;
        StringBuilder tempFractValue;
        StringBuilder tempCompleteValue;
        tempWholeValue =  new StringBuilder();
        tempFractValue =  new StringBuilder();
        tempCompleteValue = new StringBuilder();

        for (String val : wholeValue){
            tempWholeValue.append(val);
        }

        for (String val : fractionalValue){
            tempFractValue.append(val);
        }


        tempCompleteValue.append(tempWholeValue).append(".").append(tempFractValue).append("f");

        String tempAsString = String.valueOf(tempCompleteValue);
        value = Float.parseFloat(tempAsString);
        update();
    }

    public void pushWholeNumber(int number){
        int length = wholeValue.length - 2;
        for (int i = length; i > 0; i--){
            System.out.println(i);
            wholeValue[i + 1] = wholeValue[i];
        }

        wholeValue[length] = String.valueOf(number);
    }

    public void update(){
        valueLabel.setText(String.valueOf(value));
    }
}
