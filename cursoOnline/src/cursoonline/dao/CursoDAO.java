
package cursoonline.dao;
import cursoonline.entidades.Curso;
import cursoonline.entidades.Estudiante;
import java.util.List;

public interface CursoDAO {
    void ingresar(Curso curso);
    void actualizar(Curso curso);
    void eliminar(int id);
    List<Curso> getCursos();
    List<Estudiante> getEstudiantePorCurso(int cursoId);
    
}
