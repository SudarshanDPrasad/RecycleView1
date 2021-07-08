package com.example.name_recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.name_recycler.interfaces.AnimalInterface;

import java.util.ArrayList;

public class AnimalAdaptorClass extends RecyclerView.Adapter<AnimalHolderClass> {

    private ArrayList<Animal> animals;
    private AnimalInterface animalInterface;

    public AnimalAdaptorClass(ArrayList<Animal> animals, AnimalInterface animalInterface) {
       this.animals = animals;
       this.animalInterface = animalInterface;
    }

    @NonNull
    @Override
    public AnimalHolderClass onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.name_layout,parent,false);
        return new AnimalHolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  AnimalHolderClass holder, int position) {
        Animal animal = animals.get(position);
        holder.setData(animal,animalInterface);

    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
