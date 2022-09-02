package com.lemzeeyyy.contactmanagerwithdatabinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "contact_table")
public class Contact extends BaseObservable {
    @ColumnInfo(name = "contact_name")
    private String contactName;
    @ColumnInfo(name = "contact_email")
    private String contactEmail;

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
}
