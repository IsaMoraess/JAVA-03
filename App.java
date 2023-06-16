import java.io.PrintStream;

public class App {

    public static void main(String[] args) throws Exception{
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca =16;

        // Personagem: <nome> (lvl <nivel>) com <forca> de força.
        System.out.println(heroi.nivel);

    }
} 