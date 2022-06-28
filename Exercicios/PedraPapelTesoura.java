import java.util.Scanner;
import java.util.Random;
class Main
{
public static void main (String args[]){
    
    Random gerador = new Random();
    Scanner ler = new Scanner(System.in);
    int escolhaPessoaUsuaria;
    int npc;
    System.out.println("1.Pedra");
    System.out.println("2.Papel");
    System.out.println("3.Tesoura");
    escolhaPessoaUsuaria = ler.nextInt(); 
    npc = gerador.nextInt(2) + 1;
    
    
    System.out.println("Eu: " + escolhaPessoaUsuaria + "\nRival: " + npc);
    switch(escolhaPessoaUsuaria){
        case 1:
            switch (npc){
                case 1:
                 System.out.println("Empate !");
                 break;
                 default:
                 System.out.println("Erro");
                case 2:
                    System.out.println("Você Perdeu !");
                    break;
                case 3:    
                    System.out.println("Você Ganhou !");
                    break;
            }
        System.out.println("Pedra");
        break;
        case 2:
        System.out.println("Papel");
        break;
        case 3:
        System.out.println("Tesoura");
        break;
        default:
        System.out.println("Erro");

    } 
    
    
}

}