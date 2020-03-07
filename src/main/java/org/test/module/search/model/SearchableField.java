package org.test.module.search.model;

import org.test.module.search.dto.SearchableFieldDto;

public class SearchableField {

    private String key;
    private Object value;

    public SearchableField(){}

    public SearchableField(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public SearchableField(SearchableFieldDto dto){
        this.key = dto.getKey();
        this.value = dto.getValue();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}
