package com.thuytrinh.recyclerviewplayground;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class MainFragment extends Fragment {
  public static final int THRESHOLD = 5;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_main, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    final View imageButton = view.findViewById(R.id.imageButton);
    final View textView = view.findViewById(R.id.textView);

    final float hideLevel = 150f;
    final float showLevel = 0f;

    final ObjectAnimator show = ObjectAnimator.ofFloat(imageButton, View.TRANSLATION_Y, hideLevel, showLevel);
    show.setInterpolator(new AccelerateInterpolator());

    final ObjectAnimator hide = ObjectAnimator.ofFloat(imageButton, View.TRANSLATION_Y, showLevel, hideLevel);
    hide.setInterpolator(new DecelerateInterpolator());

    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    recyclerView.setAdapter(new SampleDataAdapter());
    recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
      public int scrollY;

      @Override
      public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        scrollY += dy;

        float newTranslationY = textView.getTranslationY() - dy;
        textView.setTranslationY(Math.min(0f, Math.max(newTranslationY, -textView.getHeight())));

        if (Math.abs(dy) > THRESHOLD) {

          boolean isUp = dy < 0;
          if (isUp) {
            if (imageButton.getTranslationY() != showLevel) {
              if (hide.isRunning()) {
                hide.cancel();
              }

              if (!show.isRunning()) {
                show.start();
              }
            }
          } else {
            if (imageButton.getTranslationY() != hideLevel) {
              if (show.isRunning()) {
                show.cancel();
              }

              if (!hide.isRunning()) {
                hide.start();
              }
            }
          }
        }
      }
    });
  }
}
