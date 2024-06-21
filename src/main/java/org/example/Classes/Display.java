package org.example.Classes;

public class Display {
    static float value;
    static String stringValue;

    public Display(){
        value = 0;
        stringValue = "0";
    }

    public void updateDisplayValue(int newValue){
        String valueAsString = String.valueOf(newValue);
        value = newValue;
        stringValue = valueAsString;

    }
}
