public class FuncionarioMensalista extends Funcionario
{
    public void Funcionario(String nome, float salario){  
        this.salario = salario;
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSalario(){
        return this.salario;
    }
}
