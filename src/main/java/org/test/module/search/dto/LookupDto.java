package org.test.module.search.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LookupDto {

    private String uuid;

    //private List<SearchableFieldDto> fields = new ArrayList<>();
    private List<String> fields = new ArrayList<>();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    /*
    public List<SearchableFieldDto> getFields() {
        return fields;
    }

    public void setFields(List<SearchableFieldDto> fields) {
        this.fields = fields;
    }


    public void addField(SearchableFieldDto field){
        this.fields.add(new SearchableFieldDto(field.getKey(), field.getValue()));
    }
*/
    public void addField(String field){
        this.fields.add(field);
    }

}
