package com.thuytrinh.recyclerviewplayground;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NumbersFragment extends Fragment {
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_numbers, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    RecyclerView numbersView = (RecyclerView) view.findViewById(R.id.numbersView);
    numbersView.setLayoutManager(new NumberLayoutManager(getActivity()));
    numbersView.setAdapter(new NumbersAdapter());
  }
}
