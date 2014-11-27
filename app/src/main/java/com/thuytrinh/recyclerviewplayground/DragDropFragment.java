package com.thuytrinh.recyclerviewplayground;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DragDropFragment extends Fragment {
  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_drag_drop, container, false);
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    recyclerView.setAdapter(new SampleDataAdapter());
  }
}
