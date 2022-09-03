package com.lemzeeyyy.contactmanagerwithdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lemzeeyyy.contactmanagerwithdatabinding.databinding.ActivityAddNewBinding;

public class AddNewContactActivity extends AppCompatActivity {

    private ActivityAddNewBinding addNewBinding;
    Contact contact;
    private AddNewContactClickHandler clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);
        contact = new Contact();
        addNewBinding = DataBindingUtil.setContentView(this,R.layout.activity_add_new);
        addNewBinding.setContact(contact);

        clickHandler = new AddNewContactClickHandler(this);
        addNewBinding.setClickHandler(clickHandler);

    }

    public class AddNewContactClickHandler{
        Context context;

        public AddNewContactClickHandler(Context context) {
            this.context = context;
        }
        public void onAddBtnClick(View view){
            if(contact.getContactName() == null || contact.getContactEmail() == null){
                Toast.makeText(context, "Field(s) cannot be empty", Toast.LENGTH_SHORT).show();
            }else {
                Intent intent = new Intent();
                intent.putExtra("NAME",contact.getContactName());
                intent.putExtra("EMAIL",contact.getContactEmail());
                setResult(RESULT_OK,intent);
                finish();
            }
        }
    }
}