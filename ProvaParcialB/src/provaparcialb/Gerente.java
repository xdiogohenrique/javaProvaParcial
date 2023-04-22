package provaparcialb;

public class Gerente extends Trabalhador{

    String departamento;
    double bonificacao;
    String regiao;

    public Gerente() {
    }

    
    public Gerente(String departamento, double bonificacao, String regiao) {
        this.departamento = departamento;
        this.bonificacao = bonificacao;
        this.regiao = regiao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "Gerente{" + "departamento=" + departamento + ", bonificacao=" + bonificacao + ", regiao=" + regiao + '}';
    }
    
    public double calcularBonificação(float salario){
        double calculo = salario*1.15;
        System.out.println("Gerente: " + this.nome);
        System.out.println("Bonificação: " + calculo);
        return calculo;
    }
    
    public void calcularAumento(){
        if (regiao.equalsIgnoreCase("Zona Sul")){
            System.out.println("A zona que trabalha é a zona sul");
            System.out.println("Seu aumento será de 10%");
            System.out.println("Seu novo salário será: " + (salario*12)*1.10);
        
        }else{
            if(regiao.equalsIgnoreCase("Zona Norte")){
            System.out.println("A zona que trabalha é a zona norte");
            System.out.println("Seu aumento será de 10.05%");
            System.out.println("Seu novo salário será: " + (salario*12)*1.1005);
            }
            else {
            if(regiao.equalsIgnoreCase("Zona Leste")){    
            System.out.println("A zona que trabalha é a zona leste");
            System.out.println("Seu aumento será de 10.85%");
            System.out.println("Seu novo salário será: " + (salario*12)*1.1085);
            }
            else{
            if(regiao.equalsIgnoreCase("Zona Oeste"))    
            System.out.println("A zona que trabalha é a zona oeste");
            System.out.println("Seu aumento será de 9.96%");
            System.out.println("Seu novo salário será: " + (salario*12)*1.0996);
            }
        }
        
        
    } 
    
}
    
    public void gerente(){
        if (salario > 4000){
            System.out.println("Salário é: " + salario);
        }
    }
    
    
}
    

    
