package br.com.dio.estruturascondicionais;

public class CaixaEletronico {

    public static void main(String[] args) {
        //Caixa eletrônico

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);

        } else {
            System.out.println("Saldo insuficiente");
        }

    }

}
