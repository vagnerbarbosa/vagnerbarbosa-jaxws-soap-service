package com.vagnerbarbosa.soap.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.vagnerbarbosa.soap.service.Service")
public class ServiceImpl implements Service {

    @Override
    public String operationService(String mensage) {
        return "Usando o procolo SOAP com JAX-WS: " + mensage;
    }
}
