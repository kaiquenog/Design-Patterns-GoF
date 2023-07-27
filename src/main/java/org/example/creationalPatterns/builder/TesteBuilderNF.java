package org.example.creationalPatterns.builder;

public class TesteBuilderNF {


    public static void main(String[] args) {

        ItemDaNotaBuilder item = new ItemDaNotaBuilder()
                .comDescricao("Item1")
                .comValor(1000)
                .comDescricao("Item2")
                .comValor(200);

        NotaFiscalBuilder builder = new NotaFiscalBuilder()
                .comCnpj("123456789")
                .comItem(item.constroi())
                .comObservacoes("Obs: 123")
                .naDataAtual()
                .paraEmpresa("ABCD LTDA");
        builder.constroi();



    }


}
