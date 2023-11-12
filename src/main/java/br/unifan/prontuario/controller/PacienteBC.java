
package br.unifan.prontuario.controller;
import br.unifan.prontuario.dao.PacienteDAO;
import br.unifan.prontuario.model.Paciente;
import java.util.ArrayList;

public class PacienteBC {
    private final PacienteDAO = new PacienteDAO();
    
    public void salvar(Paciente paciente){
        this.dao.salvar(paciente);
    }

    public ArrayList <Paciente> obterPacientes(){
        return this.dao.obterPacientes();
    }



}


