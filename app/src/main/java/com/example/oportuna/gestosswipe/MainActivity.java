package com.example.oportuna.gestosswipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ScaleGestureDetector detector;
    private float xBegin=0;
    private float yBegin=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.loli);
        xBegin =imageView.getScaleX();
        yBegin =imageView.getScaleY();

        detector = new ScaleGestureDetector(this,new ScaleListener(imageView));
    }

    public void Ejecutar(View view) {
        imageView.setScaleX(xBegin);
        imageView.setScaleY(yBegin);
        detector = new ScaleGestureDetector(this,new ScaleListener(imageView));

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
