package guru.springframework.jokeapp

import guru.springframework.jokeapp.models.FakeDataSource
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportResource

@SpringBootApplication
//@ImportResource("classpath:chuck-config.xml")
class JokeAppApplication

fun main(args: Array<String>) {
    val ctx = runApplication<JokeAppApplication>(*args)
    val fakeDataSource = ctx.getBean(FakeDataSource::class.java) as FakeDataSource

    println(fakeDataSource.user)
}
