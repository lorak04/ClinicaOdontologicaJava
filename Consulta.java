package model;

import java.util.Date;

public class Consulta {
    private Paciente paciente;
    private Dentista dentista;
    private Date dataConsulta;
    private String descricao;

    public Consulta(Paciente paciente, Dentista dentista, Date dataConsulta, String descricao) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.dataConsulta = dataConsulta;
        this.descricao = descricao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Consulta [paciente=" + paciente.getNome() + ", dentista=" + dentista.getNome() + ", dataConsulta=" + dataConsulta + "]";
    }
}
