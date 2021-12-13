package use_case;

public class ItemPrincipioAtivo {
    private PrincipioAtivo principioAtivo;
    private double dose;

    ItemPrincipioAtivo(PrincipioAtivo principioAtivo, double dose) {
        this.principioAtivo = principioAtivo;
        this.dose = dose;
    }

    public PrincipioAtivo getPrincipioAtivo() {
        return this.principioAtivo;
    }

    public double getDose() {
        return this.dose;
    }
}
