package com.jaeger.fcebook;

import android.graphics.drawable.Drawable;
import android.widget.Button;

public class Publicacion {
    private String color;
    private String codigo;
    private String titulo;
    private String descripcion;
    private String hora;
    private Drawable imagenPublicacion;
    private Drawable imagenPerfil;
    private Button reaccion;

    //TituloDelqpublico, imagen, hora, fotoperfil, texto,boton*/
    public Publicacion() {
    }



    public Publicacion(String titulo, String descripcion, String hora, Drawable imagenPublicacion, Drawable imagenPerfil) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.hora = hora;
        this.imagenPublicacion = imagenPublicacion;
        this.imagenPerfil = imagenPerfil;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Drawable getImagenPublicacion() {
        return imagenPublicacion;
    }

    public void setImagenPublicacion(Drawable imagenPublicacion) {
        this.imagenPublicacion = imagenPublicacion;
    }

    public Drawable getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(Drawable imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public Button getReaccion() {
        return reaccion;
    }

    public void setReaccion(Button reaccion) {
        this.reaccion = reaccion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
