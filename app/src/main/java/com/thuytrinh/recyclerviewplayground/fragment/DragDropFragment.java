package com.thuytrinh.recyclerviewplayground.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thuytrinh.recyclerviewplayground.R;
import com.thuytrinh.recyclerviewplayground.adapter.ItemsAdapter;

public class DragDropFragment extends Fragment {
  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_drag_drop, container, false);
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
    recyclerView.setAdapter(new ItemsAdapter());
  }
}
