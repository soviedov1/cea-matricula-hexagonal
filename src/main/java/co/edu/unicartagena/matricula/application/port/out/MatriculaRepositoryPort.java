package co.edu.unicartagena.matricula.application.port.out;

import co.edu.unicartagena.matricula.domain.aggregate.MatriculaAcademica;
import co.edu.unicartagena.matricula.domain.valueobject.MatriculaId;
import java.util.Optional;

public interface MatriculaRepositoryPort {
    void guardar(MatriculaAcademica matricula);
    Optional<MatriculaAcademica> buscarPorId(MatriculaId id);
}