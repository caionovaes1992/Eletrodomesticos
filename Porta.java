package eletrodomesticos;

import java.util.Scanner;

public class Porta {
    // como a classe Porta não terá subclasses,
    // a visibilidade de seus membros deve ser limitada (private)
    private double comprimento, largura;
    private boolean vidro;
    public double getComprimento(){
        return comprimento;
    }
    public void setComprimento (double co){
        comprimento = verificarComprimento(co);
    }
    public double getLargura(){
        return largura;
    }
    public void setLargura(double la){
        largura = verificarLargura(la);
    }
    public boolean getVidro(){
        return vidro;
    }
    public void setVidro(boolean vi){
        vidro = vi;
    }
    // métodos privados
    private double verificarComprimento(double co){
        if(co>0){
            return co;
        } else {
            return 0.0;
        }
    }
    private double verificarLargura(double la){
        if(la>0){
            return la;
        } else {
            return 0.0;
        }
    }
    // como não há superclasse, não existe reaproveitamento de métodos construtores
    public Porta(){}
    public Porta(double comprimento){
        setComprimento(comprimento);
    }
    public Porta(boolean vidro){
        setVidro(vidro);
    }
    public Porta(double comprimento, double largura){
        setComprimento(comprimento);
        setLargura(largura);
    }
    public Porta(double comprimento, double largura, boolean vidro){
        setComprimento(comprimento);
        setLargura(largura);
        setVidro(vidro);
    }
    // métodos que poderão ser reaproveitados na agregação
    public void imprimir(){
        System.out.println("***** Porta *****");
        System.out.println("Comprimento : " + getComprimento());
        System.out.println("Largura : " + getLargura());
        // como o vidro é lógico (boolean), devemos verificar
        // se é true ou false e apresentar a mensagem
        // explicativa ao usuario
        if(getVidro()){
            System.out.println("Possui vidro.");
        } else {
            System.out.println("Não possui vidro.");
        }
    }
    public void cadastrar(double comprimento, double largura, boolean vidro){
        setComprimento(comprimento);
        setLargura(largura);
        setVidro(vidro);
    }
    public void entrada(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("***** Porta *****");
        System.out.println("Comprimento : ");
        setComprimento(Double.parseDouble(entrada.nextLine()));
        System.out.println("Largura : ");
        setLargura(Double.parseDouble(entrada.nextLine()));
        // como vidro é lógico (boolean), devemos dar opções
        // para o usuário escolher, uma vez que não será
        // adequado responder true ou false
        System.out.println("possui vidro [1-sim, 2-não]: ");
        if(Integer.parseInt(entrada.nextLine()) == 1){
            setVidro(true);
        } else {
            setVidro(false);
        }
    }
}    
