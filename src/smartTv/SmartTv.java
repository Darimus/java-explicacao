package smartTv;

public class SmartTv {
  boolean onOff = false;
  int canal = 1;
  int volume = 25;
 
    public void onOff() {
      onOff = !onOff;
    }

    public void aumentarVolume() {
      volume++;
    }

    public void diminuirVolume() {
      volume--;
    }

    public void mudarCanal(int novoCanal) {
      canal = novoCanal;
    }
}
