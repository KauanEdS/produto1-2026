package br.ifmg.produto1_2026.util;

import br.ifmg.produto1_2026.entities.Usuario;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class NotificacaoSMS implements Notificador {

    private boolean caixaAlta;

    public NotificacaoSMS(){
        System.out.println("NotificacaoSMS criada com sucesso!");
    }

    public void notificar (Usuario usuario, String mensagem){

        if(caixaAlta){
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Notificando %s através do telefone %s: %s\n", usuario.getNome(), usuario.getEmail(),mensagem );
    }

    public boolean isCaixaAlta() {
        return caixaAlta;
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

}
