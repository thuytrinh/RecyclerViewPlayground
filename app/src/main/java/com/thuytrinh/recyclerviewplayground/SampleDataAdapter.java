package com.thuytrinh.recyclerviewplayground;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SampleDataAdapter extends RecyclerView.Adapter<SampleViewHolder> {
  private final String[] data;

  public SampleDataAdapter() {
    data = new String[40];
    for (int i = 0; i < data.length; i++) {
      data[i] = "Sample item " + i;
    }
  }

  @Override
  public SampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
    return new SampleViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(SampleViewHolder holder, int position) {
    holder.textView.setText(data[position]);
  }

  @Override
  public int getItemCount() {
    return data.length;
  }
}
