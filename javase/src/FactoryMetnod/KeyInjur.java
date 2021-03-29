package FactoryMetnod;

public class KeyInjur implements AutoInsurance {
    private String description;
    @Override
    public String getInfo() {
        description = "hello";
        return description;
    }
}
