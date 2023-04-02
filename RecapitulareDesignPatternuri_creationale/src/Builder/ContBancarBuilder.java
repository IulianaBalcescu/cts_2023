package Builder;

public class ContBancarBuilder implements IBuilder{

    private String detinator;
    private double sumaBlocata;
    private double suma;
    private String moneda;

    private boolean cardAtasat;
    private boolean internetBanking;
    private boolean contSalariu;

    public ContBancarBuilder() {
        moneda="RON";
        sumaBlocata=19;
    }

    public ContBancarBuilder setDetinator(String detinator) {
        this.detinator = detinator;
        return this;
    }

    public ContBancarBuilder setSumaBlocata(double sumaBlocata) {
        this.sumaBlocata = sumaBlocata;
        return this;
    }

    public ContBancarBuilder setSuma(double suma) {
        this.suma = suma;
        return this;
    }

    public ContBancarBuilder setMoneda(String moneda) {
        this.moneda = moneda;
        return this;
    }

    public ContBancarBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBancarBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancarBuilder setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
        return this;
    }

    @Override
    public ContBancar build() {
        ContBancar cont=new ContBancar(detinator,sumaBlocata,suma,moneda,cardAtasat,internetBanking,
                contSalariu);
        return cont;
    }
}
