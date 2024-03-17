package com.hello.configannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {

    @Bean
    public TextEditorbean textEditor(){
        return new TextEditorbean( spellCheckerbean() );
    }

    @Bean
    public SpellCheckerbean spellCheckerbean(){
        return new SpellCheckerbean( );
    }


}
