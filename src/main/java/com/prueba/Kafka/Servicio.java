package com.prueba.Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    @Autowired
    private KafkaTemplate<String,Persona> kafkaTemplate;

    void enviarCola(Persona persona){
        kafkaTemplate.send("topic", persona);
    }
}
