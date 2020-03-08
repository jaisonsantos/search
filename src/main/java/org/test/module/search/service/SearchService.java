package org.test.module.search.service;

import org.test.module.search.dto.LookupDto;
import org.test.module.search.mapper.LookUpMapper;
import org.test.module.search.model.Searchable;
import org.test.module.search.repository.SearchRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    private SearchRepository repository;
    private LookUpMapper mapper;

    public SearchService(SearchRepository repository, LookUpMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<LookupDto> lookup() {
        Iterable<Searchable> response = repository.findAll();
        response.forEach(System.out::println);
        List<LookupDto> responseDto = new ArrayList<>();
        response.forEach(r -> responseDto.add(mapper.toDto(r)));
        return responseDto;
    }
}
