package br.com.dio.smartv;

public class SmartTv {
        public boolean ligada = false;
        public int canal = 1;
        public int volume = 25;

        public void ligar() {
                ligada = true;
        }
        public void desligar() {
                ligada = false;
        }

        public void aumentarVolume() {
                volume++;
        }
        public void diminuirVolume() {
                volume--;
        }

        public void mudarDeCanal(int novoCanal){
                canal = novoCanal;
        }
        public void aumentarDeCanal(){
                canal++;
        }
        public void diminuirDeCanal(){
                canal--;
        }





}
