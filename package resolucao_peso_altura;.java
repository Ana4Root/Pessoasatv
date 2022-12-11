package resolucao_peso_altura;

import java.util.Scanner;
import java.lang.String;

public class resoluca_peso_altura {

    private static Object String;

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("(6.2)---- EXIBIR DADOS DO ALUNO -----");
        System.out.println("(6.2.1) RA: 00889-6");
        System.out.println("(6.2.3) Nome:  Cassiano Cardoso Honorato");
        System.out.println("----------------------------------");
        System.out.print("  Informe a quantidade de pessoas: ");
        int nPessoas = Teclado.nextInt();

        String[] V_nome = new String[nPessoas];
        float[] V_peso = new float[nPessoas];
        float[] V_altura = new float[nPessoas];
        char[] V_sexo = new char[nPessoas];
        int[] idade = new int[nPessoas];
        char[] PegouCovid = new char[nPessoas];
        char[] GrupoDerisco = new char[nPessoas];


        int Qtde_homens = 0;
        int Qtde_mulheres = 0;
        int nContador = 0;
        float HomemAlto_altura = 0;
        float MulherPeso_peso = 0;
        String HomemAlto_nome = "";
        String MulherPeso_nome = "";
        int somaIdade = 0;
        float somaAutoHomen = 0;
        double mediaAltura = 0;
        float somaPeso = 0;
        double mediaPeso = 0;
        double idadeMedia = 0;
        int totalPessoas = 0;
        float percentH = 0;
        float percentF = 0;
        int idadeMaisVelha = 0;
        String nomePessoaMaisVelha = "";
        int pegoucovid = 0;
        int gruporisco = 0;
        float somapesoM = 0;
        float mediapesoM = 0;
        float MulherAlta = 0;
        float medialturamulher =0;
        float  SomaPesoTodos = 0;
        float mediapesototal= 0;
        float SomaAlturaTodos =0;
        float MediaAlturaTodos =0;
        int somaHomenCovid =0;
        int somaMulherCovid =0;


