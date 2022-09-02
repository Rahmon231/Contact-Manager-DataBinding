package com.lemzeeyyy.contactmanagerwithdatabinding;

public class Contact {
    private String contactName;
    private String contactEmail;

    public Contact(String contactName, String contactEmail) {
        this.contactName = contactName;
        this.contactEmail = contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
