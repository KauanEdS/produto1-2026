package br.ifmg.produto1_2026.dto;

import br.ifmg.produto1_2026.entities.Perfil;

public class PerfilDTO {

    private Long id;
    private String autoridade;

    public PerfilDTO() {
    }

    public PerfilDTO(Long id, String autoridade) {
        this.id = id;
        this.autoridade = autoridade;
    }

    public PerfilDTO(Perfil perfil ) {
        this.id = perfil.getId();
        this.autoridade = perfil.getNome();
    }

    public PerfilDTO(PerfilDTO perfilDTO) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutoridade() {
        return autoridade;
    }

    public void setAutoridade(String autoridade) {
        this.autoridade = autoridade;
    }

    @Override
    public String toString() {
        return "PerfilDTO{" +
                "id=" + id +
                ", autoridade='" + autoridade + '\'' +
                '}';
    }
}
