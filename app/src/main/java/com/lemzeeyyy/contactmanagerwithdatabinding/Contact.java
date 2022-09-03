package com.lemzeeyyy.contactmanagerwithdatabinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "contact_table")
public class Contact extends BaseObservable {
    @ColumnInfo(name = "contact_name")
    private String contactName;
    @ColumnInfo(name = "contact_email")
    private String contactEmail;
    @PrimaryKey(autoGenerate = true)
    private int contact_id;

    @Ignore
    public Contact() {
    }

    @Ignore
    public Contact(String contactName, String contactEmail, int contact_id) {
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contact_id = contact_id;
    }

    public Contact(String contactName, String contactEmail) {
        this.contactName = contactName;
        this.contactEmail = contactEmail;
    }

    @Bindable
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
        notifyPropertyChanged(BR.contactName);
    }

    @Bindable
    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        notifyPropertyChanged(BR.contactEmail);
    }

    @Bindable
    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }
}
