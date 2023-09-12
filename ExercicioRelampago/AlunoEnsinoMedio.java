public class AlunoEnsinoMedio extends Aluno
{
   public void VerificaAprovacao(float n1, float n2){
     if((n1+n2)/2 >= 6){
        this.situacao = "aprovado";
     }
     else
         this.situacao = "reprovado";
   }
}
