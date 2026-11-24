/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import com.mycompany.pagamentoadapter.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    public void testarPagamentoBancoA() {
        BancoA banco = new BancoA();
        Pagamento pagamento = new AdaptadorBancoA(banco);

        SistemaPagamento sistema = new SistemaPagamento();

        String resultado = sistema.efetuarPagamento(pagamento, 500.0);

        assertEquals(
            "Banco A: Transferencia de R$ 500.0 realizada com sucesso.",
            resultado
        );
    }

    @Test
    public void testarPagamentoBancoB() {
        BancoB banco = new BancoB();
        Pagamento pagamento = new AdaptadorBancoB(banco);

        SistemaPagamento sistema = new SistemaPagamento();

        String resultado = sistema.efetuarPagamento(pagamento, 300.0);

        assertEquals(
            "Banco B: PIX de R$ 300.0 processado com sucesso.",
            resultado
        );
    }

    @Test
    public void testarIntegracaoDosBancos() {
        SistemaPagamento sistema = new SistemaPagamento();

        Pagamento bancoA = new AdaptadorBancoA(new BancoA());
        Pagamento bancoB = new AdaptadorBancoB(new BancoB());

        String resultadoA = sistema.efetuarPagamento(bancoA, 100.0);
        String resultadoB = sistema.efetuarPagamento(bancoB, 200.0);

        assertTrue(resultadoA.contains("Banco A"));
        assertTrue(resultadoB.contains("Banco B"));
    }
}