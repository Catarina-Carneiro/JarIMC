/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catarina.continua3;

/**
 *
 * @author catarina
 */
public class HomemIMC extends CalculoIMC {

    public HomemIMC(Double peso,Double altura) {

        magreza = 20.7;
        normal = 26.4;
        sobrepeso = 31.1;
        obesidade = 31.2;

        
        Double imc = peso/ (altura *2);

        if (imc < magreza) {
            mensagem
                    = String.format("Você precisa engordar, está no estado"
                            + "de magreza");
        } else if (imc <= normal) {
            mensagem
                    = String.format("Continue assim, está no estado normal");

        } else if (imc <= obesidade) {
            mensagem
                    = String.format("Continue bora malahar, está no estado de "
                            + "sobrepeso");
        } else if (imc > obesidade) {
            mensagem
                    = String.format("Bora fazer dieta, está no estado"
                            + "de obesidade");
        }
    }

}
