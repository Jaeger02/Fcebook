package com.jaeger.fcebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PublicacionAdapter extends RecyclerView.Adapter<PublicacionAdapter.ViewHolder> {

    private List<Publicacion> publicaciones;
    private Context context;

    public PublicacionAdapter(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_publicacion, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Publicacion publicacion = publicaciones.get(position);
        holder.imgPerfil.setImageDrawable(publicacion.getImagenPerfil());
        holder.lblTitulo.setText(publicacion.getTitulo());
        holder.lblHora.setText(publicacion.getHora());
        holder.lblDescripcion.setText(publicacion.getDescripcion());
        holder.imgPublicacion.setImageDrawable(publicacion.getImagenPublicacion());


    }

    @Override
    public int getItemCount() {
        return publicaciones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private ImageView imgPerfil;
        private TextView lblTitulo;
        private TextView lblHora;
        private TextView lblDescripcion;
        private ImageView imgPublicacion;
        private Button btnReaccion;
        private TextView lblColor;
        private TextView lblCodigo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPerfil = itemView.findViewById(R.id.imgPerfil);
            lblTitulo = itemView.findViewById(R.id.lblTitulo);
            lblHora = itemView.findViewById(R.id.lblHora);
            lblDescripcion = itemView.findViewById(R.id.lblDescripcion);
            imgPublicacion = itemView.findViewById(R.id.imgPublicacion);

            this.view=itemView;
        }
    }
}
