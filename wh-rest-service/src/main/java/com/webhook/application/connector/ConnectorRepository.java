package com.webhook.application.connector;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "connector", path = "connector")
public interface ConnectorRepository extends MongoRepository<Connector,Long> {
}
