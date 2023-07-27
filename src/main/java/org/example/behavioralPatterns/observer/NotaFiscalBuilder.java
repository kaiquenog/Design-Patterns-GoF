package org.example.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;

    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;



    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;

        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;

        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.data = Calendar.getInstance();

        return this;
    }

    public NotaFiscalBuilder naDataAtual(Calendar novaData) {
        this.data = novaData;

        return this;
    }

    public NotaFiscal constroi() {
        NotaFiscal notaFiscal  = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);

        for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
            acao.executa(notaFiscal);
        }

        return notaFiscal;

    }

    private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

    public NotaFiscalBuilder() {
        this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
        this.data = Calendar.getInstance();
    }

    public NotaFiscalBuilder(List<AcaoAposGerarNota> lista) {
        this.todasAcoesASeremExecutadas = lista;
        this.data = Calendar.getInstance();
    }

    public void adicionaAcao(AcaoAposGerarNota novaAcao) {
        this.todasAcoesASeremExecutadas.add(novaAcao);
    }

}