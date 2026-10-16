package model;

/**
 * Representa o local de instalação de uma escada rolante.
 *
 * <p>Permite identificar o local e organizar os equipamentos por endereço
 * ou setor, facilitando a centralização das informações de monitoramento.</p>
 *
 * @author Arthenry
 * @version 1.0
 */
public class Localizacao {

    /** Identificador único da localização. */
    private int id;

    /** Nome do estabelecimento ou local de instalação. */
    private String nome;

    /** Endereço do local de instalação. */
    private String endereco;

    /** Setor ou área específica onde a escada está instalada. */
    private String setor;

    /**
     * Cria uma localização com seus dados de identificação.
     *
     * @param id identificador único da localização
     * @param nome nome do estabelecimento ou local
     * @param endereco endereço do local
     * @param setor setor ou área de instalação
     */
    public Localizacao(
            int id, String nome, String endereco, String setor) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.setor = setor;
    }

    /**
     * Retorna o identificador da localização.
     *
     * @return identificador da localização
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna o nome do local.
     *
     * @return nome do estabelecimento
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o endereço do local.
     *
     * @return endereço de instalação
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Retorna o setor de instalação.
     *
     * @return nome ou identificação do setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * Retorna uma representação textual da localização.
     *
     * @return dados da localização formatados como texto
     */
    @Override
    public String toString() {
        return "ID da localização: " + id
                + "\nLocal: " + nome
                + "\nEndereço: " + endereco
                + "\nSetor: " + setor;
    }
}