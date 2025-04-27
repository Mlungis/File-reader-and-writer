import java.util.*;
import java.io.*;

// Property class
//51422107 Ncube NM
//53546407 Moraba L
class Property {
    private char type;
    private String name;
    private int contact;
    private int contrDuration;

    public Property() {
        type = ' ';
        name = "";
        contact = 0;
        contrDuration = 0;
    }

    public Property(char type, String name, int contact, int contrDuration) {
        setType(type);
        setName(name);
        setContact(contact);
        setDuration(contrDuration);
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public void setDuration(int contrDuration) {
        this.contrDuration = contrDuration;
    }

    public char getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public int getContact() {
        return this.contact;
    }

    public int getContrDuration() {
        return this.contrDuration;
    }

    @Override
    public String toString() {
        return getName() + "\t" + getContact() + "\t" + getContrDuration() + "\t" + getType();
    }
}








