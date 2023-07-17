package com.rvj.pagamentos.entities;

public class Controle {

    private String banco;
    private String lote;
    private String registro;

    public Controle(String arquivoString) {
        this.banco = arquivoString.substring(0,3);
        this.lote = arquivoString.substring(3, 7);
        this.registro = arquivoString.substring(7,8);
    }

    public String getBanco() {
        return banco;
    }

    public String getLote() {
        return lote;
    }

    public String getRegistro() {
        return registro;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Controle{" +
                "banco='" + banco + '\'' +
                ", lote='" + lote + '\'' +
                ", registro='" + registro + '\'' +
                '}';
    }
}
