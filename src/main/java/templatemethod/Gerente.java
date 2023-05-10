package templatemethod;

public class Gerente extends Funcionario{
    @Override
    public double calcularPLR(double percentualMetas) {
        return this.getSalario() * (2.5 + percentualMetas / 100);
    }
}
