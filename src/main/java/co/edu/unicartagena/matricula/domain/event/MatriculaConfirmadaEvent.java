package co.edu.unicartagena.matricula.domain.event;

import co.edu.unicartagena.matricula.domain.valueobject.MatriculaId;
import java.time.LocalDateTime;

public class MatriculaConfirmadaEvent {
    private final MatriculaId matriculaId;
    private final LocalDateTime fechaOcurrencia;

    public MatriculaConfirmadaEvent(MatriculaId matriculaId) {
        this.matriculaId = matriculaId;
        this.fechaOcurrencia = LocalDateTime.now();
    }

    public MatriculaId getMatriculaId() { return matriculaId; }
    public LocalDateTime getFechaOcurrencia() { return fechaOcurrencia; }
}