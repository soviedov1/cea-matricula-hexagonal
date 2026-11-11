package co.edu.unicartagena.matricula.domain.entity;

public class AsignaturaInscrita {
    private final String codigoAsignatura;
    private final String nombre;
    private final int creditos;
    private final double valorUnitario;

    public AsignaturaInscrita(String codigoAsignatura, String nombre, int creditos, double valorUnitario) {
        if (creditos <= 0) {
            throw new IllegalArgumentException("La asignatura debe tener al menos 1 crédito.");
        }
        this.codigoAsignatura = codigoAsignatura;
        this.nombre = nombre;
        this.creditos = creditos;
        this.valorUnitario = valorUnitario;
    }

    public String getCodigoAsignatura() { return codigoAsignatura; }
    public String getNombre() { return nombre; }
    public int getCreditos() { return creditos; }
    public double getValorUnitario() { return valorUnitario; }
}