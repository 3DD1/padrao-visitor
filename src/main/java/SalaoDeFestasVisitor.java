public class SalaoDeFestasVisitor implements Visitor{
    public String exibir(SalaoDeFestas salao) {
        return salao.aceitar(this);
    }

    @Override
    public String exibirFestaInfantil(FestaInfantil infantil) {
        return "FestaInfantil{" +
                "data=" + infantil.getData() +
                ", horario='" + infantil.getHorario() + '\'' +
                ", temaDaFesta=" + infantil.getTemaDaFesta() +
                ", quantidadeDeSalgados=" + infantil.getQuantidadeDeSalgados() +
                ", quantidadeDeBebida=" + infantil.getQuantidadeDeBebida() +
                '}';
    }

    @Override
    public String exibirHappyHour(HappyHour happyhour) {
        return "HappyHour{" +
                "data=" + happyhour.getData() +
                ", horario='" + happyhour.getHorario() + '\'' +
                ", temaDaFesta=" + happyhour.getTemaDaFesta() +
                ", quantidadeDeSalgados=" + happyhour.getQuantidadeDeSalgados() +
                ", quantidadeDeBebida=" + happyhour.getQuantidadeDeBebida() +
                '}';
    }

    @Override
    public String exibirDespedidaDeSolteiro(DespedidaDeSolteiro despedidadesolteiro) {
        return "DespedidaDeSolteiro{" +
                "data=" + despedidadesolteiro.getData() +
                ", horario='" + despedidadesolteiro.getHorario() + '\'' +
                ", temaDaFesta=" + despedidadesolteiro.getTemaDaFesta() +
                ", quantidadeDeSalgados=" + despedidadesolteiro.getQuantidadeDeSalgados() +
                ", quantidadeDeBebida=" + despedidadesolteiro.getQuantidadeDeBebida() +
                '}';
    }
}
