package org.test.module.search.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.test.module.search.model.Searchable;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SearchRepository extends ElasticsearchRepository<Searchable, String> {


}
