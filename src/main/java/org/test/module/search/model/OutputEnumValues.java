package org.test.module.search.model;

public enum OutputEnumValues {

    TRES("c"),
    DOS("b"),
    UNO("a")
    ;

    private String label;

    private OutputEnumValues(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
