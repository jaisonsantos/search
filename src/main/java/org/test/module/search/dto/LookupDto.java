package org.test.module.search.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LookupDto {

    private UUID uuid;

    private List<SearchableFieldDto> fields = new ArrayList<>();

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public List<SearchableFieldDto> getFields() {
        return fields;
    }

    public void setFields(List<SearchableFieldDto> fields) {
        this.fields = fields;
    }

    public void addField(SearchableFieldDto field){
        this.fields.add(new SearchableFieldDto(field.getKey(), field.getValue()));
    }
}
