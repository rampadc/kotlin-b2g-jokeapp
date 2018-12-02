package guru.springframework.jokeapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokeServiceImplementation: JokeService {
    val chuckNorrisQuotes = ChuckNorrisQuotes()

    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}