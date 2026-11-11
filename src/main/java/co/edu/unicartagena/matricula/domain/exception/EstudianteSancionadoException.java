package co.edu.unicartagena.matricula.domain.exception;

public class EstudianteSancionadoException extends RuntimeException {
    public EstudianteSancionadoException(String mensaje) {
        super(mensaje);
    }
}