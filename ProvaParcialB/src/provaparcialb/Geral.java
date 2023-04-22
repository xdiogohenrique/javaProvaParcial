package provaparcialb;

public class Geral {

    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente();
        gerente1.nome = "Rodrigo";
        gerente1.idade = 34;
        gerente1.registro = 256;
        gerente1.salario = 8000;
        gerente1.departamento = "SAC";
        gerente1.regiao = "Zona norte";
        gerente1.calcularAumento();
        gerente1.calcularBonificação(8000);
        
        
        Gerente gerente2 = new Gerente();
        gerente2.nome = "Franscisco";
        gerente2.idade = 29;
        gerente2.registro = 269;
        gerente2.salario = 10500;
        gerente2.departamento = "SAC";
        gerente2.regiao = "Zona sul";
        gerente2.calcularAumento();
        gerente2.calcularBonificação(10500);
        
        Gerente gerente3 = new Gerente();
        gerente3.nome = "Roberto";
        gerente3.idade = 24;
        gerente3.registro = 226;
        gerente3.salario = 6000;
        gerente3.departamento = "SAC";
        gerente3.regiao = "Zona leste";
        gerente3.calcularAumento();
        gerente3.calcularBonificação(6000);
    }
    
}
