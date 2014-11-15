package com.thuytrinh.recyclerviewplayground;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class NumberLayoutManager extends LinearLayoutManager {
  private static final String TAG = "NumberLayoutManager";

  public NumberLayoutManager(Context context) {
    super(context);
  }

  @Override
  public PointF computeScrollVectorForPosition(int targetPosition) {
    Log.d(TAG, "computeScrollVectorForPosition: " + targetPosition);
    return super.computeScrollVectorForPosition(targetPosition);
  }

  @Override
  public int computeVerticalScrollOffset(RecyclerView.State state) {
    Log.d(TAG, "computeVerticalScrollOffset: " + state);
    return super.computeVerticalScrollOffset(state);
  }

  @Override
  public int scrollVerticallyBy(int dy, RecyclerView.Recycler recycler, RecyclerView.State state) {
    int i = super.scrollVerticallyBy(dy, recycler, state);
    Log.d(TAG, "scrollVerticallyBy: " + i);
    return i;
  }

  @Override
  public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
    Log.d(TAG, "smoothScrollToPosition: " + position);
    super.smoothScrollToPosition(recyclerView, state, position);
  }
}
