package org.test.module.search.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Document(indexName = "searchable", type = "searchable")
public class Searchable {

    @Id
    private String uuid = UUID.randomUUID().toString();

    //private List<SearchableField> fields;
    @Field(type = FieldType.Auto, includeInParent = true)
    private List<String> fields = new ArrayList<>();

    public Searchable() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    //public List<SearchableField> getFields() {
    //  return fields;
    //}

    public List<String> getFields() {
        return fields;
    }



    /*public void setFields(List<SearchableField> fields) {
        this.fields = fields;
    }
    */

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public void addField(String field) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(field);
    }

/*    public void addField(SearchableField field) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        //this.fields.add(field);
    }*/


}
