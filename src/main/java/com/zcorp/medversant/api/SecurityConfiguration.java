// package com.zcorp.medversant.auth;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.AuthenticationProvider;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

// import com.zcorp.medversant.auth.service.UserService;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfiguration {

//     // @Autowired
//     // private UserDetailsService userDetailsService;
//     // @Autowired
//     // private UserService userService;

//     // @Bean
//     // public BCryptPasswordEncoder passwordEncoder() {
//     //     return new BCryptPasswordEncoder();
//     // }
 
//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         http
//             .authorizeRequests()
//             .antMatchers("/resources/**", "/registration").permitAll()
//             .anyRequest().authenticated()
//             .and()
//             .formLogin()
//             .loginPage("/login")
//                 .permitAll()
//                 .and()
//             .logout()
//                 .permitAll();

//         http.headers().frameOptions().sameOrigin();
        
//         return http.build();
        
//     }
 
//     // @Bean  
//     // public WebSecurityCustomizer webSecurityCustomizer() {
//     //     return (web) -> web.ignoring().antMatchers("/images/**", "/js/**", "/webjars/**");
//     // }

//     // public DaoAuthenticationProvider authenticationProvider() {
//     //     DaoAuthenticationProvider auth = new DaoAuthenticationProvider(); 
//     //     auth.setUserDetailsService(userService);
//     //     auth.setPasswordEncoder(passwordEncoder());
//     // }

//     // @Bean
//     // public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
//     //     return authenticationConfiguration.getAuthenticationManager();
//     // }

// }
