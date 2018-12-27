package com.example.oportuna.gestosswipe;

import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    private ImageView imageView;
    private float scale = 1f;

    public ScaleListener(ImageView imageView) {
        this.imageView = imageView;
    }


    public boolean onScale(ScaleGestureDetector detector) {
            scale*=detector.getScaleFactor();
            imageView.setScaleX(scale);
            imageView.setScaleY(scale);
            return true;
    }
}
