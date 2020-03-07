package org.test.module.search.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Document
public class LookupModel {

    @Id
    private UUID uuid = UUID.randomUUID();

    private List<SearchableField> fields;

    public LookupModel() {}

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public List<SearchableField> getFields() {
        return fields;
    }

    public void setFields(List<SearchableField> fields) {
        this.fields = fields;
    }

    public void addField(SearchableField field) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(field);
    }


}
