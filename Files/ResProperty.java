// Residential Property class
//51422107 Ncube NM
//53546407 Moraba L
class ResProperty extends Property implements Propable {
    private char typeRes;
    private int numBeds;
    private int numBaths;
    private int numGarages;

    public ResProperty() {
        super();
        typeRes = ' ';
        numBeds = 0;
        numBaths = 0;
        numGarages = 0;
    }

    public ResProperty(char type, String name, int contact, int contrDuration, char typeRes, int numBeds, int numBaths, int numGarages) {
        super(type, name, contact, contrDuration);
        setTypeRes(typeRes);
        setNumBeds(numBeds);
        setNumBaths(numBaths);
        setNumGarages(numGarages);
    }

    public void setTypeRes(char typeRes) {
        this.typeRes = typeRes;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    public void setNumBaths(int numBaths) {
        this.numBaths = numBaths;
    }

    public void setNumGarages(int numGarages) {
        this.numGarages = numGarages;
    }

    public char getTypeRes() {
        return this.typeRes;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public int getNumBaths() {
        return numBaths;
    }

    public int getNumGarages() {
        return numGarages;
    }

    @Override
    public double calcMonthRent() {
        int totalRent = 0;
        switch (getTypeRes()) {
            case 'F':
                totalRent = 8000 + (500 * getNumBeds());
                break;
            case 'T':
                totalRent = 15000 + (1000 * getNumBeds());
                break;
            case 'H':
                totalRent = 12000 + (800 * getNumBeds());
                break;
        }
        return totalRent;
    }

    @Override
    public String toString() {
        return super.toString() + "\tBeds: " + getNumBeds() + "\tBaths: " + getNumBaths() + "\tGarages: " + getNumGarages();
    }
}
