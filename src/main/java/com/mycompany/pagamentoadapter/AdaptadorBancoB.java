/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentoadapter;

/**
 *
 * @author PICHAU
 */
public class AdaptadorBancoB implements Pagamento {

    private BancoB banco;

    public AdaptadorBancoB(BancoB banco) {
        this.banco = banco;
    }

    @Override
    public String realizarPagamento(double valor) {
        return banco.processarPix(valor);
    }
}