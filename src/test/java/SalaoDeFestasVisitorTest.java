import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaoDeFestasVisitorTest {

    @Test
    void deveExibirHappyHour() {
        HappyHour happyhour = new HappyHour("11/05/2021", "21h30", "Halloween", 4000, 140);

        SalaoDeFestasVisitor visitor = new SalaoDeFestasVisitor();
        assertEquals("HappyHour{data=11/05/2021, horario=21h30, temaDaFesta=Halloween, quantidadeDeSalgados=4000, quantidadeDeBebida=140}", visitor.exibir(happyhour));
    }

    @Test
    void deveExibirFestaInfantil() {
        FestaInfantil infantil = new FestaInfantil("05/11/2021", "10h30", "Ben-10", 6340, 230);

        SalaoDeFestasVisitor visitor = new SalaoDeFestasVisitor();
        assertEquals("FestaInfantil{data=05/11/2021, horario=10h30, temaDaFesta=Ben-10, quantidadeDeSalgados=6340, quantidadeDeBebida=230}", visitor.exibir(infantil));
    }

    @Test
    void deveExibirDespedidaDeSolteiro() {
        DespedidaDeSolteiro despedidadesolteiro = new DespedidaDeSolteiro("13/07/2021", "23h40", "Mexicano", 400, 430);

        SalaoDeFestasVisitor visitor = new SalaoDeFestasVisitor();
        assertEquals("DespedidaDeSolteiro{data=13/07/2021, horario=23h40, temaDaFesta=Mexicano, quantidadeDeSalgados=400, quantidadeDeBebida=430}", visitor.exibir(despedidadesolteiro));
    }
}