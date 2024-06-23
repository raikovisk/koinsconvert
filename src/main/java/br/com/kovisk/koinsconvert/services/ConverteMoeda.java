package br.com.kovisk.koinsconvert.services;

import java.util.Scanner;

public class ConverteMoeda {
    private final ConsultaCotacao consomeCotacao;


    public ConverteMoeda(String apikey) {
        this.consomeCotacao = new ConsultaCotacao((apikey));
    }

    public void converteMoedas(String moedaDe, String moedaPara){
        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Informe o valor em " + moedaDe + ": ");
            double valor = Double.parseDouble((leitura.nextLine()));

            double taxa = consomeCotacao.obterCambio(moedaDe, moedaPara);
            double resultado = valor * taxa;
            System.out.println("*********************************");
            System.out.println("Valor em " + moedaPara + ": " + resultado);
            System.out.println("*********************************");
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
