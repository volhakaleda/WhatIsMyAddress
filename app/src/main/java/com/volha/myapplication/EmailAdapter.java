package com.volha.myapplication;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;


public class EmailAdapter extends RecyclerView.Adapter<ItemViewHolder> {

  private List<String> emails;

  public EmailAdapter(List<String> emails) {
    this.emails = emails;
  }

  @Override
  public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
    View view = inflater.inflate(R.layout.item_view, parent, false);
    ItemViewHolder viewHolder = new ItemViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(ItemViewHolder holder, int position) {
    String currentEmail = emails.get(position);
    holder.emailTV.setText(currentEmail);
  }

  @Override
  public int getItemCount() {
    return emails.size();
  }
}
