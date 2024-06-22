package org.example.classes;

import javax.swing.JLabel;
import java.util.ArrayList;

public class Display {
    float value;
    ArrayList<Integer> displayArray;
    JLabel valueLabel;

    public Display(){
        valueLabel = new JLabel("0");
        value = 0;
        displayArray = new ArrayList<>();
    }

    public void pushNumber(int number){
        displayArray.add(number);
    }

    public String arrayToString(ArrayList<Integer> array){
        StringBuilder string = new StringBuilder();
        for (int item: array){
            string.append(item);
        }
        return string.toString();
    }
}
