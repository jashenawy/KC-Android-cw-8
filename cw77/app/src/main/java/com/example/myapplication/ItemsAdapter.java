package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.Items;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    List<Items> itemsList;

    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list,parent,false);

        Items currentItem = itemsList.get(position);

        ImageView itemImage = view.findViewById(R.id.itemImage);
        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemPrice = view.findViewById(R.id.itemPrice);

        itemImage.setImageResource(currentItem.getItemImage());
        itemName.setText(currentItem.getItemNme());
        itemPrice.setText(currentItem.getItemPrice()+"");


        ImageView deletButton = view.findViewById(R.id.delet);
        deletButton.setOnClickListener(new View.OnClickListener() {
          Items remove = itemsList.get(position);
            @Override
            public void onClick(View view) {
                AlertDialog.Builder Builder = new AlertDialog.Builder(getContext()).setMessage("Are you sure you want to remove this?")
                        .setTitle("Confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                itemsList.remove(remove);
                                notifyDataSetChanged();
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                  Builder.show();
            }
        });




      return view;


    }
}
