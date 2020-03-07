package org.test.module.search.rest;

import org.test.module.search.dto.LookupDto;
import org.test.module.search.service.SearchService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class SearchController {

    private SearchService service;

    public SearchController(SearchService service) {
        this.service = service;
    }

    @PostMapping(value = "/lookup", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public List<LookupDto> lookup(@RequestBody LookupDto body) {
        System.out.println("Request body:" + body.toString());
        return service.lookup();
    }


}
