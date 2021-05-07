/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe4;

/**
 *
 * @author gabyv
 */
public class Radio {
    private int volume;
    private float estacao;
    private boolean ligado;
    
    public void setLigado(boolean lig){
         this.ligado = lig;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    
    public void setVolume(int vol){
         if(volume >= 0 && volume <= 100){
             this.volume = vol;
         }else{
             System.out.println("Volume fora dos limites permitidos");
         }
    }
    public int getVolume(){
        return volume;
    }
    
    public void setEstacao(float est){
         if(estacao >= 0 && estacao <= 100){
             this.estacao = est;
         }else{
             System.out.println("Estação fora dos limites permitidos");
         }
    }
    public float getEstacao(){
        return estacao;
    }
    
    public void aumentarVolume(){
        if (ligado == false){
            System.out.println("Rádio desligado");
        }else{
            if(this.volume != 100){
                this.volume += 5;
            }else{
                System.out.println("Volume no máximo");
            }
        }
    }
    public void abaixarVolume(){
        if (ligado == false){
            System.out.println("Rádio desligado");
        }else{
            if(this.volume != 0){
                this.volume += 5;
            }else{
               System.out.println("Volume no mínimo"); 
            }
        }
    }
    public void passarEstacao(){
        if (ligado == false){
            System.out.println("Rádio desligado");
        }else{
            this.estacao += 2.5;
        }
    }
    public void voltarEstacao(){
        if (ligado == false){
            System.out.println("Rádio desligado");
        }else{
            this.estacao -= 2.5;
        }
    }
    
    public void info(){
        System.out.println("Informações do rádio: ");
        System.out.println("Ligado: " + ligado);
        System.out.println("Volume: " + volume);
        System.out.println("Estação: " + estacao);
    }
}
