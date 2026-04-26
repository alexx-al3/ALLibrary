package com.allibrary.model;

public class Emprestimo {

    private int id;
    private int livroId;
    private int usuarioId;

    public Emprestimo() {}

    public Emprestimo(int id, int livroId, int usuarioId) {
        this.id = id;
        this.livroId = livroId;
        this.usuarioId = usuarioId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getLivroId() { return livroId; }
    public void setLivroId(int livroId) { this.livroId = livroId; }

    public int getUsuarioId() { return usuarioId; }
    public void setUsuarioId(int usuarioId) { this.usuarioId = usuarioId; }
}