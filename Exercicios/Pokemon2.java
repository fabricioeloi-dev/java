import java.util.Scanner;
import java.util.Random;
class Main 
{// Inicio do Escopo global
//Entradas
public static String pokemonescolhido = "Mew";
public static int levelpokemonescolhido;
public static String pokemonoponente = "Charizard";
public static int levelpokemonoponente;
public static String nomepokemon;

//Processamento
public static void escolherpokemon ()
{
    System.out.println ("Qual o nome do seu pokemon?");
    Scanner entrada = new Scanner(System.in);
    nomepokemon = entrada.nextLine();
}
public static void levelsaleatorios()
{
   Random gerador = new Random();
   levelpokemonescolhido = (gerador.nextInt(99));
   levelpokemonoponente = (gerador.nextInt(99));
}
//Saída
public static void main (String args[])
{
    levelsaleatorios();
    System.out.println (pokemonoponente +" de level "+ levelpokemonoponente + " desafiou você");
    escolherpokemon();
    System.out.println ("Você escolheu " + nomepokemon + " de level "+ levelpokemonescolhido);
    System.out.println (pokemonescolhido + " eu escolho você");
}
}// Fim do Escopo Global
