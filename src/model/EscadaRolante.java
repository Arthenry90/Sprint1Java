package model;

import java.util.Objects;

/**
 * Representa uma escada rolante monitorada pelo sistema.
 *
 * <p>Armazena os dados de identificação, o status operacional,
 * as leituras dos sensores e o local de instalação do equipamento.</p>
 *
 * <p>Os valores dos sensores representam as leituras atuais da escada.
 * O histórico de medições poderá ser modelado separadamente, caso
 * o projeto precise armazenar leituras realizadas em diferentes horários.</p>
 *
 * @author Arthenry
 * @version 1.0
 * @see EquipamentoMonitorado
 * @see Localizacao
 */
public class EscadaRolante extends EquipamentoMonitorado {

    /** Valor de vibração medido no motor e no redutor. */
    private double vibracao;

    /** Temperatura dos componentes mecânicos. */
    private double temperatura;

    /** Corrente elétrica medida no sistema. */
    private double corrente;

    /** Tensão elétrica medida no sistema. */
    private double tensao;

    /** Nível atual de óleo do sistema de lubrificação. */
    private double nivelOleo;

    /** Velocidade de movimentação dos degraus. */
    private double velocidade;

    /** Local em que a escada rolante está instalada. */
    private final Localizacao localizacao;

    /**
     * Cria uma escada rolante com seus dados de identificação,
     * leituras de sensores e local de instalação.
     *
     * @param id identificador único da escada
     * @param identificacao código de identificação da escada
     * @param status estado operacional inicial
     * @param vibracao leitura de vibração do motor e redutor
     * @param temperatura temperatura dos componentes mecânicos
     * @param corrente corrente elétrica medida
     * @param tensao tensão elétrica medida
     * @param nivelOleo nível de óleo do sistema de lubrificação
     * @param velocidade velocidade de movimentação dos degraus
     * @param localizacao local de instalação da escada; não pode ser nulo
     */
    public EscadaRolante(
            int id,
            String identificacao,
            String status,
            double vibracao,
            double temperatura,
            double corrente,
            double tensao,
            double nivelOleo,
            double velocidade,
            Localizacao localizacao) {

        super(id, identificacao, status);

        this.vibracao = vibracao;
        this.temperatura = temperatura;
        this.corrente = corrente;
        this.tensao = tensao;
        this.nivelOleo = nivelOleo;
        this.velocidade = velocidade;
        this.localizacao = Objects.requireNonNull(
                localizacao, "A localização é obrigatória.");
    }

    /**
     * Retorna a leitura atual de vibração.
     *
     * @return valor da vibração
     */
    public double getVibracao() {
        return vibracao;
    }

    /**
     * Retorna a temperatura atual dos componentes mecânicos.
     *
     * @return temperatura medida
     */
    public double getTemperatura() {
        return temperatura;
    }

    /**
     * Retorna a corrente elétrica medida.
     *
     * @return corrente elétrica
     */
    public double getCorrente() {
        return corrente;
    }

    /**
     * Retorna a tensão elétrica medida.
     *
     * @return tensão elétrica
     */
    public double getTensao() {
        return tensao;
    }

    /**
     * Retorna o nível atual de óleo.
     *
     * @return nível de óleo medido
     */
    public double getNivelOleo() {
        return nivelOleo;
    }

    /**
     * Retorna a velocidade de movimentação dos degraus.
     *
     * @return velocidade medida
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * Retorna o local de instalação da escada.
     *
     * @return objeto que representa a localização da escada
     */
    public Localizacao getLocalizacao() {
        return localizacao;
    }

    /**
     * Atualiza as leituras dos sensores da escada rolante.
     *
     * @param vibracao nova leitura de vibração
     * @param temperatura nova leitura de temperatura
     * @param corrente nova leitura de corrente elétrica
     * @param tensao nova leitura de tensão elétrica
     * @param nivelOleo novo nível de óleo
     * @param velocidade nova leitura de velocidade
     */
    public void atualizarLeituras(
            double vibracao,
            double temperatura,
            double corrente,
            double tensao,
            double nivelOleo,
            double velocidade) {

        this.vibracao = vibracao;
        this.temperatura = temperatura;
        this.corrente = corrente;
        this.tensao = tensao;
        this.nivelOleo = nivelOleo;
        this.velocidade = velocidade;
    }

    /**
     * Retorna a classificação do equipamento.
     *
     * @return o texto "Escada rolante"
     */
    @Override
    public String getTipoEquipamento() {
        return "Escada rolante";
    }

    /**
     * Retorna todos os dados da escada rolante, incluindo as leituras
     * atuais dos sensores e sua localização.
     *
     * @return representação textual completa da escada
     */
    @Override
    public String toString() {
        return super.toString()
                + "\nVibração: " + vibracao
                + "\nTemperatura: " + temperatura
                + "\nCorrente: " + corrente
                + "\nTensão: " + tensao
                + "\nNível de óleo: " + nivelOleo
                + "\nVelocidade: " + velocidade
                + "\nLocalização:\n" + localizacao;
    }
}