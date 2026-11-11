package co.edu.unicartagena.matricula.domain.exception;

public class LimiteCreditosExcedidoException extends RuntimeException {
    public LimiteCreditosExcedidoException(String mensaje) {
        super(mensaje);
    }
}