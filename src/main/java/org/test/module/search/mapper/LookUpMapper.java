package org.test.module.search.mapper;

import org.test.module.search.dto.LookupDto;
import org.test.module.search.dto.SearchableFieldDto;
import org.test.module.search.model.Searchable;
import org.test.module.search.model.SearchableField;
import org.springframework.stereotype.Component;

@Component
public class LookUpMapper {

    public LookupDto toDto(Searchable in){
        LookupDto out = new LookupDto();
        out.setUuid(in.getUuid());

        //in.getFields().forEach(inField -> out.addField(new SearchableFieldDto(inField)));
        in.getFields().forEach(out::addField);

        return out;
    }

    public Searchable toModel (LookupDto in){
        Searchable out = new Searchable();
        out.setUuid(in.getUuid());

        //in.getFields().forEach(inField -> out.addField(new SearchableField(inField)));
        in.getFields().forEach(out::addField);
        return out;
    }
}
