package co.edu.unicartagena.matricula.domain.service;

import co.edu.unicartagena.matricula.domain.aggregate.MatriculaAcademica;
import co.edu.unicartagena.matricula.domain.valueobject.MontoMatricula;

public class CalcularCostoMatriculaService {
    private static final double VALOR_CREDITO = 50000.0;

    public MontoMatricula calcularCosto(MatriculaAcademica matricula) {
        int creditos = matricula.calcularTotalCreditos();
        double total = creditos * VALOR_CREDITO;
        
        if (matricula.getEstudiante().isTieneBeca()) {
            total = total * 0.5;
        }
        return new MontoMatricula(total);
    }
}