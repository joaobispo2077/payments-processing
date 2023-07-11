package com.rvj.pagamentos.entities;

public class Pagamento {

    private String banco;
    private String lote;
    private String registro;

    public Pagamento(String arquivoString) {
        this.banco = arquivoString.substring(0, 2);
        this.lote = arquivoString.substring(3, 6);
        this.registro = arquivoString.substring(7);
    }

    public String getBanco() {
        return this.banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getLote() {
        return this.lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getRegistro() {
        return this.registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
}
