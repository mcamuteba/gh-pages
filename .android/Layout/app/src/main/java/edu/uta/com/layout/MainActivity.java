package edu.uta.com.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
/*
    public void fade(View view)
    {
        ImageView imageViewAndroid = (ImageView)findViewById(R.id.imageViewBtn);
        ImageView tip = (ImageView)findViewById(R.id.tip_jpg);
        imageViewAndroid.animate().alpha(0f).setDuration(2500);

        tip.animate().alpha(1f).setDuration(3000);
    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView fade = (ImageView) findViewById(R.id.imageViewBtn);
        final ImageView tip = (ImageView)findViewById(R.id.tip_jpg);

       fade.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //


               fade.animate().translationXBy(1000f).setDuration(2000);

               tip.animate().alpha(1f).setDuration(2500);
               fade.animate().alpha(0f).setDuration(2000);
           }
       });


    }
}
