package co.edu.unicartagena.matricula.domain.valueobject;

import java.util.Objects;

public final class MatriculaId {
    private final String valor;

    public MatriculaId(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID de la matrícula no puede estar vacío.");
        }
        this.valor = valor.trim();
    }

    public String getValor() { return valor; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatriculaId that = (MatriculaId) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}