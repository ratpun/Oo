
public class Funcionario
{
    private double salariobruto;
    private double valorhrextra;
    private int numerodehrextra;
    private double salarioliquido;
    
    public void setSalarioBruto(double salariobruto)
    {
        this.salariobruto = salariobruto;
    }
    
    public void HorasExtras(double valorhrextra, int numerodehrextra)
    {
        this.valorhrextra = valorhrextra;
        this.numerodehrextra = numerodehrextra;
    }
    
    public double CalcularSalarioLiquido()
    {
        this.salarioliquido = salariobruto + (valorhrextra * numerodehrextra);
        this.salarioliquido = salarioliquido - (salarioliquido * 8/100);
        return this.salarioliquido;
    }
}
