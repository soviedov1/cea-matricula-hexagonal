package co.edu.unicartagena.matricula.application.port.in;

import co.edu.unicartagena.matricula.domain.aggregate.MatriculaAcademica;

public interface InscribirAsignaturaUseCase {
    MatriculaAcademica ejecutar(String matriculaId, String codigoAsignatura, String nombreAsignatura, int creditos, double valorUnitario);
}