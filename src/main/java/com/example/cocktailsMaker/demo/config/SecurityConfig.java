package com.example.cocktailsMaker.demo.config;

//import com.example.cocktailsMaker.demo.security.AuthProviderImpl;

import com.example.cocktailsMaker.demo.service.PersonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private final AuthProviderImpl authProvider;

//
//    public SecurityConfig(AuthProviderImpl authProvider) {
//        this.authProvider = authProvider;
//    }
//
    //настраивает уатентификацию
//    protected void configure(AuthenticationManagerBuilder auth) {
//        auth.authenticationProvider(authProvider);
//    }

    private final PersonDetailsService personDetailsService;

    @Autowired
    public SecurityConfig(PersonDetailsService personDetailsService) {
        this.personDetailsService = personDetailsService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //настраиваем свою форму аутенитификации
        //конфигурируем авторизацию
        http.csrf().disable()
                .formLogin().loginPage("/login")
                .loginProcessingUrl("/login/user")
                .defaultSuccessUrl("/login/user", true)
                .failureUrl("/login?error")
                .and().logout().deleteCookies("remove").invalidateHttpSession(false)
                .logoutUrl("/logout").logoutSuccessUrl("/index");

    }

    //настраивает уатентификацию
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(personDetailsService);
    }

    @Bean
    public PasswordEncoder getPassEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
