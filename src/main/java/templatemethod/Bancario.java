package templatemethod;

public class Bancario extends Funcionario{
    @Override
    public double calcularPLR(double percentualMetas) {
        return this.getSalario() * (1.5 + percentualMetas / 100);
    }
}
