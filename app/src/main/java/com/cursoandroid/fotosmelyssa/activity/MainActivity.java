package com.cursoandroid.fotosmelyssa.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cursoandroid.fotosmelyssa.R;
import com.cursoandroid.fotosmelyssa.adapter.GaleriaAdapter;
import com.cursoandroid.fotosmelyssa.modelo.GaleriaPostagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewGaleria;
    private List<GaleriaPostagem> listaPostagem = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewGaleria = findViewById(R.id.recyclerViewGaleria);

        //definição de layout
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        recyclerViewGaleria.setLayoutManager(layoutManager);

        // definição de adapter
        this.prepararPostagem();
        GaleriaAdapter adapter = new GaleriaAdapter(listaPostagem);
        recyclerViewGaleria.setAdapter(adapter);


    }

    public void prepararPostagem(){

        GaleriaPostagem foto;

        foto = new GaleriaPostagem("", R.drawable.foto1);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto2);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto3);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto4);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto5);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto6);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto7);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto8);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto9);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto10);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto11);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto12);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto13);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto14);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto15);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto16);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto17);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto18);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto19);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto20);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto21);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto22);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto23);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto24);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto25);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto26);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto27);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto28);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto29);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto30);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto31);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto32);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto33);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto34);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto35);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto36);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto37);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto38);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto39);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto40);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto41);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto42);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto43);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto44);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto45);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto46);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto47);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto48);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto49);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto50);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto51);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto52);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto53);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto54);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto55);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto56);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto57);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto58);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto59);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto60);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto61);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto62);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto63);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto64);
        listaPostagem.add(foto);

        /*
        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

        foto = new GaleriaPostagem("", R.drawable.foto);
        listaPostagem.add(foto);

         */


    }


}
