package com.rvj.pagamentos.entities;

public class Pagamento {

    private Controle controle;
    private Servico servico;

    public Pagamento(Controle controle, Servico servico) {
        this.controle = controle;
        this.servico = servico;
    }

    public Controle getControle() {
        return controle;
    }

    public void setControle(Controle controle) {
        this.controle = controle;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "controle=" + controle +
                ", servico=" + servico +
                '}';
    }
}
