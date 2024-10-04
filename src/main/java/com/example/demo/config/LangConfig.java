package com.example.demo.config;

import java.util.Locale;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
public class LangConfig implements WebMvcConfigurer  {

    @Bean
    public ReloadableResourceBundleMessageSource  langagekeys()
    {
        ReloadableResourceBundleMessageSource langaekeys=new ReloadableResourceBundleMessageSource();
        langaekeys.setBasename("classpath:language");
       
        langaekeys.setDefaultEncoding("UTF-8");
        langaekeys.setFallbackToSystemLocale(false); // Disable system locale fallback
        langaekeys.setUseCodeAsDefaultMessage(true); // Use key itself if no message is found
        langaekeys.setCacheSeconds(0);
        return langaekeys;
    }
    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver localeResolver = new CookieLocaleResolver();
        localeResolver.setDefaultLocale(Locale.forLanguageTag("ar"));
        return localeResolver;
    }
    @Bean
    public LocaleChangeInterceptor chnglang()
    {
        LocaleChangeInterceptor  chnglang= new LocaleChangeInterceptor();
        chnglang.setParamName("lang");
        return chnglang;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(chnglang());
    }
    
}
