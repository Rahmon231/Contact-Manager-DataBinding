package com.lemzeeyyy.contactmanagerwithdatabinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class MainActivityClickHandlers{
        Context context;

        public MainActivityClickHandlers(Context context) {
            this.context = context;
        }
        public void onFabClicked(View view){
            Intent intent = new Intent(MainActivity.this, AddNewContactActivity.class);
            startActivityForResult(intent,1);
        }
    }
}