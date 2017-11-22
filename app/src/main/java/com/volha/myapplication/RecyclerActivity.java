package com.volha.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RecyclerActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recycler);

    RecyclerView recyclerView = findViewById(R.id.recycler_view);

    String sharedPrefs = getIntent().getStringExtra(MainActivity.INTENT_KEY);

    SharedPreferences sharedPreferences = getSharedPreferences(sharedPrefs, MODE_PRIVATE);
    Map<String, ?> allSharedValues = sharedPreferences.getAll();

    List<String> emails = new ArrayList<>();

    for(String key : allSharedValues.keySet()) {
      String eachEmail = (String) allSharedValues.get(key);
      emails.add(eachEmail);
    }

    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    EmailAdapter emailAdapter= new EmailAdapter(emails);
    recyclerView.setAdapter(emailAdapter);


  }
}
