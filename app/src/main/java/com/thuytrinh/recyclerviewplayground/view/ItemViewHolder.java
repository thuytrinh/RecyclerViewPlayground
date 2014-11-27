package com.thuytrinh.recyclerviewplayground.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.thuytrinh.recyclerviewplayground.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {
  public final TextView textView;

  public ItemViewHolder(View itemView) {
    super(itemView);
    textView = (TextView) itemView.findViewById(R.id.textView);
  }
}
