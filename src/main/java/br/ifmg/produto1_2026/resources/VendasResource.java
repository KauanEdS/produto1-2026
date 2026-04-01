package br.ifmg.produto1_2026.resources;

import br.ifmg.produto1_2026.dto.UsuarioDTO;
import br.ifmg.produto1_2026.entities.Usuario;
import br.ifmg.produto1_2026.service.AtivacaoClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/venda")
public class VendasResource {


    private AtivacaoClienteService ativacaoCliente;

    public VendasResource(AtivacaoClienteService ativacaoCliente){
        this.ativacaoCliente = ativacaoCliente;
        System.out.println("Camada de resource executada.");
    }

    @PostMapping
    public ResponseEntity<String> insert(){

        Usuario usuario = new Usuario();
        usuario.setNome("Fernando");
        usuario.setTelefone("99999999");
        usuario.setEmail("fernando@gmail.com");
        ativacaoCliente.ativar(usuario,"ativado...");

        //enviando a categoria criada
        return ResponseEntity.ok().body("Venda realizada!");
    }
}
