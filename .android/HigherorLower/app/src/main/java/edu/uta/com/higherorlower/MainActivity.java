package edu.uta.com.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int randNumber;//  = random.nextInt(10)+1;
    public void makeToast(String string)
    {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();





        Button guessBtn = (Button)findViewById(R.id.guessBtn);
        guessBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
                int number = Integer.parseInt(editTextNumber.getText().toString());
                Log.i("Number entered", editTextNumber.getText().toString());

                if(randNumber<number)
                {
                    makeToast("Lower");
                }
                else if(randNumber>number)
                {
                    makeToast("Higher");
                }
                else
                {
                    makeToast("Nailed it!!");

                    Random rand = new Random();
                    randNumber = rand.nextInt(10)+1;

                }


            }
        });


    }
}
