/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentoadapter;

/**
 *
 * @author PICHAU
 */
public class AdaptadorBancoA implements Pagamento {

    private BancoA banco;

    public AdaptadorBancoA(BancoA banco) {
        this.banco = banco;
    }

    @Override
    public String realizarPagamento(double valor) {
        return banco.enviarTransferencia(valor);
    }
}
