

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FuncionarioTest{
    
    @Test
    public void deveRetornarSalarioLiquido(){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jorge");
        funcionario.setSalarioBruto(1000f);
        funcionario.setAcrescimoTotal(160.5f);
        funcionario.setDescontoTotal(240.5f);
        assertEquals(920.0f, funcionario.calculaSalarioLiquido());
    }
}
