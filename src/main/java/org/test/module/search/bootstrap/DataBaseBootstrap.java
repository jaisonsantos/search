package org.test.module.search.bootstrap;


import org.test.module.search.model.CriteriaModel;
import org.test.module.search.model.LookupModel;
import org.test.module.search.model.SearchableField;
import org.test.module.search.repository.CriteriaRepository;
import org.test.module.search.repository.SearchRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataBaseBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private static Logger LOGGER = LoggerFactory.getLogger(DataBaseBootstrap.class);

    private final SearchRepository searchRepository;
    private final CriteriaRepository criteriaRepository;

    public DataBaseBootstrap(SearchRepository searchRepository, CriteriaRepository criteriaRepository) {
        this.searchRepository = searchRepository;
        this.criteriaRepository = criteriaRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        criteriaRepository.saveAll(getCriteria());
        searchRepository.saveAll(getSearch());

        LOGGER.debug("Loading Bootstrap Data");
    }

    private List<LookupModel> getSearch() {
        List<LookupModel> searchables = new ArrayList<>();
        LookupModel s = new LookupModel();
        s.addField(new SearchableField("name", "Jordi"));
        s.addField(new SearchableField("position", "Solution Architect"));
        s.addField(new SearchableField("birthday", LocalDate.of(1976, 3, 14)));
        searchables.add(s);
        return searchables;
    }

    private List<CriteriaModel> getCriteria() {
        List<CriteriaModel> criterias = new ArrayList<>();

        CriteriaModel criteria = new CriteriaModel();
        criteria.setModule("DBH_Test");
        criteria.setFieldNames(Arrays.asList("name", "position", "birthday"));
        criterias.add(criteria);

        return criterias;
    }
}
