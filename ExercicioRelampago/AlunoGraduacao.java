public class AlunoGraduacao extends Aluno
{
  public void VerificaAprovacao(float n1, float n2){
     if((n1+n2)/2 >= 7){
        this.situacao = "aprovado";
     }
     else
         this.situacao = "reprovado";
   }
}
