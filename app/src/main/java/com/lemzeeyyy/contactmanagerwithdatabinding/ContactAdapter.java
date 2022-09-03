package com.lemzeeyyy.contactmanagerwithdatabinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.lemzeeyyy.contactmanagerwithdatabinding.databinding.ContactListItemBinding;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {
    private ArrayList<Contact> contacts;

    public ContactAdapter(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).
//                inflate(R.layout.contact_list_item,parent,false);
//        return new MyViewHolder(view);
        ContactListItemBinding contactListItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.contact_list_item,
                parent,
                false
        );
        return new MyViewHolder(contactListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.MyViewHolder holder, int position) {
        Contact contact = contacts.get(position);
//        holder.name.setText(contact.getContactName());
//        holder.email.setText(contact.getContactEmail());
        holder.contactListItemBinding.setContact(contact);
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
//        private TextView name ;
//        private TextView email;
        private ContactListItemBinding contactListItemBinding;
        public MyViewHolder(@NonNull ContactListItemBinding contactListItemBinding) {
            super(contactListItemBinding.getRoot());
            this.contactListItemBinding = contactListItemBinding;
//            name = itemView.findViewById(R.id.nameTV);
//            email = itemView.findViewById(R.id.emailTV);
        }
    }
    public void setContacts(ArrayList<Contact> contacts){
        this.contacts = contacts;
        notifyDataSetChanged();

    }
}
