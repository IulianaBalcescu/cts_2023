package Probleme.builder;

public class SpitalBuider implements IBuilder{

    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    public SpitalBuider() {
        patRabatabil=false;
        micDejun=false;
        papuciCamera=false;
        halatInterior=false;
    }

    public SpitalBuider setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public SpitalBuider setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public SpitalBuider setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public SpitalBuider setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }

    @Override
    public Spital build() {
        Spital spital=new Spital(patRabatabil,micDejun,papuciCamera,halatInterior);
        return spital;
    }
}
