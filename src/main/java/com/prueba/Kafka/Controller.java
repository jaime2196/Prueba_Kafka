package com.prueba.Kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class Controller {

    @Autowired
    private Servicio servicio;

    @GetMapping()
    public String enviarCola(@RequestBody Persona persona){
        servicio.enviarCola(persona);
        return "Enviado con exito";
    }
}
