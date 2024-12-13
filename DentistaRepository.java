package repository;

import model.Dentista;
import java.util.ArrayList;
import java.util.List;

public class DentistaRepository {
    private List<Dentista> dentistas = new ArrayList<>();

    public void adicionarDentista(Dentista dentista) {
        dentistas.add(dentista);
    }

    public List<Dentista> listarDentistas() {
        return dentistas;
    }

    public void editarDentista(Dentista dentista, String novoNome) {
        dentista.setNome(novoNome);
    }

    public void excluirDentista(Dentista dentista) {
        dentistas.remove(dentista);
    }
}
