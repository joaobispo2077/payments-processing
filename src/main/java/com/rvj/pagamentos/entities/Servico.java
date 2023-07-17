package com.rvj.pagamentos.entities;

public class Servico {

    private String operacao;
    private String servico;
    private String formaLancamento;
    private String layoutLote;

    public Servico(String arquivoString) {
        this.operacao = arquivoString.substring(8, 9);
        this.servico = arquivoString.substring(9,11);
        this.formaLancamento = arquivoString.substring(11,13);
        this.layoutLote = arquivoString.substring(13,16);
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getFormaLancamento() {
        return formaLancamento;
    }

    public void setFormaLancamento(String formaLancamento) {
        this.formaLancamento = formaLancamento;
    }

    public String getLayoutLote() {
        return layoutLote;
    }

    public void setLayoutLote(String layoutLote) {
        this.layoutLote = layoutLote;
    }
}
