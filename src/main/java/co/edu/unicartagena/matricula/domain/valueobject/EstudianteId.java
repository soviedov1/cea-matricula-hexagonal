package co.edu.unicartagena.matricula.domain.valueobject;

import java.util.Objects;

public final class EstudianteId {
    private final String valor;

    public EstudianteId(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID del estudiante no puede estar vacío.");
        }
        this.valor = valor.trim();
    }

    public String getValor() { return valor; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstudianteId that = (EstudianteId) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}