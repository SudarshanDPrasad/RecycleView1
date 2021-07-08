package com.example.idenditycard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Identity> identitys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intidviews();
        buildidentitycardlist();
        setRecycleviwer();
    }

    private void setRecycleviwer() {
        IdentityCardAdaptor identityCardAdaptor = new IdentityCardAdaptor(identitys);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(identityCardAdaptor);
    }

    private void buildidentitycardlist() {
        identitys = new ArrayList<>();
        Identity identity1 = new Identity("Microsoft", R.drawable.billgates, "Age : 64", "Profession : Business");
        identitys.add(identity1);
        Identity identity2 = new Identity("Amazon", R.drawable.jeffbezoss, "Age : 56", "Profession : Business");
        identitys.add(identity2);
        Identity identity3 = new Identity("Masai", R.drawable.prateek1, "Age : 31", "Profession : Business");
        identitys.add(identity3);
        Identity identity4 = new Identity("Microsoft", R.drawable.billgates, "Age : 64", "Profession : Business");
        identitys.add(identity4);
        Identity identity5 = new Identity("Amazon", R.drawable.jeffbezoss, "Age : 56", "Profession : Business");
        identitys.add(identity5);
        Identity identity6 = new Identity("Masai", R.drawable.prateek1, "Age : 31", "Profession : Business");
        identitys.add(identity6);
        Identity identity7 = new Identity("Microsoft", R.drawable.billgates, "Age : 64", "Profession : Business");
        identitys.add(identity7);
        Identity identity8 = new Identity("Amazon", R.drawable.jeffbezoss, "Age : 56", "Profession : Business");
        identitys.add(identity8);
        Identity identity9 = new Identity("Masai", R.drawable.prateek1, "Age : 31", "Profession : Business");
        identitys.add(identity9);

    }

    private void intidviews() {
        recyclerView = findViewById(R.id.recyclerview);
    }
}