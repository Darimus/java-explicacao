package smartTv;

public class Usuario {
  public static void main(String[] args) throws Exception {
    
    SmartTv smartTv = new SmartTv();
  
    System.out.println("Ligada: " + smartTv.onOff);
    System.out.println("Canal: " + smartTv.canal);
    System.out.println("Volume: " + smartTv.volume);

    smartTv.onOff();
    System.out.println("Ligada: " + smartTv.onOff);

    smartTv.aumentarVolume();
    System.out.println("Volume: " + smartTv.volume);

    smartTv.diminuirVolume();
    System.out.println("Volume: " + smartTv.volume);

    smartTv.mudarCanal(13);
    System.out.println("Canal: " + smartTv.canal);
  }
}
