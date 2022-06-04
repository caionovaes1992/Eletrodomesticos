package aplicacao;
import eletrodomesticos.Fogao;
import eletrodomesticos.Geladeira;
import eletrodomesticos.Porta;
import eletrodomesticos.Tampa;

public class AppEletrodomesticos {
    public static void main(String[] args){
        // TODO Auto-generated method sub
        // Geladeira com construtor vazio
        Geladeira gl1 = new Geladeira();
        gl1.entrada();
        gl1.imprimir();
        // Fogão com construtor vazio
        Fogao fg1 = new Fogao();
        fg1.entrada();
        fg1.imprimir();
        // Geladeira com construtor completo
        // cria um objeto temporário para passar com parâmetro
        Porta paux1 = new Porta(65, 45, true);
        // cria um objeto temporário para passar com parâmetro
        Porta paux2 = new Porta(25, 45, false);
        Geladeira gl2 = new Geladeira("GE", "AB123", 365, 899.00, 350, paux1, paux2);
        gl2.imprimir();
        // Fogao com construtor completo
        // cria um objeto temporário para passar com parâmetro
        Porta paux3 = new Porta(45, 50, true);
        // cria um objeto temporário para passar com parâmetro
        Tampa taux1 = new Tampa("Vidro", 5.5);
        Fogao fg2 = new Fogao("Brastemp", "FG404", 250, 599.00, "Prata", paux3, taux1);
        fg2.imprimir();
    }
}
