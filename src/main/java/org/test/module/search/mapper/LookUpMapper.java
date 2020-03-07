package org.test.module.search.mapper;

import org.test.module.search.dto.LookupDto;
import org.test.module.search.dto.SearchableFieldDto;
import org.test.module.search.model.LookupModel;
import org.test.module.search.model.SearchableField;
import org.springframework.stereotype.Component;

@Component
public class LookUpMapper {

    public LookupDto toDto(LookupModel in){
        LookupDto out = new LookupDto();
        out.setUuid(in.getUuid());

        in.getFields().forEach(inField -> out.addField(new SearchableFieldDto(inField)));

        return out;
    }

    public LookupModel toModel (LookupDto in){
        LookupModel out = new LookupModel();
        out.setUuid(in.getUuid());

        in.getFields().forEach(inField -> out.addField(new SearchableField(inField)));
        return out;
    }
}
