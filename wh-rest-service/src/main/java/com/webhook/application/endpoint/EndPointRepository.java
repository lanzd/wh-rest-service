package com.webhook.application.endpoint;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "endpoint", path = "endpoint")
public interface EndPointRepository extends MongoRepository<EndPoint,Long> {
}
