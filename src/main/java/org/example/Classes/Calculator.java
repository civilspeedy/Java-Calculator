package org.example.Classes;

public class Calculator {
    public float basic (float val_1, float val_2, String operation){
        return switch (operation) {
            case "add" -> val_1 + val_2;
            case "sub" -> val_1 - val_2;
            case "div" -> val_1 / val_2;
            default -> 0.0f;
        };
    }
}
