package com.example.name_recycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.name_recycler.interfaces.AnimalInterface;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AnimalInterface {
    private RecyclerView recyclerView;
    private ArrayList<Animal> animals;
    private Button mbtnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intviews();
        buildarticlelist();
        setRecyclerView();


    }

    private void buildarticlelist() {
        animals = new ArrayList<>();
        Animal animal1 = new Animal(R.drawable.germanshepherd, "German Sherpeard", "Bow - Bow", "Dog");
        animals.add(animal1);
        Animal animal2 = new Animal(R.drawable.parrrot, "Parrot", "poo-poo", "Mammal");
        animals.add(animal2);
       for(int i=0;i<18;i++){
           animals.add(animal1);
       }

    }

    private void setRecyclerView() {
        AnimalAdaptorClass animalAdaptorClass = new AnimalAdaptorClass(animals,this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(animalAdaptorClass);
    }

    private void intviews() {
        recyclerView = findViewById(R.id.recyclerview);

    }

    @Override
    public void onClickAnimal(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}