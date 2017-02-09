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
public class Estudiante {

    private int id;
    private String nombre;
    ArrayList<Curso> cursos;

    public Estudiante(int id) {
        this.id = id;
        cursos = new ArrayList();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);

    }

}
