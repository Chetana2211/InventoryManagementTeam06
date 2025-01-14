package com.example.admin.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class additemActivity extends AppCompatActivity {
    private EditText itemname,itemcategory,itemprice;
    private TextView itembarcode;
    private FirebaseAuth firebaseAuth;
    public static TextView resulttextview;
    Button scanbutton, additemtodatabase;
    DatabaseReference databaseReference;
    DatabaseReference databaseReferencecat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);
        firebaseAuth = FirebaseAuth.getInstance();

        databaseReference = FirebaseDatabase.getInstance().getReference("Users");
        databaseReferencecat = FirebaseDatabase.getInstance().getReference("Users");
        resulttextview = findViewById(R.id.barcodeview);
        additemtodatabase = findViewById(R.id.additembuttontodatabase);
        scanbutton = findViewById(R.id.buttonscan);
        itemname = findViewById(R.id.edititemname);
        itemcategory = findViewById(R.id.editcategory);
        itemprice = findViewById(R.id.editprice);
        itembarcode = findViewById(R.id.barcodeview);


        // String result = finaluser.substring(0, finaluser.indexOf("@"));


        scanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ScanCodeActivity.class));
            }
        });
    }}