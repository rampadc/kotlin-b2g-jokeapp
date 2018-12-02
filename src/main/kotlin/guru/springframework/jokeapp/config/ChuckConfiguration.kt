package guru.springframework.jokeapp.config

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

//@Configuration
class ChuckConfiguration {

//    @Bean
    fun chuckNorrisQuotes(): ChuckNorrisQuotes {
        return ChuckNorrisQuotes()
    }
}