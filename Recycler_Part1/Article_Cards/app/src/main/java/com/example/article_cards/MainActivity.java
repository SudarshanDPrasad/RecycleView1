package com.example.article_cards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Article> articleArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intviews();
        buildarticlelist();
        setRecyclerView();
    }

    private void buildarticlelist() {

        articleArrayList = new ArrayList<>();
        Article article1 = new Article(R.drawable.sundargoogleceo, "Sundar Pichai", "Google Ceo");
        articleArrayList.add(article1);
        Article article2 = new Article(R.drawable.prateek, "Prateek Shukla", "Co-Founder of Masai School");
        articleArrayList.add(article2);
        Article article3 = new Article(R.drawable.yogesh, "Yogesh Bhat", "Co-Founder of Masai School");
        articleArrayList.add(article3);
        Article article4 = new Article(R.drawable.nrupul, "Nrupul Dev", "Co-Founder of Masai School");
        articleArrayList.add(article4);
        Article article5 = new Article(R.drawable.lloyd, "Lloyd Dcosta", "Multi-Talented in Android development ");
        articleArrayList.add(article5);

    }

    public void setRecyclerView() {
        ArticleAdaptorClass articleAdaptorClass = new ArticleAdaptorClass(articleArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(articleAdaptorClass);

    }

    private void intviews() {
        recyclerView = findViewById(R.id.recyclerview);

    }

}