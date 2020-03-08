#Elastic search 

######Official Spring documentation
https://docs.spring.io/spring-data/elasticsearch/docs/3.2.5.RELEASE/reference/html/#reference


######Download Docker image
$ sudo docker pull elasticsearch:6.8.4

$ sudo docker network create somenetwork

$ sudo docker run -d --name elasticsearch --net somenetwork -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:6.8.4

More instructions at https://hub.docker.com/_/elasticsearch

######Kibana:
$ sudo sudo docker pull kibana:6.8.7

$ sudo docker run -d --name kibana --net somenetwork -p 5601:5601 kibana:6.8.7

######Grafana
$ sudo docker pull grafana/grafana

$ sudo docker run -d --name=grafana -p 3000:3000 grafana/grafana