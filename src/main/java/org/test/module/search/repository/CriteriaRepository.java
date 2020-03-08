package org.test.module.search.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.test.module.search.model.Criteria;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CriteriaRepository extends ElasticsearchRepository<Criteria, String> {

}
