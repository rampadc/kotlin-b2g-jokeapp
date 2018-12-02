package guru.springframework.jokeapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JokeAppApplication

fun main(args: Array<String>) {
    runApplication<JokeAppApplication>(*args)
}
