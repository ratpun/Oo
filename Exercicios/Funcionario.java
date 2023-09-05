

public class Funcionario{
    private String nome;
    private float salarioBruto;
    private float acrescimoTotal;
    private float descontoTotal;
    
    public Funcionario(){
        this.setNome("Jorge");
        this.setSalarioBruto(1000.0f);
        this.setAcrescimoTotal(100.0f);
        this.setDescontoTotal(100.0f);
    }
    
    public Funcionario(String nome, float salarioBruto, float acrescimoTotal, float descontoTotal){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.acrescimoTotal = acrescimoTotal;
        this.descontoTotal = descontoTotal;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSalarioBruto(float salarioBruto){
        this.salarioBruto = salarioBruto;
    }
    
    public float getSalarioBruto(){
        return this.salarioBruto;
    }
    
    public void setAcrescimoTotal(float acrescimoTotal){
        this.acrescimoTotal = acrescimoTotal;
    }
    
    public float getAcrecimoTotal(){
        return this.acrescimoTotal;
    }
    
    public void setDescontoTotal(float descontoTotal){
        this.descontoTotal = descontoTotal;
    }
    
    public float getDescontoTotal(){
        return this.descontoTotal;
    }
    
    public float calculaSalarioLiquido(){
        return (this.salarioBruto + this.acrescimoTotal - this.descontoTotal);
    }
}
