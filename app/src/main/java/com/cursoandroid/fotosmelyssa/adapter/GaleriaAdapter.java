package com.cursoandroid.fotosmelyssa.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.fotosmelyssa.R;
import com.cursoandroid.fotosmelyssa.modelo.GaleriaPostagem;

import java.util.List;

public class GaleriaAdapter extends RecyclerView.Adapter<GaleriaAdapter.MyViewHolder> {

    private List<GaleriaPostagem> listaPostagem;

    public GaleriaAdapter(List<GaleriaPostagem> listaPostagem) {
        this.listaPostagem = listaPostagem;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.galeria_fotos, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public int getItemCount() {
        return listaPostagem.size();
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        GaleriaPostagem postagem = listaPostagem.get(position);

        holder.textViewTitulo.setText(postagem.getTexto());
        holder.imageViewFotos.setImageResource(postagem.getImagem());
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitulo;
        private ImageView imageViewFotos;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
            imageViewFotos = itemView.findViewById(R.id.imageViewFotos);
        }
    }


}
