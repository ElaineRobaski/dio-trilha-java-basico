//METODOS - São ações que um objeto pode realizar, ou seja, são as funcionalidades que um objeto possui.

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    
        smartTv.ligar();
        System.out.println("Novo status - A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.mudarCanal(20);
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.proximoCanal();
        System.out.println("Próximo canal: " + smartTv.canal);

        smartTv.canalAnterior();
        System.out.println("Canal anterior: " + smartTv.canal);
    }
}
