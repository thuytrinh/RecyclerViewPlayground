package com.thuytrinh.recyclerviewplayground;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NumbersAdapter extends RecyclerView.Adapter<NumberViewHolder> {
  private final String[] data;

  public NumbersAdapter() {
    data = new String[50];
    for (int i = 0; i < data.length; i++) {
      data[i] = Integer.toString(i);
    }
  }

  @Override
  public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_number, parent, false);
    return new NumberViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(NumberViewHolder holder, int position) {
    holder.textView.setText(data[position]);
  }

  @Override
  public int getItemCount() {
    return data.length;
  }
}
