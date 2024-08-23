
public class Carro
{
    private double kmrodados;
    private double combustivelconsumido;

    public void setKmRodados(double kmrodados)
    {
       this.kmrodados = kmrodados;
    }
    
    public void setCombustivelConsumido(double combustivelconsumido)
    {
       this.combustivelconsumido = combustivelconsumido;
    }
    
    public double CalculaMedia()
    {
       return kmrodados/combustivelconsumido;
    }
}
