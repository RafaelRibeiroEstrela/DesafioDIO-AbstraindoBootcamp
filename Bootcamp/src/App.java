import entitites.Aula;
import entitites.Bootcamp;
import entitites.Curso;
import entitites.Usuario;
import entitites.enums.NivelEnum;

import java.time.LocalDate;

public class App {
    public static void main(String[] args){
        Bootcamp bootcamp = new Bootcamp("GFT Quality Assurance #1", NivelEnum.BASICO, 64,
                "Conheça já o Bootcamp GFT Quality Assurance #1: um programa feito para você que planeja desenvolver suas habilidades em QA. Com cursos, desafios de códigos, mentorias e desafios de projeto, suas chances de ganhar destaque no mercado só aumentam! Não perca essa chance e inscreva-se já",
                null, LocalDate.of(2022, 4, 3));

        Curso curso = new Curso("Lógica de Programação Essencial", NivelEnum.BASICO, 4);

        Aula aula = new Aula("Entendendo o que é lógica", new String("Video aula").getBytes());

        Usuario dev = new Usuario("Carlos", "carlos@gmail.com", "12345");

        curso.getAulas().add(aula);
        bootcamp.getCursos().add(curso);
        bootcamp.getDesenvolvedores().add(dev);

        System.out.println(bootcamp);

    }
}
