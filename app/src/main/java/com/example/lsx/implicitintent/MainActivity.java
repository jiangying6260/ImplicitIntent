package com.example.lsx.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mDialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDialButton=(Button) findViewById(R.id.activity_main_dial_button);
        mDialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:13820881156");
                Intent callIntent =new Intent(Intent.ACTION_DIAL,number);
                startActivity(callIntent);
            }
        });
    }
}
