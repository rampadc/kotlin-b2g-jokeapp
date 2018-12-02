package guru.springframework.jokeapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportResource

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
class JokeAppApplication

fun main(args: Array<String>) {
    runApplication<JokeAppApplication>(*args)
}
