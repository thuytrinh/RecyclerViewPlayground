package com.thuytrinh.recyclerviewplayground.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thuytrinh.recyclerviewplayground.R;
import com.thuytrinh.recyclerviewplayground.model.Item;
import com.thuytrinh.recyclerviewplayground.view.ItemViewHolder;

public class ItemsAdapter extends RecyclerView.Adapter<ItemViewHolder> {
  private final Item[] items;

  public ItemsAdapter() {
    items = new Item[40];
    for (int i = 0; i < items.length; i++) {
      items[i] = new Item(i);
    }
  }

  @Override
  public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
    return new ItemViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(ItemViewHolder holder, int position) {
    holder.textView.setText(Integer.toString(items[position].index));
  }

  @Override
  public int getItemCount() {
    return items.length;
  }
}
