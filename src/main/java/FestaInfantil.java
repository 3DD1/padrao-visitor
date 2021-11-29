public class FestaInfantil implements SalaoDeFestas{
    private String data;
    private String horario;
    private String temaDaFesta;
    private int quantidadeDeSalgados;
    private int quantidadeDeBebida;

    public FestaInfantil(String data, String horario, String temaDaFesta, int quantidadeDeSalgados, int quantidadeDeBebida) {
        this.data = data;
        this.horario = horario;
        this.temaDaFesta = temaDaFesta;
        this.quantidadeDeSalgados = quantidadeDeSalgados;
        this.quantidadeDeBebida = quantidadeDeBebida;
    }


    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getTemaDaFesta() {
        return temaDaFesta;
    }

    public int getQuantidadeDeSalgados() {
        return quantidadeDeSalgados;
    }

    public int getQuantidadeDeBebida() {
        return quantidadeDeBebida;
    }
    public String aceitar(Visitor visitor) {
        return visitor.exibirFestaInfantil(this);
    }
}
