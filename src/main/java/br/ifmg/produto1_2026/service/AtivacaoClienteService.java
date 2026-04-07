package br.ifmg.produto1_2026.service;

import br.ifmg.produto1_2026.entities.Usuario;
import br.ifmg.produto1_2026.util.NotificacaoEmail;
import br.ifmg.produto1_2026.util.Notificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Mesma coisa do @Component
public class AtivacaoClienteService {

    //@Autowired    <------   essa é uma forma de iniciar o bean (forma 1)
    //private Notificador notificador;

    private List<Notificador> notificadores;

    // (forma 2) no construtor adicionar o bean como parametro
    @Autowired  //(forma 3) quando existe overload de construtores
    public AtivacaoClienteService(List<Notificador> notificadores){
        System.out.println("Iniciando AtivacaoClienteService");
        this.notificadores = notificadores;
    }

    public AtivacaoClienteService(){
        System.out.println("Iniciando AtivacaoClienteService com construtor sem paramentro");
    }

    public void ativar(Usuario usuario, String mensagem){
        // usuario.ativo(); simulando ativar o usuario.

//        if(notificador != null)
//            notificador.notificar(usuario, mensagem);
        for(Notificador notificador : notificadores){
            notificador.notificar(usuario, mensagem);
        }
    }

    @PostConstruct
    public void init (){
        System.out.println("Metodo executado depois do construdor");
    }

    @PreDestroy
    public void destroy () {
        System.out.println("Metodo executado antes de destruir o objeto");
    }


//    public Notificador getNotificador() {
//        return notificador;
//    }
//
//    //@Autowired (forma 4) - injeção do objeto no metodo set
//    public void setNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}