        while (nContador <= (nPessoas - 1)) {

            System.out.println("------------------------------------------------------------");
            System.out.println("INFORME OS DADOS DA PESSOA DE NUMERO: " + (nContador + 1) + "/" + nPessoas);

            // Vlidando o nome
            while (1 == 1) {
                System.out.print("  Informe o nome : ");
                V_nome[nContador] = Teclado.next();

                if (V_nome[nContador] == "") {
                    System.out.println("nome invalido");
                    continue;
                }

                break;
            }


            System.out.print(" Informe o peso: ");
            V_peso[nContador] = Teclado.nextFloat();
            SomaPesoTodos  = SomaPesoTodos + V_peso[nContador];


            System.out.print(" Informe sua idade: ");
            idade[nContador] = Teclado.nextInt();
            somaIdade = somaIdade + idade[nContador];


            System.out.print(" Informe a altura: ");
            V_altura[nContador] = Teclado.nextFloat();
            SomaAlturaTodos = SomaAlturaTodos + V_altura[nContador];

            // Vlidação de sexo
            while (1 == 1) {
                System.out.print("Informe o sexo ( M-Masculino F-Feminio): ");
                V_sexo[nContador] = Teclado.next().charAt(0);

                if (V_sexo[nContador] != 'M' && V_sexo[nContador] != 'F') {

                    System.out.println("sexo invalido");
                    continue;
                }
                break;
            }
            System.out.println("--------- SOBRE COVID-19 ----------");
            System.out.println("-----------------------------------");
            System.out.println(" Informe se ja contraiu o Covid-19, digite com letras maiusculas,  ' S para SIM', ' N para NÃO' ");
            PegouCovid[nContador] = Teclado.next().charAt(0);

            System.out.println(" Infome se voce é do grupo de risco para agravamento da Covid-19, digite com letras maiusculas,  S para SIM', ' N para NÃO' ");
            GrupoDerisco[nContador] = Teclado.next().charAt(0);


            // média de altura homens e sexo e peso
            if (V_sexo[nContador] == 'M') {
                Qtde_homens++;
                somaAutoHomen = (V_altura[nContador] + somaAutoHomen);
                mediaAltura = (somaAutoHomen / Qtde_homens);
                somapesoM = (V_peso[nContador] + somapesoM);
                mediapesoM = (somapesoM / Qtde_homens);
            }
            // Pegou Covid-19
            if (PegouCovid[nContador] == 'S') {
                pegoucovid++;
            }
            //Grupo de risco Covied-19
            if (GrupoDerisco[nContador] == 'S') {
                gruporisco++;
            }
//               homens que contraiu covid
            if (PegouCovid[nContador] == 'S' && V_sexo[nContador]== 'M'){
                somaHomenCovid++;
            }
//            mulhres que contraiu covid
            if (PegouCovid[nContador] == 'S' && V_sexo[nContador]=='F') {
                somaMulherCovid++;
            }
            // média de  peso mulher e sexo e media altura mulher
            if (V_sexo[nContador] == 'F') {
                Qtde_mulheres++;
                somaPeso = (V_peso[nContador] + somaPeso);
                mediaPeso = (somaPeso / Qtde_mulheres);
                MulherAlta = (V_altura[nContador]+MulherAlta);
                medialturamulher = (MulherAlta / Qtde_mulheres);
            }
            // homen mais alto e o nome
            if (V_sexo[nContador] == 'M' && V_altura[nContador] > HomemAlto_altura) {
                HomemAlto_altura = V_altura[nContador];
                HomemAlto_nome = V_nome[nContador];
            }


            // mulher mais pesada e o nome
            if (V_sexo[nContador] == 'F' && V_peso[nContador] > MulherPeso_peso) {
                MulherPeso_peso = V_peso[nContador];
                MulherPeso_nome = V_nome[nContador];
            }
            // media de todas as idades
            idadeMedia = somaIdade / (Qtde_homens + Qtde_mulheres);

            //calcular porcentagem homens
            totalPessoas = Qtde_homens + Qtde_mulheres;
            percentH = (Qtde_homens * 100) / totalPessoas;

            // calcular a porcentagem de mulheres
            totalPessoas = Qtde_homens + Qtde_mulheres;
            percentF = (Qtde_mulheres * 100) / totalPessoas;

            //media de peso de todas as pessoas
            mediapesototal = SomaPesoTodos /(Qtde_homens +Qtde_mulheres);

            // media de altura de todas as pessoas
            MediaAlturaTodos = SomaAlturaTodos / (Qtde_homens + Qtde_mulheres);

            nContador++;
        }

         System.out.println("---------------------------------");
         System.out.println("RESUMO DAS INFORMACOES RECEBIDAS:");
        System.out.println("---------------------------------");

        System.out.println();
        System.out.println(" (3.1) Quantidade de homens: " + Qtde_homens);
        System.out.println(" (3.2) Quantidade de mulher: " + Qtde_mulheres);
        System.out.println(" (3.3) Homem mais alto.....: Nome " + HomemAlto_nome + " Altura : " + HomemAlto_altura);
        System.out.println(" (3.4) Mulher mais forte...: Nome " + MulherPeso_nome + " Peso : " + MulherPeso_peso);
        System.out.println(" (4.2) O porcentual de homens são =  " + percentH + " % ");
        System.out.println(" (4.3) porcentual  de mulheres são = " + percentF + " % ");
        System.out.println(" (4.4) media de atura dos homens " + mediaAltura);
        System.out.println(" (4.5) A média do peso entre as mulheres é " + mediaPeso);
        System.out.println(" (4.6) A média de todas as idades tanto masculina e feminina é  " + idadeMedia);

