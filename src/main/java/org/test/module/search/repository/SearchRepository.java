package org.test.module.search.repository;

import org.test.module.search.model.LookupModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SearchRepository extends CrudRepository<LookupModel, UUID> {


}
