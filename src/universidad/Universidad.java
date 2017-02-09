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
public class Universidad {

    private ArrayList<Curso> cursos;
    private ArrayList<Profesor> profesores;
    private ArrayList<Estudiante> Estudiantes;

    public void Universidad() {

        cursos = new ArrayList();
        profesores = new ArrayList();

    }

    public void agregarProfesor() {
        Profesor p1 = new Profesor(1);
        profesores.add(p1);

    }

    public void agregarCurso() {
        Curso c1 = new Curso(10);
        cursos.add(c1);

    }

    public void registrarCursoProfesor(Profesor p, Curso c) {
        p.cursos.add(c);
        c.setProfesor(p);

    }

    public void regitrarCursoEstudiante(Estudiante e, Curso c) {

        e.cursos.add(c);
        if (cursos.size() < 0x19) {
            c.setEstudiante(e);
        } else {
            System.out.println("Lo sentimos. El curso se encuentra lleno");
        }

    }

    public void cuantosCursosProfesor(Profesor p, Curso c) {

    }

    public void cuantosCursosEstudiante(Estudiante e, Curso c) {

    }

    public void cuantosEstudianteCurso(Curso c, Estudiante e) {

    }
//cuantos cursos profesor, cuantos cursos estudiantes, curso cuantos estudiantes

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
