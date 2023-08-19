public class Aluno
{
    private String nome;
    private String nascimento;
    private float ira;
    private boolean graduado;
    private int numero;
    private String logradouro;
    private int ncasa;
    private String bairro;
    private int cpf;
    private float renda;
    
    
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
    
    public void setGraduado(boolean graduado)
    {
        this.graduado = graduado;
    }
    
    public boolean getGraduado()
    {
        return this.graduado;
    }
    
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    
    public int getNumero()
    {
        return this.numero;
    }
    
    public void setLogradouro(String logradouro)
    {
        this.logradouro = logradouro;
    }
    
    public String getLogradouro()
    {
        return this.logradouro;
    }
    
    public void setNcasa(int ncsa)
    {
        this.ncasa = ncasa;
    }
    
    public int getNcasa()
    {
        return this.ncasa;
    }
    
    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }
    
    public String getBairro()
    {
        return this.bairro;
    }
    
    
    public void setCpf(int cpf)
    {
        this.cpf = cpf;
    }
    
    public int getCpf()
    {
        return this.cpf;
    }
    
    public void setRenda(float renda)
    {
        this.renda = renda;
    }
    
    public float getRenda()
    {
        return this.renda;
    }
}
