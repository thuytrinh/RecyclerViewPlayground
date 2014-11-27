package com.thuytrinh.recyclerviewplayground;

import android.app.Activity;
import android.os.Bundle;

import com.thuytrinh.recyclerviewplayground.fragment.DragDropFragment;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (savedInstanceState == null) {
      getFragmentManager()
          .beginTransaction()
          .add(R.id.container, new DragDropFragment())
          .commit();
    }
  }
}
