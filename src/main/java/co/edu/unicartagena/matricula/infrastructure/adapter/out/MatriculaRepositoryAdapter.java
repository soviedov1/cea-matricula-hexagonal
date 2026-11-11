
package co.edu.unicartagena.matricula.infrastructure.adapter.out;

import co.edu.unicartagena.matricula.application.port.out.MatriculaRepositoryPort;
import co.edu.unicartagena.matricula.domain.aggregate.MatriculaAcademica;
import co.edu.unicartagena.matricula.domain.valueobject.MatriculaId;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MatriculaRepositoryAdapter implements MatriculaRepositoryPort {
    private final Map<String, MatriculaAcademica> baseDeDatos = new HashMap<>();

    @Override
    public void guardar(MatriculaAcademica matricula) {
        baseDeDatos.put(matricula.getId().getValor(), matricula);
    }

    @Override
    public Optional<MatriculaAcademica> buscarPorId(MatriculaId id) {
        return Optional.ofNullable(baseDeDatos.get(id.getValor()));
    }
}