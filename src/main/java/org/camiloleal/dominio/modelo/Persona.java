package org.camiloleal.dominio.modelo;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class Persona {
    private int id;
    private String nombres;
    private String apellidos;
    private String telefono;
    private int edad;
}
