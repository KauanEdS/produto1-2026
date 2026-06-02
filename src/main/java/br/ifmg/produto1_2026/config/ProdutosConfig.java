package br.ifmg.produto1_2026.config;

import br.ifmg.produto1_2026.anotacoes.TipoDoNotificador;
import br.ifmg.produto1_2026.constants.TipoDeNotificacao;
import br.ifmg.produto1_2026.service.AtivacaoClienteService;
import br.ifmg.produto1_2026.util.NotificacaoEmail;
import br.ifmg.produto1_2026.util.NotificacaoSMS;
import br.ifmg.produto1_2026.util.Notificador;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProdutosConfig {

    @Value("${notificador.email.host}")
    private String servidorSMTP;

    //Nesse caso a criação do bean é necessario, pois o Spring Boot não saberia criar esse objeto.
    //Qual seria o servidor smtp??
    @Profile("prod")
    @TipoDoNotificador(value = TipoDeNotificacao.EMAIL)
    @Bean
    public Notificador notificacaoEmail(){

        NotificacaoEmail notificacaoEmail = new NotificacaoEmail(servidorSMTP);
        notificacaoEmail.setCaixaAlta(true);
        return notificacaoEmail;

    }
    /*

    //Nesse caso a criação do bean não seria necessario, pois o Spring Boot saberia criar esse objeto.
    @Bean
    public AtivacaoClienteService ativacaoClienteService (Notificador notificador){
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        return ativacaoClienteService;
    }
    */


    //@Primary -- desambigua beans, indicando qual objeto o spring boot deve usar.
    @Profile({"dev", "test"})
    @TipoDoNotificador(value = TipoDeNotificacao.SMS)
    @Bean
    public Notificador notificacaoSMS(){

        NotificacaoSMS notificacaoSMS = new NotificacaoSMS();
        notificacaoSMS.setCaixaAlta(true);
        return notificacaoSMS;

    }
}
