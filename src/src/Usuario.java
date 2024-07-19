import br.com.dio.smartv.SmartTv;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status - A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarDeCanal();
        System.out.println("Qual o canal atual? " + smartTv.canal);

        smartTv.diminuirDeCanal();
        System.out.println("Qual o canal atual? " + smartTv.canal);

        smartTv.mudarDeCanal(180);
        System.out.println("Qual o canal atual? " + smartTv.canal);

    }
}
