package co.edu.unicartagena.matricula.domain.valueobject;

import java.util.Objects;

public final class MontoMatricula {
    private final double valor;

    public MontoMatricula(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("El monto de la matrícula no puede ser negativo.");
        }
        this.valor = valor;
    }

    public double getValor() { return valor; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MontoMatricula that = (MontoMatricula) o;
        return Double.compare(that.valor, valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}