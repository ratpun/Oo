public abstract class Aluno extends Pessoa
{
   protected float n1;
   protected float n2;
   protected String situacao;
   protected String matricula;
   
   public void setMatricula(String matricula){
       this.matricula = matricula;
   }
   
   public String getMatricula(){
       return this.matricula;
   }
   
   public String getSituacao(){
       return this.situacao;
   }
   
}