        // pessoas mais velha com nome e idade
        System.out.println("(4.7) Pessoas mais velhas ");
        for (int i = 0; i <= nPessoas - 1; i++) {
            if (idade[i] > idadeMaisVelha) {
                idadeMaisVelha = idade[i];
                nomePessoaMaisVelha = V_nome[i];
                System.out.println("Pessoas mais velhras: Nome: " + nomePessoaMaisVelha + " com idade(s) " + idade[i]);
            }

        }
        // listar homens, nome, altura, peso
        System.out.println("(4.8) listar todos homens ");
        for (int i = 0; i <= nPessoas - 1; i++) {
            if (V_sexo[i] == 'M') {
                System.out.println(" Nome: " + V_nome[i] + " Altura " + V_altura[i] + " Peso " + V_peso[i]);
            }

        }
        // listar mulheres, nome, altura, sexo
        System.out.println("(4.9)Listar todas as mulheres");
        for (int i = 0; i <= nPessoas - 1; i++) {
            if (V_sexo[i] == 'F') {
                System.out.println(" Nome: " + V_nome[i] + " Altura " + V_altura[i] + " Peso " + V_peso[i]);
            }
        }
        System.out.println("(5.3) A média de peso entre homens é = " + mediapesoM);
        System.out.println("(5.4) A média de altura entre as mulheres é = " + medialturamulher);
        System.out.println("(5.5) A média de peso de todas as pessoas é = "+mediapesototal);
        System.out.println("(5.6) A média de altura entre todas as pesoas é = " + MediaAlturaTodos);
        System.out.println("(5.7) Pessoas que contraiu COVID-19 = "+ pegoucovid);
        System.out.println("(5.8) Quantidade de homens que contriu COVID- 19 é " +somaHomenCovid);
        System.out.println("(5.9) Quantidade de mulheres que contraiu COVID19 é " + somaMulherCovid);
        System.out.println("(5.10) Listar nome, peso, altura, sexo, idade, grupo de risco, contriu covid");
        for (int i =0; i <= nPessoas -1; i++){
           if (PegouCovid[i] == 'S'){
               System.out.println("Nome: " + V_nome[i] + ",Peso: " + V_peso[i] + " ,altura: " + V_altura[i] + " ,Grupo de risco: " + GrupoDerisco[i] + " ,Contraiu COVID-19 " + PegouCovid[i]);
           }
        }*/
        System.out.println("(6.3) --- Exibir informações sobre as mulheres -----");
        System.out.println("-------------------------------------------------------");
        System.out.println("(6.3.1) Quantidade de mulheres = " + Qtde_mulheres);
        System.out.println("(6.3.2) A mulher mias forte  Nome.... " + MulherPeso_nome + " Peso : " + MulherPeso_peso);
        System.out.println("(6.3.3) Porcentual  de mulheres são = " + percentF + " % ");
        System.out.println("(6.3.4) A média do peso entre as mulheres é = " + mediaPeso);
        System.out.println("(6.3.5) A média de altura entre as mulheres é = "  + medialturamulher);
        System.out.println("(6.3.6) Quantidade de mulheres que contraiu COVID-19 é " + somaMulherCovid);
        System.out.println("(6.3.7) Lista de todas as MULHERES");
        System.out.println();
        for (int i =0; i <= nPessoas-1;i++){
            if(V_sexo[i] =='F'){
                System.out.println("Nome: " + V_nome[i] + " peso: " + V_peso[i] + " Altura: " + V_altura[i] + " Sexo: " + V_sexo[i] + " Idade: " + idade[i]);
            }
        }
        System.out.println("(6.4)--------- Exibir informações sobre os homens --------- " );
        System.out.println();
        System.out.println("(6.4.1) Quantidade de homens = " + Qtde_homens);
        System.out.println("(6.4.2) Homem mais alto.....: Nome "  + HomemAlto_nome + " Altura : " + HomemAlto_altura);
        System.out.println("(6.4.3)  O porcentual de homens são : " + percentH + " % ");
        System.out.println("(6.4.4) A média de altura entre os homens é: "+ mediaAltura);
        System.out.println("(6.4.5) A média de peso entre homens é = " + mediapesoM);
        System.out.println("(6.4.6) Quantidade de homens que contriu COVID-19 é " + somaHomenCovid);
        System.out.println("(6.4.7) Lista de todo homens ");
        System.out.println();
        for (int i =0; i <= nContador -1; i++){
            if (V_sexo[i] == 'M'){
                System.out.println("Nome: " + V_nome[i] + " Peso: " + V_peso[i] + " Altura: " + V_altura[i] + " Sexo: " + V_sexo[i] + " Idade: " + idade[i]);
            }
        }
    }

}