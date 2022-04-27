package org.camiloleal.infraestructura.rest.controladores;

import org.camiloleal.aplicacion.servicios.ServicioPersona;
import org.camiloleal.aplicacion.dtos.PersonaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public record ControladorPersona(ServicioPersona servicioPersona) {

    @GetMapping
    public ResponseEntity<List<PersonaDto>> obtenerPersonas() {
        return new ResponseEntity<>(this.servicioPersona.obtenerPersonas(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PersonaDto> create(@RequestBody PersonaDto personaDto) {
        return new ResponseEntity<>(servicioPersona.guardarPersona(personaDto), HttpStatus.CREATED);
    }

}
