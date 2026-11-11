package co.edu.unicartagena.matricula.domain.aggregate;

import co.edu.unicartagena.matricula.domain.entity.AsignaturaInscrita;
import co.edu.unicartagena.matricula.domain.entity.Estudiante;
import co.edu.unicartagena.matricula.domain.exception.EstudianteSancionadoException;
import co.edu.unicartagena.matricula.domain.exception.LimiteCreditosExcedidoException;
import co.edu.unicartagena.matricula.domain.valueobject.MatriculaId;
import co.edu.unicartagena.matricula.domain.valueobject.MontoMatricula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatriculaAcademica {
    private static final int MAXIMO_CREDITOS = 22;

    private final MatriculaId id;
    private final Estudiante estudiante;
    private final List<AsignaturaInscrita> asignaturas;
    private String estado;
    private MontoMatricula montoTotal;

    public MatriculaAcademica(MatriculaId id, Estudiante estudiante) {
        if (estudiante.isTieneSancionFinanciera()) {
            throw new EstudianteSancionadoException("El estudiante tiene sanciones activas y no puede matricularse.");
        }
        this.id = id;
        this.estudiante = estudiante;
        this.asignaturas = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.montoTotal = new MontoMatricula(0.0);
    }

    public void agregarAsignatura(AsignaturaInscrita asignatura) {
        int creditosTotales = calcularTotalCreditos() + asignatura.getCreditos();
        if (creditosTotales > MAXIMO_CREDITOS) {
            throw new LimiteCreditosExcedidoException("Supera el límite máximo permitido de 22 créditos.");
        }
        this.asignaturas.add(asignatura);
    }

    public void calcularYAsignarMonto(MontoMatricula nuevoMonto) {
        this.montoTotal = nuevoMonto;
    }

    public void confirmarMatricula() {
        if (this.asignaturas.isEmpty()) {
            throw new IllegalStateException("No se puede confirmar una matrícula sin asignaturas.");
        }
        this.estado = "CONFIRMADA";
    }

    public int calcularTotalCreditos() {
        return asignaturas.stream().mapToInt(AsignaturaInscrita::getCreditos).sum();
    }

    public MatriculaId getId() { return id; }
    public Estudiante getEstudiante() { return estudiante; }
    public List<AsignaturaInscrita> getAsignaturas() { return Collections.unmodifiableList(asignaturas); }
    public String getEstado() { return estado; }
    public MontoMatricula getMontoTotal() { return montoTotal; }
}