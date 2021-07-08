package com.example.name_recycler;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.name_recycler.interfaces.AnimalInterface;

public class AnimalHolderClass extends RecyclerView.ViewHolder {
    private TextView mtvtype;
    private TextView mtvSound;
    private ImageView mivimage;
    private Button mbtnclick;


    public AnimalHolderClass(@NonNull View itemView) {
        super(itemView);

        iniviews(itemView);

    }

    private void iniviews(View itemView) {
        mivimage = itemView.findViewById(R.id.ivimage);
        mtvtype = itemView.findViewById(R.id.tvtype);
        mtvSound = itemView.findViewById(R.id.tvSound);


    }

    public void setData(Animal animal, AnimalInterface animalInterface) {
        mivimage.setBackgroundResource(animal.getImage());
        mtvSound.setText(animal.getSound());
        mtvtype.setText(animal.getType());
        mivimage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)  {
                animalInterface.onClickAnimal(animal.getName());
            }
        });
    }
}
