// Business Property class

//51422107 Ncube NM
//53546407 Moraba L
class BusProperty extends Property implements Propable {
    private int size;
    private int insurePM;
    private int rentPM;

    public BusProperty() {
        super();
        size = 0;
        insurePM = 0;
        rentPM = 0;
    }

    public BusProperty(char type, String name, int contact, int contrDuration, int size, int insurePM, int rentPM) {
        super(type, name, contact, contrDuration);
        setSize(size);
        setInsurePM(insurePM);
        setRentPM(rentPM);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setInsurePM(int insurePM) {
        this.insurePM = insurePM;
    }

    public void setRentPM(int rentPM) {
        this.rentPM = rentPM;
    }

    public int getSize() {
        return size;
    }

    public int getInsurePM() {
        return insurePM;
    }

    public int getRentPM() {
        return rentPM;
    }

    @Override
    public double calcMonthRent() {
        final int rentPSM = 250;
        return getSize() * rentPSM;
    }

    public int calcMonthInsurance() {
        final int insurancePSM = 50;
        return getSize() * insurancePSM;
    }

    @Override
    public String toString() {
        return super.toString() + "\tSize: " + getSize() + " sqm\tRent: " + calcMonthRent() + "\tInsurance: " + calcMonthInsurance();
    }
}