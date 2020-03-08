package org.test.module.search.dto;

import org.test.module.search.model.SearchableField;

public class SearchableFieldDto {

    private String key;
    private Object value;

    public SearchableFieldDto(String key, Object value) {
        this.key = key;
        this.value = value;
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

/*    public SearchableFieldDto(SearchableField model){
        this.key = model.getKey();
        this.value = model.getValue();
    }*/

}
