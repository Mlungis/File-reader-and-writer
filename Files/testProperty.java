import java.util.ArrayList;
//51422107 Ncube NM
//53546407 Moraba L
// Main testing class
 class testProperty {
    public static void main(String[] args) {
        ArrayList<Propable> properties = new ArrayList<>();

        FileClass fc = new FileClass();
        Property[] props = fc.getPropertyArray();

        for (int i = 0; i < fc.getCount(); i++) {
            if (props[i] instanceof Propable) {
                properties.add((Propable) props[i]);
            }
        }

        displayResidentialProperties(properties);
        displayBusinessProperties(properties);

        fc.writeTownHToFile(); 
    }

    public static void displayResidentialProperties(ArrayList<Propable> properties) {
        System.out.println("=================================");
        System.out.println("    Residential Properties");
        System.out.println("=================================");

        boolean found = false;
        for (Propable property : properties) {
            if (property instanceof ResProperty) {
                found = true;
                System.out.println(property.toString());
                System.out.println("Rent Amount: R" + property.calcMonthRent());
                System.out.println();
            }
        }

        if (!found) {
            System.out.println("No residential properties found.");
        }
    }

    public static void displayBusinessProperties(ArrayList<Propable> properties) {
        System.out.println("=================================");
        System.out.println("    Business Properties");
        System.out.println("=================================");

        boolean found = false;
        for (Propable property : properties) {
            if (property instanceof BusProperty) {
                found = true;
                System.out.println(property.toString());
                System.out.println("Rent Amount: R" + property.calcMonthRent());
                System.out.println();
            }
        }

        if (!found) {
            System.out.println("No business properties found.");
        }
    }
}