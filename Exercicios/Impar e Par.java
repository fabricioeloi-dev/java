import java.util.Scanner;

class Main
{
    public static Scanner ler = new Scanner(System.in);
    public static int numero;
    public static void main (String args[])
    {
    verificaParidade(ler.nextInt());
    }
    public static void verificaParidade(int numero2)
    {
        if(numero2 % 2 ==0)
        {
            System.out.println("Numero Par");
        }
        if (numero2 % 2 !=0)
        {
            System.out.println("Numero Impar");
        }
    }
}