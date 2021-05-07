package exe4;

/**
 *
 * @author gabyv
 */
public class Exe4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio r1 = new Radio(true, 10, 90);
        
        r1.info();
        
        //Iniciando        
        r1.setLigado(true);
        r1.setVolume(15);
        r1.setEstacao(90);
        
        //Dados
        System.out.println(r1.getLigado() + "\n");
        System.out.println(r1.getVolume() + "\n");
        System.out.println(r1.getEstacao()+ "\n");
        
        r1.aumentarVolume();
        r1.passarEstacao();

        r1.info();
    }
}
