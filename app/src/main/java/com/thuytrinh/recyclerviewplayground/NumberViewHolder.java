package com.thuytrinh.recyclerviewplayground;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NumberViewHolder extends RecyclerView.ViewHolder {
  public final TextView textView;

  public NumberViewHolder(View itemView) {
    super(itemView);
    textView = ((TextView) itemView);
  }
}
