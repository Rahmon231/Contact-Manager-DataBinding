package com.lemzeeyyy.contactmanagerwithdatabinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class AddNewContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);
    }
    public class AddNewContactClickHandler{
        Context context;

        public AddNewContactClickHandler(Context context) {
            this.context = context;
        }
        public void onAddBtnClick(View view){

        }
    }
}