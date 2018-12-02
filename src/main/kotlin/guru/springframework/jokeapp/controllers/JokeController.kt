package guru.springframework.jokeapp.controllers

import guru.springframework.jokeapp.services.JokeService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class JokeController(
        val jokeService: JokeService
) {

    @RequestMapping(value = ["/"], method = [RequestMethod.GET])
    fun showJoke(model: Model): String {
        model.addAttribute("joke", jokeService.getJoke())
        // return template name
        return "chucknorris"
    }
}