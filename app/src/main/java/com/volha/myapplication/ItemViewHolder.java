package com.volha.myapplication;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class ItemViewHolder extends RecyclerView.ViewHolder {

  static final String ITEM_VIEW_KEY = "emailKey";

  TextView emailTV;

  public ItemViewHolder(final View itemView) {
    super(itemView);

    emailTV = itemView.findViewById(R.id.email_tv);

    emailTV.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(itemView.getContext(), DisplayActivity.class);
        String displayedEmail = emailTV.getText().toString();
        intent.putExtra(ITEM_VIEW_KEY, displayedEmail);
        itemView.getContext().startActivity(intent);
      }
    });

  }

}
