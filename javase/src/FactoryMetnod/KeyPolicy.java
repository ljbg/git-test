package FactoryMetnod;

public class KeyPolicy implements PolicyProducer {
    @Override
    public AutoInsurance getInsurObj() {
        return new KeyInjur();
    }
}
