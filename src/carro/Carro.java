package carro;
import java.util.Scanner;

public class Carro {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Marcha marcha1 = new Marcha();
        
        int posicaoInicialDaMarcha;
        boolean valorInicialNeutro;
        
        while(true){
            System.out.println("Você entrou no controlador de marcha!\n");
            System.out.println("Escolha uma das opções a seguir");
            System.out.println("1- Setar sua marcha\n2- Aumentar sua marcha\n3- Diminuir sua marcha\n4- Verificar em qual posição sua marcha está engatada\n5- Verificar o movimento do carro\n6- Sair do controle de marcha\n");
            System.out.printf("Opção: ");
            
            int opcao = leitor.nextInt();
            switch(opcao){
                case 1:
                    System.out.printf("1- Digite True/False para especificar se sua marcha está no neutro\n");
                    valorInicialNeutro = leitor.nextBoolean();
                    System.out.printf("2- Digite a posição inicial da sua marcha\n");
                    posicaoInicialDaMarcha = leitor.nextInt();
                    
                    marcha1.setMarcha(valorInicialNeutro, posicaoInicialDaMarcha);
                    break;
                case 2:
                    marcha1.aumentarMarcha();
                    break;
                case 3:
                    marcha1.diminuirMarcha();
                    break;
                case 4:
                    System.out.printf("Marcha engatada na %dª\n\n", marcha1.getPosicaoDaMarcha());
                    break;
                case 5:
                    marcha1.movimentoDoCarro();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção incorreta, digite novamente...\n");
                    break;
            }
            
            if(opcao == 6){
                System.out.println("Programa encerrado!");
                break;
            }
        }
    }
    
}
