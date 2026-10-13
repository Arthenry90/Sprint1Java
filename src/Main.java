import model.EscadaRolante;
import model.Localizacao;

/**
 * Classe principal da aplicação de monitoramento de escadas rolantes.
 *
 * <p>Cria objetos de exemplo e demonstra a impressão dos dados
 * das entidades modeladas.</p>
 *
 * @author Grupo do Challenge
 * @version 1.0
 */
public class Main {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args argumentos recebidos na inicialização do programa
     */
    public static void main(String[] args) {

        Localizacao local = new Localizacao(
                1,
                "Republica",
                "Republica - Centro",
                "Piso 2"
        );

        EscadaRolante escada = new EscadaRolante(
                1,
                "ESC-001",
                "Ativa",
                2.5,
                38.7,
                12.4,
                220.0,
                85.0,
                0.5,
                local
        );

        System.out.println("===== DADOS DA LOCALIZAÇÃO =====");
        System.out.println(local);

        System.out.println("\n===== DADOS DA ESCADA ROLANTE =====");
        System.out.println(escada);
    }
}