package com.mac.recyclerview.Recycler;

public class Chat {
    private Integer id;
    private String nombre;
    private String hora;
    private String chat;
    private String foto;

    public Chat() {
    }

    public Chat(Integer id, String nombre, String hora, String chat, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.hora = hora;
        this.chat = chat;
        this.foto = foto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", hora='" + hora + '\'' +
                ", chat='" + chat + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
