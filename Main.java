package Main; 

import model.Paciente;
import model.Dentista;
import model.Consulta;
import repository.PacienteRepository;
import repository.DentistaRepository;
import repository.ConsultaRepository;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        PacienteRepository pacienteRepo = new PacienteRepository();
        DentistaRepository dentistaRepo = new DentistaRepository();
        ConsultaRepository consultaRepo = new ConsultaRepository();

        
        Paciente paciente1 = new Paciente("João Silva", "12345678901", "123456789", "joao@email.com", "Rua A", new Date());
        Dentista dentista1 = new Dentista("Dr. Marcos", "CRM123", "987654321", "marcos@email.com");

       
        pacienteRepo.adicionarPaciente(paciente1);
        dentistaRepo.adicionarDentista(dentista1);

        
        Consulta consulta1 = new Consulta(paciente1, dentista1, new Date(), "Consulta de rotina");

       
        consultaRepo.agendarConsulta(consulta1);

 
        System.out.println("Consultas Agendadas:");
        for (Consulta consulta : consultaRepo.listarConsultas()) {
            System.out.println(consulta);
        }
    }
}
