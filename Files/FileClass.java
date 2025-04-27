//51422107 Ncube NM
//53546407 Moraba L

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// FileClass to handle file reading/writing
class FileClass {
    private Property[] properties = new Property[50];
    private int count = 0;

    public Property[] getPropertyArray() {
        try (BufferedReader br = new BufferedReader(new FileReader("properties.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("#");

                if (parts[0].equals("R")) {
                    String name = parts[1];
                    int contact = Integer.parseInt(parts[2]);
                    int duration = Integer.parseInt(parts[3]);
                    char typeRes = parts[4].charAt(0);
                    int beds = Integer.parseInt(parts[5]);
                    int baths = Integer.parseInt(parts[6]);
                    int garages = Integer.parseInt(parts[7]);

                    properties[count++] = new ResProperty('R', name, contact, duration, typeRes, beds, baths, garages);

                } else if (parts[0].equals("B")) {
                    String name = parts[1];
                    int contact = Integer.parseInt(parts[2]);
                    int duration = Integer.parseInt(parts[3]);
                    int size = Integer.parseInt(parts[4]);
                    int insurance = Integer.parseInt(parts[5]);
                    int rent = Integer.parseInt(parts[6]);

                    properties[count++] = new BusProperty('B', name, contact, duration, size, insurance, rent);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
        return properties;
    }

    public int getCount() {
        return count;
    }

    public void writeTownHToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("townhouses.txt"))) {
            for (int i = 0; i < count; i++) {
                if (properties[i] instanceof ResProperty) {
                    ResProperty res = (ResProperty) properties[i];
                    if (res.getTypeRes() == 'T') {
                        String line = res.getName() + " " + res.getContact() + " " + res.calcMonthRent();
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            System.out.println("Townhouse data written to townhouses.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
