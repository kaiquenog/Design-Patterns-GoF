package strategy.imposto;

public class CalculadorDeImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){

        double impostoCalculado = imposto.calculaImposto(orcamento);
        System.out.println(impostoCalculado);
    }

}
