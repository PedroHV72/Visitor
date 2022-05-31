package Visitor;

public class DesenvolvedorVisitor implements Visitor {

    public String exibirDesenvolvedor(Desenvolvedor desenvolvedor) {
        return desenvolvedor.desenvolvedor(this);
    }

    @Override
    public String exibirJunior(Junior junior) {
        return "Junior{" +
                "nome='" + junior.getNome() +
                "', salario=" + junior.getSalario() +
                ", cargo=" + junior.getNomeCargo() +
                '}';
    }

    @Override
    public String exibirPleno(Pleno pleno) {
        return "Pleno{" +
                "nome='" + pleno.getNome() + '\'' +
                ", salario=" + pleno.getSalario() +
                ", cargo='" + pleno.getNomeCargo() + '\'' +
                '}';
    }

    @Override
    public String exibirSenior(Senior senior) {
        return "Senior{" +
                "nome='" + senior.getNome() +
                "', salario=" + senior.getSalario() +
                ", cargo='" + senior.getNomeCargo() + '\'' +
                '}';
    }
}
