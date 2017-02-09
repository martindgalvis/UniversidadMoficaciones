/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author mdgalvis
 */
public class Curso {

    private int nrc;
    private Profesor profesor;
    private Estudiante estudiante;

    public int getNrc() {
        return nrc;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == null) {
            this.profesor = profesor;
        }

    }

    public void setEstudiante(Estudiante estudiante) {
        if (this.estudiante == null) {
            this.estudiante = estudiante;
        }

    }

    public Curso(int nrc) {
        this.nrc = nrc;

    }

}
