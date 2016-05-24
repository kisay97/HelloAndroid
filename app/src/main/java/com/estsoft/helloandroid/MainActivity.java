package com.estsoft.helloandroid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_LABEL = "MainActivity";
    private int state = 1;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_LABEL, "온 스타트");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_LABEL,"온 크리에이트");
        TextView tv = ((TextView)findViewById(R.id.textView));
        tv.setTypeface(Typeface.createFromAsset(getAssets(),"HYGUNGSEO.TTF"));

        View button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.message_clicked), Toast.LENGTH_SHORT).show();
                if (state == 1) {
                    ((Button) findViewById(R.id.button1)).setText("show");
                    ((TextView) findViewById(R.id.textView)).setVisibility(View.INVISIBLE);
                    state = 0;
                } else {
                    ((Button) findViewById(R.id.button1)).setText("hide");
                    ((TextView) findViewById(R.id.textView)).setVisibility(View.VISIBLE);
                    state = 1;
                }
            }
        });
    }
}
