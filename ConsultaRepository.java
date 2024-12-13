package repository;

import model.Consulta;
import java.util.ArrayList;
import java.util.List;

public class ConsultaRepository {
    private List<Consulta> consultas = new ArrayList<>();

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultas;
    }

    public void excluirConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }
}
