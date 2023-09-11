public class FuncionarioHorista extends Funcionario
{
    private int hora;
    private float valorporhora;
    
    public void Funcionario(String nome,int hora, float valorporhora){  
        this.salario = hora * valorporhora;
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSalario(){
        return this.salario;
    }
}