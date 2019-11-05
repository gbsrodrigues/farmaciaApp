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

public enum EnumSexo {
    M(""), F(""), O("");
    
   private String valor;
   
   EnumSexo(String valor){
   this.valor =  valor;
   }
}
