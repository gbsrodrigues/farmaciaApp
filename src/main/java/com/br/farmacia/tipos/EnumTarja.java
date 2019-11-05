/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.farmacia.tipos;

/**
 *
 * @author gabriel
 */
public enum EnumTarja {

    PRETA("Tarja preta"),
    VERMELHAC("Tarja vermelha com prescrição"),
    VERMELHAS("Tarja vermelha sem prescrição"),
    AMARELA("Tarja amarela"),
    LIVRE("Livre");

    private String valor;

    EnumTarja(String valor) {
        this.valor = valor;
    }

}
