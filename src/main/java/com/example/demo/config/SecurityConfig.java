package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer.AuthorizedUrl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
  /*public SecurityConfig() {
    }

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((authRequest) -> {
            ((AuthorizedUrl)authRequest.requestMatchers(new String[]{"/authenticated/**", "/user/**", "/tv/tvs", "/tv/add", "/tv/save", "/textJuridique/textJuridiques", "/textJuridique/add", "/textJuridique/save", "/radio/radios", "/radio/add", "/radio/save", "/presse/presses", "/presse/add", "/presse/save", "/pressecategorie/pressecategories", "/pressecategorie/add", "/pressecategorie/save", "/lois/lois", "/lois/add", "/lois/save", "/etablissement/etablissements", "/etablissement/add", "/etablissement/save", "/etablissement/EditEtablissement/{id}","/etablissement/update/{id}","/home", "/complexe/complexes", "/complexe/add", "/complexe/save", "/categorieChaine/add", "/categorieChaine/save", "/caracterstique/tv/{id}/add", "/caracterstique/radio/{id}/add", "/caracterstique/saveradio", "/caracterstique/save", "/agrument/agruments", "/agrument/add", "/agrument/save","/ministers/add","/ministers/Mins","/ministers/save","/Direction/add","/Direction/all","/Direction/direction","/Direction/save"})).authenticated();
            ((AuthorizedUrl)authRequest.requestMatchers(new String[]{"/notAuthenticated/**", "/multimedia/**", "/", "/index", "/tv", "/tv/public", "/tv/prive", "/tv/prive/{name}", "/tv/{id}", "/tv/lugo/{id}", "/radio/public", "/radio/public/#national", "/radio/public/#local", "/radio/public/", "/radio/{id}", "/radio/lugo/{id}", "/presse/public", "/presse/lugo/{id}", "/presse/public/", "/presse/public/#publicEcrit", "/presse/public/#publicElectronique", "/presse/{id}", "/presse/public/electronique", "/lois/{id}", "/textJuridique/pdf/{id}", "/etablissement/{id}", "/etablissement/lugo/{id}", "/search","/ministers/list","/ministers/pic/{id}"})).permitAll();
        });
        http.formLogin((formLogin) -> {
            ((FormLoginConfigurer)formLogin.loginPage("/login").defaultSuccessUrl("/home", true)).permitAll();
        });
        http.logout((logout) -> {
            logout.invalidateHttpSession(true).deleteCookies(new String[]{"JSESSIONID"}).clearAuthentication(true).logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout");
        });
        http.cors(AbstractHttpConfigurer::disable);
        http.csrf(AbstractHttpConfigurer::disable);
        http.headers(AbstractHttpConfigurer::disable);
        return (SecurityFilterChain)http.build();
    } */
}
