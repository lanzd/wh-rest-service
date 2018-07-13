package com.webhook.application.connector;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConnectorService {

    @Autowired
    ConnectorRepository connectorRepository;

    public Connector get(long connectorId) throws NotFoundException {
        Optional<Connector> optionalConnector = connectorRepository.findById(connectorId);
        if(optionalConnector.isPresent()){
            return optionalConnector.get();
        }
        throw new NotFoundException("no connector " + connectorId);
    }
}
