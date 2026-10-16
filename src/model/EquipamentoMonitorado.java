package model;

/**
 * Classe-base para representar equipamentos monitorados pela aplicação.
 *
 * <p>Centraliza os atributos comuns aos equipamentos e define um contrato
 * para que cada tipo concreto informe sua própria classificação.</p>
 *
 * <p>Por ser abstrata, esta classe não é instanciada diretamente. Seus
 * comportamentos são herdados por classes concretas, como EscadaRolante.</p>
 *
 * @author Arthenry
 * @version 1.0
 */
public abstract class EquipamentoMonitorado {

    /** Identificador único do equipamento. */
    private int id;

    /** Código ou nome utilizado para identificar o equipamento. */
    private String identificacao;

    /** Estado operacional atual do equipamento. */
    private String status;

    /**
     * Cria um equipamento monitorado com seus dados básicos.
     *
     * @param id identificador do equipamento
     * @param identificacao código ou nome do equipamento
     * @param status estado operacional inicial
     */
    public EquipamentoMonitorado(
            int id, String identificacao, String status) {
        this.id = id;
        this.identificacao = identificacao;
        this.status = status;
    }

    /**
     * Retorna o identificador do equipamento.
     *
     * @return identificador do equipamento
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna a identificação do equipamento.
     *
     * @return código ou nome do equipamento
     */
    public String getIdentificacao() {
        return identificacao;
    }

    /**
     * Retorna o status operacional atual.
     *
     * @return status do equipamento
     */
    public String getStatus() {
        return status;
    }

    /**
     * Atualiza o status operacional do equipamento.
     *
     * @param status novo estado operacional
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Informa o tipo específico do equipamento.
     *
     * @return descrição do tipo de equipamento
     */
    public abstract String getTipoEquipamento();

    /**
     * Retorna uma representação textual dos dados básicos.
     *
     * <p>A chamada a getTipoEquipamento() permite que o tipo concreto
     * seja determinado por polimorfismo.</p>
     *
     * @return dados básicos do equipamento formatados como texto
     */
    @Override
    public String toString() {
        return "Tipo: " + getTipoEquipamento()
                + "\nID: " + id
                + "\nIdentificação: " + identificacao
                + "\nStatus: " + status;
    }
}