import java.util.Scanner;

public class Pessoas {

        public static void main(String[] args) {

                Scanner Teclado = new Scanner(System.in);
                System.out.print("Informe a quantidade de pessoas: ");
                int nPessoas = Teclado.nextInt();

                String[] V_nome  = new String[nPessoas];
                float[] V_peso   = new float[nPessoas];
                float[] V_altura = new float[nPessoas];
                char[] V_sexo    = new char[nPessoas];
                int[] V_Idade = new int[nPessoas];
                char[] PCovid = new char[nPessoas];
                char[] GDR = new char[nPessoas];
                int Qtde_homens = 0;
                int Qtde_mulheres = 0;
                int Qtde_Pessoas = 0;
                int nContador = 0;
                float HomemAlto_altura = 0;
                float MulherPeso_peso = 0;
                String HomemAlto_nome="";
                String MulherPeso_nome="";
                String PessoaV_nome = "";
                float IdadeV = 0;
                float PorH = 0;
                float PorM = 0;
                float SomaH = 0;
                float SomaPM = 0;
                float SomaI = 0;
                double MedI = 0;
                int pcovid = 0;
                int grupor = 0;
                int SHC =0;
                int SMC =0;
                IdadeV = 0; 
                while (nContador <= (nPessoas-1))  {

                        System.out.println("------------------------------------------------------------");
                        System.out.println("INFORME OS DADOS DA PESSOA DE NUMERO: " + (nContador) + "/" +nPessoas);
   
                        System.out.print("Informe o nome: ");
                        V_nome[nContador] = Teclado.next();

                        System.out.print("Informe a idade: ");
                        V_Idade[nContador] = Teclado.nextFloat();
                        SomaI = (V_Idade[nContador] + SomaI);

                        System.out.print("Informe o peso: ");
                        V_peso[nContador] = Teclado.nextFloat();

                        System.out.print("Informe a altura: ");
                        V_altura[nContador] = Teclado.nextFloat();

                        System.out.print("Informe o sexo ( M-Masculino F-Feminio): ");
                        V_sexo[nContador] = Teclado.next().charAt(0);

                        System.out.println(" Informe se ja contraiu o Covid-19, S = Sim, N = Não ");
                        PCovid[nContador] = Teclado.next().charAt(0);

                        System.out.println(" Infome se voce é do grupo de risco para agravamento da Covid-19, S = Sim, N = Não");
                        GDR[nContador] = Teclado.next().charAt(0);


                       
                        if (V_sexo[nContador] == 'M') {
                                Qtde_homens++;
                               
                        }

                        if (V_sexo[nContador] == 'F') {
                                Qtde_mulheres++;
                                
                        }

                        if (V_sexo[nContador] == 'M' && V_altura[nContador] > HomemAlto_altura) {
                                HomemAlto_altura = V_altura[nContador];
                                HomemAlto_nome = V_nome[nContador];
                                SomaH = (V_altura[nContador] + SomaH);
                        }

                        if (V_sexo[nContador] == 'F' && V_peso[nContador] > MulherPeso_peso) {
                                MulherPeso_peso = V_peso[nContador];
                                MulherPeso_nome = V_nome[nContador];
                                SomaPM = (V_peso[nContador] + SomaPM);
                        }

                        if (PCovid[nContador] == 'S') {
                                pcovid++;
                        }

                        if (GDR[nContador] == 'S') {
                                grupor++;    
                        }

                        if (PCovid[nContador] == 'S' && V_sexo[nContador]== 'M'){
                                SHC++;
                        }

                        if (PCovid[nContador] == 'S' && V_sexo[nContador]=='F') {
                                SMC++;
                        }





                    nContador++; 

                }

                for (int i =0; i <=nPessoas -1; i++){
                    if(V_idade[i] > IdadeV){
                        IdadeV = V_idade[i];
                        PessoaV_nome = V_nome[i];


                    }
                }
                PorM = ((Qtde_mulheres *100)/ nPessoas);
                PorH = ((Qtde_homens * 100)/ nPessoas);
                MedI = SomaI / (Qtde_homens + Qtde_mulheres);

       
                System.out.println("---------------------------------");
                System.out.println("RESUMO DAS INFORMACOES RECEBIDAS:");
                System.out.println("---------------------------------");

                System.out.println();
                System.out.println("Quantidade de homens: " + Qtde_homens);
                System.out.println("Quantidade de mulher: " + Qtde_mulheres);
                System.out.println("Homem mais alto.....: Nome " + HomemAlto_nome + " Altura : " +HomemAlto_altura );
                System.out.println("Mulher mais forte...: Nome " + MulherPeso_nome + " Peso : " +MulherPeso_peso );
                System.out.println("A porcentegem de mulheres e " + PorM + "%");
                System.out.println("A porcentegem de homens e " + PorH + "%");
                System.out.println("A media da altura dos homens e " + (SomaH / Qtde_homens));
                System.out.println("A media do peso das mulheres e " + (SomaPM / Qtde_mulheres));
                System.out.println("A idade media das pessoas e " + MedI);
                System.out.println("As pessoas mais velhas são" + PessoaV_nome + "com a idade de:" + IdadeV);
                System.out.println("Pessoas que contrairam COVID-19 = "+ pcovid);
                System.out.println("Quantidade de homens que contrairam COVID- 19 é " + SHC);
                System.out.println("Quantidade de mulheres que contrairam COVID19 é " + SMC);

                System.out.println("Homens: ");
                for (int i = 0; i <= nPessoas - 1; i++) {
                if (V_sexo[i] == 'M') {
                System.out.println(" Nome: " + V_nome[i] + " Altura " + V_altura[i] + " Peso " + V_peso[i]);
                }
                
                System.out.println("Mulheres:");
                for (int i = 0; i <= nPessoas - 1; i++) {
                if (V_sexo[i] == 'F') {
                System.out.println(" Nome: " + V_nome[i] + " Altura " + V_altura[i] + " Peso " + V_peso[i]);
                }
        }
}