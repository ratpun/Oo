

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PessoaTest{
    private Pessoa pessoa;
    
    @BeforeEach
    public void setUp(){
        pessoa = new Pessoa();
    }
    
    @Test
    public void deveRetornarSexoM(){
        pessoa.setSexo('M');
        assertEquals('M', pessoa.getSexo());
    }
    
    @Test
    public void deveRetornarSexoF(){
        pessoa.setSexo('F');
        assertEquals('F', pessoa.getSexo());
    }
    
    @Test
    public void deveRetornarExcecaoSexoInvalido(){
        try{
            pessoa.setSexo('A');
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Sexo invalido", e.getMessage());
        }
    }
    
    @Test
    public void deveRetornarMAbaixoPeso(){
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(20.6f);
        assertEquals("Abaixo do peso", pessoa.getCondicao());
    }
    
    @Test
    public void deveRetornarMPesoNormal(){
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(26.3f);
        assertEquals("No peso normal", pessoa.getCondicao());
    }
    
    @Test
    public void deveRetornarMMarginalmenteAcimaPeso(){
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.6f);
        assertEquals("Marginalmente acima do peso", pessoa.getCondicao());
    }
    
    @Test
    public void deveRetornarMAcimaPesoIdeal(){
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.0f);
        assertEquals("Acima do peso ideal", pessoa.getCondicao());
    }
    
    @Test
    public void deveRetornarMObeso(){
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.2f);
        assertEquals("Obeso", pessoa.getCondicao());
    }
    
    @Test
    public void deveRetornarAbaixoPeso(){
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(19.0f);
        assertEquals("Abaixo do peso", pessoa.getCondicao());
    }

    @Test
    public void deveRetornarPesoNormal(){
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.7f);
        assertEquals("No peso normal", pessoa.getCondicao());
    }
    
     @Test
    public void deveRetornarMarginalmenteAcimaPeso(){
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.2f);
        assertEquals("Marginalmente acima do peso", pessoa.getCondicao());
    }
    
    @Test
    public void deveRetornarAcimaPesoIdeal(){
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.2f);
        assertEquals("Acima do peso ideal", pessoa.getCondicao());
    }
    
    @Test
    public void deveRetornarObeso(){
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(34.4f);
        assertEquals("Obeso", pessoa.getCondicao());
    }
}
