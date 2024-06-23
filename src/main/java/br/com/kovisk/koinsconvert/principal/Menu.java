package br.com.kovisk.koinsconvert.principal;

import br.com.kovisk.koinsconvert.services.ConverteMoeda;

public class Menu {
    private final ConverteMoeda conversor;

    public Menu(ConverteMoeda conversor) {
        this.conversor = conversor;
    }

    public void exibirMenu() {
        System.out.println("\n=== Bem vindo(a) ao KoinsConvert - Cotação em tempo real ===");
        System.out.println("1. USD (Dólar) para BRL (Real)");
        System.out.println("2. BRL (Real) para USD (Dólar)");
        System.out.println("3. EUR (Euro) para BRL (Real)");
        System.out.println("4. BRL (Real) para EUR (Euro)");
        System.out.println("5. EUR (Euro) para USD (Dólar)");
        System.out.println("6. USD (Dólar) para EUR (Euro)");
        System.out.println("7. BRL (Real) para ARS (Peso Argentino)");
        System.out.println("8. ARS (Peso Argentino) para BRL (Real)");
        System.out.println("9. BRL (Real) para CNY (Yuan)");
        System.out.println("10. CNY (Yuan) para BRL (Real)");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção: ");
    }

    public void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                conversor.converteMoedas("USD", "BRL");
                break;
            case 2:
                conversor.converteMoedas("BRL", "USD");
                break;
            case 3:
                conversor.converteMoedas("EUR", "BRL");
                break;
            case 4:
                conversor.converteMoedas("BRL", "EUR");
                break;
            case 5:
                conversor.converteMoedas("EUR", "USD");
                break;
            case 6:
                conversor.converteMoedas("USD", "EUR");
                break;
            case 7:
                conversor.converteMoedas("BRL", "ARS");
                break;
            case 8:
                conversor.converteMoedas("ARS", "BRL");
                break;
            case 9:
                conversor.converteMoedas("BRL", "CNY");
                break;
            case 10:
                conversor.converteMoedas("CNY", "BRL");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
