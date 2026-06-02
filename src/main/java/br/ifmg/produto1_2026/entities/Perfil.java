package br.ifmg.produto1_2026.entities;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_perfil")
public class Perfil implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant criadoEm;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant atualizadoEm;

    public Perfil() {
    }

    public Perfil(Long id, String autoridade) {
        this.id = id;
        this.nome = autoridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Perfil perfil = (Perfil) o;
        return Objects.equals(id, perfil.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public String getAuthority() {
        return this.nome;
    }
}
