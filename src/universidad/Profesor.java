/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author mdgalvis
 */
public class Profesor {

    private int id;
    private String Nombre;

    ArrayList<Curso> cursos;

    public Profesor(int id) {
        this.id = id;
        cursos = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean agregarCurso(Curso curso) {
        if (cursos.size() > 10) {
            cursos.add(curso);

            return true;
        }
        return false;
    }

}
