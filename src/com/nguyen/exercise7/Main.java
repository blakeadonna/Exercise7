package com.nguyen.exercise7;

/*Johnny Nguyen | 27.02.19 | Address Book that contains a contact and business class with business overriding the former */

class Contacts{
    private String name;
    private String email;

    public Contacts(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact Info -  " +
                "Name: " + name +
                ", Email: " + email;
    }
}

class Business extends Contacts{
    private String phone;

    public Business(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Business Info - " +
                "Name: " + getName() +
                ", Email: " + getEmail() +
                ", Phone: " + phone;
    }
}

public class Main {

    public static void main(String[] args) {
        Contacts normal = new Contacts("Kaede Takagaki", "koikaze@chaldea.net");
        System.out.println(normal.toString());

        Business busi = new Business("Kaede Takagaki", "infinote@chaldea.net","614-345-8578");
        System.out.println(busi.toString());
    }
}