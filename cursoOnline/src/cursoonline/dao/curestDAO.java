package cursoonline.dao;

import cursoonline.entidades.Curso;
import cursoonline.entidades.CursoEstudiante;
import cursoonline.entidades.Estudiante;
import java.util.List;

public interface curestDAO {
	
	List<CursoEstudiante> getCursos_estudiante();
	public void ingresar(CursoEstudiante curestu);
	public void actualizar(CursoEstudiante curestu);
	public void eliminar(int id);

}
