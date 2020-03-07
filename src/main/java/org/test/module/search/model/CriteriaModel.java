package org.test.module.search.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document
public class CriteriaModel {

    @Id
    private UUID uuid = UUID.randomUUID();
    private String module;
    private List<String> fieldNames;

    public UUID getUuid() {
        return uuid;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public List<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }



}
