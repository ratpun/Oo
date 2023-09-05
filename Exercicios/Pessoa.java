
public class Pessoa{
    private float peso;
    private float altura;
    private char sexo;
    
    public void setSexo(char sexo){
        if(!(sexo=='M' || sexo== 'F')){
            throw new IllegalArgumentException("Sexo invalido");
        }
        this.sexo = sexo;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    public float calculaImc(){
        return this.peso/(this.altura*this.altura);
    }
    
    public String getCondicao(){
        float imc = this.calculaImc();
        String condicao;
        if(this.sexo == 'M'){
            if(imc < 20.7f)
                condicao = "Abaixo do peso";
            else if(imc < 26.4f)
                condicao = "No peso normal";
            else if(imc < 27.8f)
                condicao = "Marginalmente acima do peso";
            else if(imc < 31.1f)
                condicao = "Acima do peso ideal";
            else
                condicao = "Obeso";
        }
        else{
            if(imc < 19.1f)
                condicao = "Abaixo do peso";
            else if(imc < 25.8f)
                condicao = "No peso normal";
            else if(imc < 27.3f)
                condicao = "Marginalmente acima do peso";
            else if(imc < 32.3f)
                condicao = "Acima do peso ideal";
            else
                condicao = "Obeso";
        }
        return condicao;
    }
    
    public float getIMC(){
        return calculaImc();
    }
}
