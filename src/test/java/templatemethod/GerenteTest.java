package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveRetornarInfoCiclo() {
        Gerente gerente = new Gerente();
        gerente.setNome("Geraldo");
        gerente.setSalario(10000);
        assertEquals("Bonficação do Ciclo 2023.01:\n" +
                "Geraldo - R$ 33000.0", gerente.getInfoCiclo("2023.01", 80.0));
    }
}