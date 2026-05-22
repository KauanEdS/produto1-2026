package br.ifmg.produto1_2026.dto;

import br.ifmg.produto1_2026.entities.Produto;
import br.ifmg.produto1_2026.projections.ProdutoProjection;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.hateoas.RepresentationModel;

import java.util.ArrayList;
import java.util.List;

public class ProdutoListDTO extends RepresentationModel<ProdutoListDTO> {

    @Schema(description = "identificador unico no sistema")
    private Long id;
    @Schema(description = "nome do produto")
    @Size(min = 2, max = 100, message = "O nome do produto deve ter entre 2 e 100 caracteres")
    private String nome;
    @Schema(description = "valor em reais do produto")
    @Positive(message = "O preço do produto deve ser um valor positivo")
    private Double preco;
    @Schema(description = "endereço eletronico da imagem")
    private String imgUrl;

    @Schema(description = "Lista das categorias que o produto pertence")
    private List<CategoriaDTO> categorias = new ArrayList<CategoriaDTO>();

    public ProdutoListDTO() {
    }

    public ProdutoListDTO(Long id, String nome, Double preco, String imgUrl) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.imgUrl = imgUrl;
    }

    public ProdutoListDTO(Produto produto ) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.imgUrl = produto.getImgUrl();

    }

    public ProdutoListDTO(ProdutoProjection projection ) {
        this.id = projection.getID();
        this.nome = projection.getNome();
        this.preco = projection.getPreco();
        this.imgUrl = projection.getImgUrl();

    }

    public ProdutoListDTO(ProdutoListDTO produtoDTO) {
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<CategoriaDTO> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<CategoriaDTO> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "ProdutoDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
