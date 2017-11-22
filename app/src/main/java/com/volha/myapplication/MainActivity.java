package com.volha.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  private static final String ADDRESS_SHARED_PREFERENCES = "address_shared_preferences";
  public static final String INTENT_KEY = "sharedpref";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final EditText emailInput = findViewById(R.id.email_input);
    Button one = findViewById(R.id.button_one);
    Button two = findViewById(R.id.button_two);

    SharedPreferences sharedPreferences = getSharedPreferences(ADDRESS_SHARED_PREFERENCES, MODE_PRIVATE);
    final SharedPreferences.Editor editor = sharedPreferences.edit();

    one.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String emailAddress = emailInput.getText().toString();
        editor.putString(emailAddress, emailAddress);
        editor.apply();

        emailInput.setText("");
      }
    });

    two.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
        intent.putExtra(INTENT_KEY, ADDRESS_SHARED_PREFERENCES);
        startActivity(intent);
      }
    });
  }
}
