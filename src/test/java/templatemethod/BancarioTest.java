package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancarioTest {

    @Test
    void deveRetornarInfoCiclo() {
        Bancario bancario = new Bancario();
        bancario.setNome("Pedro");
        bancario.setSalario(5000);
        assertEquals("Bonficação do Ciclo 2023.01:\n" +
                "Pedro - R$ 11500.0", bancario.getInfoCiclo("2023.01", 80.0));
    }
}