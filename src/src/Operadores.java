public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "Java";

        System.out.println(nomeCompleto);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        if (a == b){
            resultado = "verdadeiro";
            } else {
            resultado = "falso";
        }

        System.out.println(resultado);

        //Exemplo de operador ternário
        resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);


    }
}
