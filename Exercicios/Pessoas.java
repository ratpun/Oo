

public class Pessoa
{
    private double altura;
    private double peso;
    private double imc;
    private char sexo;
    private String resultadoimc;

    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    public void setSexo(char sexo)
    {
        if(sexo == 'M' || sexo == 'F')
        {
            this.sexo = sexo; 
        }
    }
    
    public void CalculaImc()
    {
        this.imc = peso / (altura*altura);
        
        if(sexo == 'F')
        {
            if(imc < 19.1)
            {
                this.resultadoimc = "abaixo do peso";
            }
            if( imc >= 19.1 && imc < 25.8)
            {
                this.resultadoimc = "no peso normal";
            }
            if( imc >= 25.8 && imc < 27.3)
            {
                this.resultadoimc = "marginalmente acima do peso";
            }
            if( imc >= 27.3 && imc < 32.3)
            {
                this.resultadoimc = "acima do peso ideal";
            }
            if(imc > 32.3)
            {
                this.resultadoimc = "obeso";
            }
        }
        if(sexo == 'M')
        {
            if(imc < 20.7)
            {
                this.resultadoimc = "abaixo do peso";
            }
            if( imc >= 20.7 && imc < 26.4)
            {
                this.resultadoimc = "no peso normal";
            }
            if( imc >= 26.4 && imc < 27.8)
            {
                this.resultadoimc = "marginalmente acima do peso";
            }
            if( imc >= 27.8 && imc < 31.1)
            {
                this.resultadoimc = "acima do peso ideal";
            }
            if(imc > 31.1)
            {
                this.resultadoimc = "obeso";
            }
        }
    }
    
    public String getResultadoImc()
    {
        return this.resultadoimc;
    }
}
