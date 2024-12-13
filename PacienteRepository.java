package repository;

import model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {
    private List<Paciente> pacientes = new ArrayList<>();

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacientes;
    }

    public void editarPaciente(Paciente paciente, String novoNome) {
        paciente.setNome(novoNome);
    }

    public void excluirPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }
    
    public boolean verificarCpfDuplicado(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void listarTodosPacientes() {
        for (Paciente p : pacientes) {
            System.out.println(p);
        }
    }

 
  

}

