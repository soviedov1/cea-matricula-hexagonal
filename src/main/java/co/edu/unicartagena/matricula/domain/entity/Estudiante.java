package co.edu.unicartagena.matricula.domain.entity;

import co.edu.unicartagena.matricula.domain.valueobject.CorreoInstitucional;
import co.edu.unicartagena.matricula.domain.valueobject.EstudianteId;

public class Estudiante {
    private final EstudianteId id;
    private final String nombreCompleto;
    private final CorreoInstitucional correo;
    private boolean tieneSancionFinanciera;
    private boolean tieneBeca;

    public Estudiante(EstudianteId id, String nombreCompleto, CorreoInstitucional correo, boolean tieneSancionFinanciera, boolean tieneBeca) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.tieneSancionFinanciera = tieneSancionFinanciera;
        this.tieneBeca = tieneBeca;
    }

    public EstudianteId getId() { return id; }
    public String getNombreCompleto() { return nombreCompleto; }
    public CorreoInstitucional getCorreo() { return correo; }
    public boolean isTieneSancionFinanciera() { return tieneSancionFinanciera; }
    public boolean isTieneBeca() { return tieneBeca; }
}