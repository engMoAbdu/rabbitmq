package com.mh.rabbitmq.common.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * @author moabdu
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(this.getInfo())
                //bearer auth with oAuth2
                .addSecurityItem(
                        new SecurityRequirement().addList("bearerAuth")
                ).components(
                        new Components().addSecuritySchemes("oAuth2",
                                // Bearer AUTH security config settings. ## for id-token.
                                new SecurityScheme().type(SecurityScheme.Type.OAUTH2).flows(getOauthFlows())).addSecuritySchemes("bearerAuth",
                                new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")));
    }

    private Contact myContactInfo() {
        Contact contact = new Contact();
        contact.setName("Mohammed Abdu");
        contact.setEmail("eng.mo.abdu@gmail.com");
        contact.setUrl("https://www.linkedin.com/in/engmoelsaeed");
        return contact;
    }

    private Info getInfo() {
        return new Info()
                .title("back-end Challenge APP")
                .contact(myContactInfo())
                .version("0.1")
                .description("back-end Challenge APP")
                .termsOfService("http://swagger.io/terms/")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"));
    }

    private OAuthFlows getOauthFlows() {
        OAuthFlow oAuthFlowObject = new OAuthFlow();
        oAuthFlowObject.setAuthorizationUrl("https://auth.us-east-2.ghosts.com/oauth2/authorize");
        oAuthFlowObject.setRefreshUrl("https://auth.us-east-2.ghosts.com/oauth2/refresh");
        oAuthFlowObject.setTokenUrl("https://auth.us-east-2.ghosts.com/oauth2/token");
        OAuthFlows oAuthFlows = new OAuthFlows();
        oAuthFlows.authorizationCode(oAuthFlowObject);
        return oAuthFlows;
    }
}
