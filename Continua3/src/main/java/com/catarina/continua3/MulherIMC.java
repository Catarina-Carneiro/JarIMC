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
public class MulherIMC extends CalculoIMC {

    public MulherIMC(Double peso, Double altura) {

        magreza = 18.5;
        normal = 24.9;
        sobrepeso = 30.0;
        obesidade = 30.1;
        
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
