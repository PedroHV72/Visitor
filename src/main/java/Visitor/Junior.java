package Visitor;

public class Junior implements Desenvolvedor {

    private String nome;
    private Float salario;
    private Cargo cargo;

    public Junior(String nome, Float salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public Float getSalario() {
        return salario;
    }

    public String getNomeCargo() {
        return this.cargo.getNome();
    }

    public String desenvolvedor(Visitor visitor) {
        return visitor.exibirJunior(this);
    }

}
