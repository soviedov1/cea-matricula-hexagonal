package co.edu.unicartagena.matricula.domain.valueobject;

import co.edu.unicartagena.matricula.domain.exception.CorreoInvalidoException;
import java.util.Objects;

public final class CorreoInstitucional {
    private final String valor;

    public CorreoInstitucional(String valor) {
        if (valor == null || !valor.endsWith("@unicartagena.edu.co")) {
            throw new CorreoInvalidoException("El correo debe ser institucional con dominio @unicartagena.edu.co");
        }
        this.valor = valor.trim().toLowerCase();
    }

    public String getValor() { return valor; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CorreoInstitucional that = (CorreoInstitucional) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}