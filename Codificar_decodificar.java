import java.util.Scanner;
public class Codificar_decodificar {
    public static void main(String[] args) {
        Scanner guga = new Scanner(System.in);
        String n0 = "q";
        String n1 = "t";
        String n2 = "h";
        String n3 = "s";
        String n4 = "i";
        String n5 = "l";
        String n6 = "k";
        String n7 = "g";
        String n8 = "x";
        String n9 = "z";
        int t = 1;
        int opcao;
        do {
            System.out.println("\nDigite a opcao Desejada: \n 1 - Decodificar. \n 2 - Codificar. \n 3 - Sair.");
            opcao = guga.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o codigo: ");
                    String codio = guga.nextLine();
                    String codi = guga.nextLine();


                    String[] list = codi.split("");
                    for (int b = 0; b < codi.length(); b++) {
                        String criptou = "";
                        if (list[b].equals("q")) {
                            criptou = "0";
                        }
                        if (list[b].equals("t")) {
                            criptou = "1";
                        }
                        if (list[b].equals("h")) {
                            criptou = "2";
                        }
                        if (list[b].equals("s")) {
                            criptou = "3";
                        }
                        if (list[b].equals("i")) {
                            criptou = "4";
                        }
                        if (list[b].equals("l")) {
                            criptou = "5";
                        }
                        if (list[b].equals("k")) {
                            criptou = "6";
                        }
                        if (list[b].equals("g")) {
                            criptou = "7";
                        }
                        if (list[b].equals("x")) {
                            criptou = "8";
                        }
                        if (list[b].equals("z")) {
                            criptou = "9";
                        }
                        System.out.print(criptou);
                    }
                    break;
                case 2:
                    System.out.print("Digite um numero inteiro: ");
                    int gu = guga.nextInt();
                    String ga = Integer.toString(gu);
                    String[] hu = ga.split("");
                    for (int a = 0; a < ga.length(); a++) {
                        String cripto = "";
                        if (hu[a].equals("0")) {
                            cripto = n0;
                        }
                        if (hu[a].equals("1")) {
                            cripto = n1;
                        }
                        if (hu[a].equals("2")) {
                            cripto = n2;
                        }
                        if (hu[a].equals("3")) {
                            cripto = n3;
                        }
                        if (hu[a].equals("4")) {
                            cripto = n4;
                        }
                        if (hu[a].equals("5")) {
                            cripto = n5;
                        }
                        if (hu[a].equals("6")) {
                            cripto = n6;
                        }
                        if (hu[a].equals("7")) {
                            cripto = n7;
                        }
                        if (hu[a].equals("8")) {
                            cripto = n8;
                        }
                        if (hu[a].equals("9")) {
                            cripto = n9;
                        }
                        System.out.print(cripto);
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar o guga codigos.");
                    break;
            }
        } while (opcao != 3);
    }
}