package Futebol;

import java.sql.SQLOutput;
import java.util.*;

public class Jogador {
    private String nome;
    private Integer numero;
    private String posicao;
    private Integer idade;
    private Integer gols;
    private Integer assistencias;
    private Integer titulos;
    private Integer copas_do_mundo;
    private Integer bolas_de_ouro;
    private String time;
    private String nacionalidade;
    public Jogador(String nome, Integer idade,String nacionalidade, String time,
                   Integer numero, String posicao, Integer gols, Integer assistencias,
                   Integer titulos, Integer copas_do_mundo, Integer bolas_de_ouro){
        this.nome=nome;
        this.numero=numero;
        this.posicao=posicao;
        this.idade=idade;
        this.gols=gols;
        this.assistencias=assistencias;
        this.titulos=titulos;
        this.copas_do_mundo=copas_do_mundo;
        this.bolas_de_ouro=bolas_de_ouro;
        this.time=time;
        this.nacionalidade=nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public Integer getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(Integer assistencias) {
        this.assistencias = assistencias;
    }

    public Integer getTitulos() {
        return titulos;
    }

    public void setTitulos(Integer titulos) {
        this.titulos = titulos;
    }

    public Integer getCopas_do_mundo() {
        return copas_do_mundo;
    }

    public void setCopas_do_mundo(Integer copas_do_mundo) {
        this.copas_do_mundo = copas_do_mundo;
    }

    public Integer getBolas_de_ouro() {
        return bolas_de_ouro;
    }

    public void setBolas_de_ouro(Integer bolas_de_ouro) {
        this.bolas_de_ouro = bolas_de_ouro;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void mostrarDados(){
        System.out.printf("Nome: %s",getNome());
        System.out.println("");
        System.out.printf("Idade: %d",getIdade());
        System.out.println("");
        System.out.printf("Nacionalidade: %s",getNacionalidade());
        System.out.println("");
        System.out.printf("Time: %s",getTime());
        System.out.println("");
        System.out.printf("Numero da camisa: %d",getNumero());
        System.out.println("");
        System.out.printf("Posicao: %s",getPosicao());
        System.out.println("");
        System.out.printf("Gols: %d", getGols());
        System.out.println("");
        System.out.printf("Assistencias: %d", getAssistencias());
        System.out.println("");
        System.out.printf("Titulos: %d",getTitulos());
        System.out.println("");
        System.out.printf("Quantidade de Copas do Mundo: %d",getCopas_do_mundo());
        System.out.println("");
        System.out.printf("Bolas de Ouro: %d",getBolas_de_ouro());
        System.out.println("");
    }

    public void criarCartaNoFifa(){
        Scanner fifa = new Scanner(System.in);
        System.out.print("Velocidade: ");
        Integer velocidade = fifa.nextInt();
        System.out.print("Chute: ");
        Integer chute = fifa.nextInt();
        System.out.print("Passes: ");
        Integer passes = fifa.nextInt();
        System.out.print("Drible: ");
        Integer drible = fifa.nextInt();
        System.out.print("Defesa: ");
        Integer defesa = fifa.nextInt();
        System.out.print("Fisico: ");
        Integer fisico = fifa.nextInt();
        Integer soma_atributos = velocidade+chute+passes+drible+defesa+fisico;
        Integer overall = soma_atributos/6;
        System.out.printf("Seu Overall no FIFA Seria: %d",overall);
        System.out.println("");
    }

    public void treinarPenaltis(){
        while (true){
            Random random = new Random();
            int numero = random.nextInt(3);
            Scanner escolha_scanner = new Scanner(System.in);
            System.out.println("Escolha um lado para bater:");
            System.out.println("[0] Esquerda");
            System.out.println("[1] Meio");
            System.out.println("[2] Direita");
            System.out.print("Qual a sua escolha?");
            Integer escolha = escolha_scanner.nextInt();
            if (escolha==numero){
                System.out.println("PEEEEEEEEEEEEEEGA O GOLEIRO");
                System.out.println("Mais sorte na proxima...");
            }
            else{
                System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOL");
                System.out.println("Bela batida!");
            }
            System.out.println("Deseja continuar?");
            System.out.println("[0] Sim");
            System.out.println("[1] Nao");
            System.out.print("Digite sua escolha:");
            Integer escolha2 = escolha_scanner.nextInt();
            if (escolha2==1){
                break;
            }
        }
    }

    public void aposentar(){
        if (idade<30){
            System.out.printf("Apos uma lesao muito grave, o jogador de %d anos," +
                    " %s, pendura suas chuteiras.",idade,nome);
            System.out.println();
            System.out.println("Uma perda gigante para o futebol e mais um idolo" +
                    " para a historia desse esporte");
        }
        if (idade>=30){
            System.out.printf("Depois de uma carreira inteira de conquistas e muitas vitorias," +
                    " o jogador %s se aposenta aos %d anos",nome,idade);
        }
    }
}