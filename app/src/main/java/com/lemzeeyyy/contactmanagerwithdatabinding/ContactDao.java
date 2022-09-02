package com.lemzeeyyy.contactmanagerwithdatabinding;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactDao {

    @Insert
    void insertContact(Contact contact);

    @Query("SELECT * FROM contact_table")
    List<Contact> getAllContacts();

    @Delete
    void deleteContact(Contact contact);
}
