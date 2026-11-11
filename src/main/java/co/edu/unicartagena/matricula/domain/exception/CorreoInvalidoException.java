package co.edu.unicartagena.matricula.domain.exception;

public class CorreoInvalidoException extends RuntimeException {
    public CorreoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
