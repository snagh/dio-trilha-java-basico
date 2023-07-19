public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTV = new SmartTv();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);


    }
}
