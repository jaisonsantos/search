package org.test.module.search.model;

public enum InputEnumValues {

    ONE("a"),
    TWO("b"),
    THREE("c");

    private String label;

    InputEnumValues(String label){
            this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
