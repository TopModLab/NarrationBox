package edu.tamu.narrationbox.model;

import lombok.Data;

@Data
public class StateValues {
    private String causality;
    private String StateDescriptorId;
    private double[] value;
    private String valueAtIndexOfLargestComponent;
    private String stateText;
    private String expressionText;
}
