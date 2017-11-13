package com.ict.genesis.surathackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Genesis on 23/09/2017.
 */

public class Attraction extends AppCompatActivity {


    private ImageView mallimg;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
        mallimg=(ImageView)findViewById(R.id.mallimg);



        mallimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Attraction.this, mall.class);
                //downloadIntent.setData(Uri.parse(fileUrl));
                //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //startActivity(intent);
            }
        });

    }
}
