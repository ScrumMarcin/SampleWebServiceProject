package com.aadityatiwari.learn.webservices.sample.complex;

/**
 * Defines a simple JavaBean called BasicStruct that has integer, String,
 * and String[] properties
 */
public class BasicStruct {
    // Properties
    private int intValue;
    private String stringValue;
    private String[] stringArray;
    
    // Getter and setter methods
    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public String toString() {
        return "IntValue=" + intValue + ", StringValue=" + stringValue;
    }
}
