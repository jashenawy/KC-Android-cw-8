package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        TextView nameItem = findViewById(R.id.name);
        ImageView imageItem = findViewById(R.id.imaa);

        Bundle bundle = getIntent().getExtras();
        Items deleveredItems = (Items) bundle.getSerializable("ItemS");

        nameItem.setText(deleveredItems.getItemNme());
        imageItem.setImageResource(deleveredItems.getItemImage());


    }
}