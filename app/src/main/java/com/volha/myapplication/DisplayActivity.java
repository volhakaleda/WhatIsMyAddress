package com.volha.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display);

    String passedData = getIntent().getStringExtra(ItemViewHolder.ITEM_VIEW_KEY);
    String length = String.valueOf(passedData.length());

    TextView tvOne = findViewById(R.id.tv_1);
    TextView tvTwo = findViewById(R.id.tv_2);

    tvOne.setText(passedData);
    tvTwo.setText(length);

  }
}
