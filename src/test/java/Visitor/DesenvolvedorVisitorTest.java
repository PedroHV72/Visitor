package Visitor;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DesenvolvedorVisitorTest {

    @Test
    void deveExibirJunior() {
        Junior junior = new Junior("Pedro", 3000.0f, new Cargo("Desenvolvedor Junior"));

        DesenvolvedorVisitor visitor = new DesenvolvedorVisitor();
        assertEquals("Junior{nome='Pedro', salario=3000.0, cargo=Desenvolvedor Junior}", visitor.exibirDesenvolvedor(junior));
    }

    @Test
    void deveExibirPleno() {
        Pleno pleno = new Pleno("Pedro", 6000.0f, new Cargo("Desenvolvedor Pleno"));

        DesenvolvedorVisitor visitor = new DesenvolvedorVisitor();
        assertEquals("Pleno{nome='Pedro', salario=6000.0, cargo='Desenvolvedor Pleno'}", visitor.exibirDesenvolvedor(pleno));
    }

    @Test
    void deveExibirSenior() {
        Senior senior = new Senior("Pedro", 10000.0f, new Cargo("Desenvolvedor Senior"));

        DesenvolvedorVisitor visitor = new DesenvolvedorVisitor();
        assertEquals("Senior{nome='Pedro', salario=10000.0, cargo='Desenvolvedor Senior'}", visitor.exibirDesenvolvedor(senior));
    }

}
