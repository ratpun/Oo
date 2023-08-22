
public class Usuario
{
    private double quilowatts;
    
    public void setQuilowatts(double quilowatts)
    {
        this.quilowatts = quilowatts;
    }
    
    public double CalculaEnergiaEletrica()
    {
        this.quilowatts = quilowatts * 0.12;
        return quilowatts + (quilowatts * 18/100);
    }
}
