public class FuncionarioDiarista extends Funcionario
{
    private int dias;
    private float diaria;
    
    public void Funcionario(String nome,int dias, float diaria){  
        this.salario = dias * diaria;
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSalario(){
        return this.salario;
    }
}