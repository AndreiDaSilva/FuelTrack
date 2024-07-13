package dev.andrei.fueltrack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Desabilita CSRF. Habilite em produção com token adequado.
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/newCliente").permitAll() // Permite acesso público a /newCliente
                .anyRequest().authenticated() // Requer autenticação para qualquer outra URL
            )
            .httpBasic(Customizer.withDefaults()); // Configura autenticação básica

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // Configura um usuário em memória com nome de usuário "user" e senha "user"
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user")
            .password("{noop}user")
            .roles("USER")
            .build());
        return manager;
    }
}





