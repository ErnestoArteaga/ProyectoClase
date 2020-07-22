package cursoonline.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cursoonline.entidades.Estudiante;
import cursoonline.entidades.Estudiante;
import cursoonline.dao.curestDAO;
import curso.util.util;
import cursoonline.entidades.CursoEstudiante;

public class curestDAOimpl implements curestDAO {

    @Override
    public List<CursoEstudiante> getCursos_estudiante() {
        List<CursoEstudiante> estudiante = new ArrayList<>();
        Connection con;

        try {
            con = DriverManager.getConnection(util.url, util.user, util.password);

            String sql = "SELECT id, curso_id, estudiante_id\r\n"
                    + "	FROM public.cursos_estudiantes;";

            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                CursoEstudiante estudiant = new CursoEstudiante(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                estudiante.add(estudiant);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiante;

    }

    @Override
    public void ingresar(CursoEstudiante curestu) {

        String query = "INSERT INTO public.cursos_estudiantes(id, curso_id, estudiante_id)VALUES (?, ?, ?)";
        Connection conn;
        try {
            conn = DriverManager.getConnection(util.url, util.user, util.password);

            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, curestu.getId());
            stm.setInt(2, curestu.getCursos_id());
            stm.setInt(3, curestu.getEsudiantes_id());

            stm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(CursoEstudiante curestu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
