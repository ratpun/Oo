public class Aluno
{
    private int matricula;
    private String nome;
    private String nascimento;
    private float ira;
    private int cpf;
    private String cidade;
    private boolean graduado;
    private String estado; 
    private String logradouro;
    private int telefone;

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    
    public int getMatricula()
    {
        return this.matricula;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNascimento(String nascimento)
    {
        this.nascimento = nascimento;
    }
    
    public String getNascimento()
    {
        return this.nascimento;
    }
    
    public void setIra(float ira)
    {
        this.ira = ira;
    }
    
    public float getIra()
    {
        return this.ira;
    }
    
    public void setCpf(int cpf)
    {
        this.cpf = cpf;
    }
    
    public int getCpf()
    {
        return this.cpf;
    }
    
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    
    public String getCidade()
    {
        return this.cidade;
    }
    
    public void setGraduado(Boolean graduado)
    {
        this.graduado = graduado;
    }
    
    public boolean getGraduado()
    {
        return this.graduado;
    }
    
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    
    public String getEstado()
    {
        return this.estado;
    }
    
    public void setLogradouro(String logradouro)
    {
        this.logradouro = logradouro;
    }
    
    public String getLogradouro()
    {
        return this.logradouro;
    }
    
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
    
    public int getTelefone()
    {
        return this.telefone;
    }
}