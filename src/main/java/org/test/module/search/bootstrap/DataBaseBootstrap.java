package org.test.module.search.bootstrap;


import org.test.module.search.model.Criteria;
import org.test.module.search.model.Searchable;
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
        criteriaRepository.deleteAll();
        searchRepository.deleteAll();

        criteriaRepository.saveAll(getCriteria());
        searchRepository.saveAll(getSearch());

        LOGGER.debug("Loading Bootstrap Data");
    }

    private List<Searchable> getSearch() {
        List<Searchable> searchableList = new ArrayList<>();
        Searchable s = new Searchable();
        s.addField("name-Jordi");
        s.addField("position-Solution Architect");
        s.addField("birthday-" + LocalDate.of(1976, 3, 14));


        //s.addField(new SearchableField("name", "Jordi"));
        //s.addField(new SearchableField("position", "Solution Architect"));
        //s.addField(new SearchableField("birthday", LocalDate.of(1976, 3, 14)));

        searchableList.add(s);
        return searchableList;
    }

    private List<Criteria> getCriteria() {
        List<Criteria> criteriaList = new ArrayList<>();

        Criteria criteria = new Criteria();
        criteria.setModule("DBH_Test");
        criteria.setFieldNames(Arrays.asList("name", "position", "birthday"));
        criteriaList.add(criteria);

        return criteriaList;
    }
}
