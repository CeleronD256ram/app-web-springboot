package br.com.tiagovieira.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;



    public Todo() {

    }
  
    public Todo(Long id, @NotBlank String nome, @NotBlank String descricao, boolean realizado, int prioridade) {
      this.id = id;
      this.nome = nome;
      this.descricao = descricao;
      this.realizado = realizado;
      this.prioridade = prioridade;
    }
  
    public Todo(String nome, String descricao, boolean realizado, int prioridade) {
      this.nome = nome;
      this.descricao = descricao;
      this.realizado = realizado;
      this.prioridade = prioridade;
    }
    



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizado() {
        return this.realizado;
    }

    public boolean getRealizado() {
        return this.realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }





    
    
}
