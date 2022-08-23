package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RemoteViews;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      ArrayList<Items> itemsArrayList = new ArrayList<>();

        Items donut = new Items("Donut",R.drawable.donut,5.0);
        Items coffee = new Items("coffee",R.drawable.coffee,3.0);
        Items chocolate = new Items("Chocolate",R.drawable.chocolate,2.0);
        Items cheese = new Items("Cheese",R.drawable.cheese,4.0);
        Items honey = new Items("Honey",R.drawable.honey,6.0);
        Items frise = new Items("Frise",R.drawable.fried,2.0);


        itemsArrayList.add(donut);
        itemsArrayList.add(coffee);
        itemsArrayList.add(chocolate);
        itemsArrayList.add(cheese);
        itemsArrayList.add(honey);
        itemsArrayList.add(frise);

       ItemsAdapter itemsAdapter = new ItemsAdapter(this,0,itemsArrayList);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);




       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               Items currentItem = itemsArrayList.get(i);
            Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
             intent.putExtra("Items", currentItem);
             startActivity(intent);








           }
       });




    }
}