package cursoonline.dao;

import cursoonline.entidades.Curso;
import cursoonline.entidades.Estudiante;
import java.util.List;

public interface estudianteDAO {

    void ingresar(Estudiante estudiante);

    void actualizar(Estudiante estdudiante);

    void eliminar(int id);

    List<Estudiante> getEstudiante();

    List<Curso> getCursosPorEstudiante(int estudianteId);

}
