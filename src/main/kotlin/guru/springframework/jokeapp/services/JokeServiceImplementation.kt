package guru.springframework.jokeapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokeServiceImplementation(
        val chuckNorrisQuotes: ChuckNorrisQuotes
): JokeService {
    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}