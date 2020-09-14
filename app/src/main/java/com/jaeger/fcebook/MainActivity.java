package com.jaeger.fcebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.jaeger.fcebook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Publicacion> publicaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        publicaciones = new ArrayList<>();
        Drawable original = getResources().getDrawable(R.drawable.fotoperfil);
        Bitmap originalBit = ((BitmapDrawable) original).getBitmap();
        RoundedBitmapDrawable roundedDrawable = RoundedBitmapDrawableFactory.create(getResources(), originalBit);
        roundedDrawable.setCircular(true);

        Drawable original1 = getResources().getDrawable(R.drawable.perfiltecnm);
        Bitmap originalBit1 = ((BitmapDrawable) original1).getBitmap();
        RoundedBitmapDrawable roundedDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), originalBit1);
        roundedDrawable1.setCircular(true);

        Drawable original2 = getResources().getDrawable(R.drawable.perfilprogra);
        Bitmap originalBit2 = ((BitmapDrawable) original2).getBitmap();
        RoundedBitmapDrawable roundedDrawable2 = RoundedBitmapDrawableFactory.create(getResources(), originalBit2);
        roundedDrawable2.setCircular(true);


        publicaciones.add(new Publicacion("Alan Duarte","Mi mamá: como vas en las clases en línea? \n \n yo:",
                "12 min",getDrawable(R.drawable.fotodescrip1), roundedDrawable));

        publicaciones.add(new Publicacion("TECNM Campus Purísima","¿Eres alumno de quinto semestre? Asiste a la plática virtual de Inducción de Servicio Social. \nJueves 10 de septiembre \n03:00 pm.",
                "6 d",getDrawable(R.drawable.descriptecnm), roundedDrawable1));

        publicaciones.add(new Publicacion("El Arte de la Programación","Felíz día a todos",
                "1 d",getDrawable(R.drawable.descriprogra), roundedDrawable2));


        binding.rclvPublicaciones.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.rclvPublicaciones.setLayoutManager(layoutManager);
        PublicacionAdapter adapter = new PublicacionAdapter(publicaciones);
        binding.rclvPublicaciones.setAdapter(adapter);
    }

    boolean valor=true;
            public void like(View v) {

                ImageView imagen=(ImageView) findViewById(R.id.btnReaccion1);
                if (valor==true){
                    imagen.setImageResource(R.drawable.like);
                    valor = false;

                }else {
                    imagen.setImageResource(R.drawable.dislike);
                    valor=true;
                }

            }

}