package eletrodomesticos;

import java.util.Scanner;

public class Fogao extends Eletrodomesticos {
    // como a classe fogão não terá subclasses,
    // a visibilidade de seus membros deve ser limitada (private)
    private String cor;
    // objetos agregados devem ser públicos, caso contrário seus
    // membros não poderão ser visíveis na aplicação
    // já na classe Tampa, os membros não agregados devem ser protegidos
    // porta1 foi herdada de Superclasse Eletrodomesticos
    public Tampa tampa = new Tampa();
    public String getCor(){
        return cor;
    }
    public void setCor(String co){
        cor = verificarCor(co);
    }
    public Tampa getTampa(){
        return tampa;
    }
    // atribuirá um objeto Porta passado como parâmetro (referência implícita)
    public void setTampa(Tampa ta){
        tampa = ta;
    }
    // método privado
    private String verificarCor(String co){
        if(!co.isEmpty()){
            return co;
        } else {
            return "";
        }
    }
    // reaproveitamento dos métodos construtores da Superclasse
    public Fogao(){
        super();
    }
    public Fogao(String marca, String modelo){
        super(marca, modelo);
    }
    public Fogao(String marca, String modelo, int volume, double preco){
        super(marca, modelo, volume, preco);
    }
    public Fogao(String marca, String modelo, int volume, double preco, String cor){
        super(marca, modelo, volume, preco);
        setCor(cor);
    }
    public Fogao(String marca, String modelo, int volume, double preco, String cor, Porta porta1, Tampa tampa){
        super(marca, modelo, volume, preco, porta1);
        setCor(cor);
        setTampa(tampa);
    }
    // reaproveitamento de métodos da Superclasse e das classes agregadas
    public void imprimir(){
        System.out.println("***** Fogão *****");
        super.imprimir();
        tampa.imprimir();
        System.out.println("Cor : " + getCor());
    }
    public void cadastrar(String marca, String modelo, int volume, double preco, String cor, Porta p1, Tampa ta){
        super.cadastrar(marca, modelo, volume, preco, p1);
        setCor(cor);
        tampa.cadastrar(ta.getMaterial(), ta.getEspessura());
    }
    public void entrada(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("***** Fogão *****");
        super.entrada();
        System.out.println("Cor : ");
        setCor(entrada.nextLine());
        tampa.entrada();
    }
}
