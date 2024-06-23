package br.com.kovisk.koinsconvert.principal;

import br.com.kovisk.koinsconvert.services.ConverteMoeda;

import java.util.Scanner;

public class Principal {
    private static final String API_KEY = "0375e33edea4e82585626829";


    public void exibeMenu(){
        Scanner leitura = new Scanner(System.in);
        ConverteMoeda conversor = new ConverteMoeda(API_KEY);
        Menu menu = new Menu(conversor);

        try {
            while (true) {
                menu.exibirMenu();
                int opcode = Integer.parseInt(leitura.nextLine());
                if (opcode == 0) {
                    System.out.println("Saindo...");
                    return;
                }
                menu.processarOpcao(opcode);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }

}
