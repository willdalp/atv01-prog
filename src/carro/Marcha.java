package carro;

public class Marcha {
    private boolean neutro;
    private int posicaoDaMarcha;
    
    public Marcha(){
        neutro = true;
        posicaoDaMarcha = 0;
    }
    
    public Marcha(boolean neutro, int posicaoDaMarcha){
        this.neutro = neutro;
        this.posicaoDaMarcha = posicaoDaMarcha;
    }
    
    void setMarcha(boolean neutro, int posicaoDaMarcha){
        this.neutro = neutro;
        this.posicaoDaMarcha = posicaoDaMarcha;
    }
    
    boolean getNeutro(){
        return neutro;
    }
    
    int getPosicaoDaMarcha(){
        return posicaoDaMarcha;
    }
    
    void movimentoDoCarro(){
        if(posicaoDaMarcha == 0){
            System.out.printf("Movimentando: Não\nMarcha: Neutro\n\n");
        }else{
            System.out.printf("Movimentando: Sim\nMarcha: engatada\n");
        }
    }
    
    void aumentarMarcha(){
        if(posicaoDaMarcha >= 0 && posicaoDaMarcha <= 4){
            posicaoDaMarcha += 1;
            neutro = false;
        }else{
            System.out.printf("Não é possível aumentar a marcha\n");
        }
    }
    
    void diminuirMarcha(){
        if(posicaoDaMarcha > 0 && posicaoDaMarcha <= 5){
            posicaoDaMarcha -= 1;
        }else{
            System.out.printf("Não é possível diminuir a marcha\n");
        }
    }
}
