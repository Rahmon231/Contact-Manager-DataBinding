package com.lemzeeyyy.contactmanagerwithdatabinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {
    private ArrayList<Contact> contacts;

    public ContactAdapter(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.contact_list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.MyViewHolder holder, int position) {
        Contact contact = contacts.get(position);
        holder.name.setText(contact.getContactName());
        holder.email.setText(contact.getContactEmail());
    }

    @Override
    public int getItemCount() {
     if(contacts==null){
         return 0;
     }
     else {
         return contacts.size();
     }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name ;
        private TextView email;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTV);
            email = itemView.findViewById(R.id.emailTV);
        }
    }
    public void setContacts(ArrayList<Contact> contacts){
        this.contacts = contacts;
        notifyDataSetChanged();

    }
}
