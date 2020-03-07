
package org.test.module.search.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.crealogix.dbh.search.repository")
public class Elastic {

//    @Value("${elasticsearch.host}")
//    private String EsHost;
//    @Value("${elasticsearch.port}")
//    private int EsPort;
//
//    @Bean
//    public RestHighLevelClient client() {
//        return new RestHighLevelClient(
//                RestClient.builder(
//                        new HttpHost(EsHost, EsPort, "http")
//                ));
//    }
//
//    @Bean
//    public ElasticsearchOperations elasticsearchTemplate() {
//        return new ElasticsearchRestTemplate(client());
//    }

//Embedded Elasticsearch Server
    /*@Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
    }*/
}

