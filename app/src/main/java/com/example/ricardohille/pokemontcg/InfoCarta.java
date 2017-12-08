package com.example.ricardohille.pokemontcg;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.ricardohille.pokemontcg.R;

import java.io.File;

/**
 * Created by User on 08/12/2017.
 */

public class InfoCarta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_cartas);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String url = bundle.getString("imgURL");

        File[] files = new File(".").listFiles();

        for (File file : files){
            file.getAbsoluteFile();
        }

        ImageView imagem = (ImageView) findViewById(R.id.imgCarta);
        Bitmap bitmap = BitmapFactory.decodeFile(url);
        imagem.setVisibility(View.VISIBLE);
        imagem.setImageBitmap(bitmap);

    }
}
