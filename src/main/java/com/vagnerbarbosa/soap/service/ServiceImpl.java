package com.vagnerbarbosa.soap.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.vagnerbarbosa.soap.service.Service")
public class ServiceImpl implements Service {

    @Override
    public String operationService(String message) {
        return "Usando o procolo SOAP com JAX-WS: " + message;
    }
}
