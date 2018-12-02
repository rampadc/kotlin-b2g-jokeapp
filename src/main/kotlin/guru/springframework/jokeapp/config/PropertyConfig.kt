package guru.springframework.jokeapp.config

import guru.springframework.jokeapp.models.FakeDataSource
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer

@Configuration
@PropertySource("classpath:datasource.properties")
class PropertyConfig {

    @Value("\${guru.user}")
    lateinit var user: String

    @Value("\${guru.password}")
    lateinit var password: String

    @Value("\${guru.dburl}")
    lateinit var url: String

    @Bean
    fun fakeDataSource(): FakeDataSource {
        return FakeDataSource(
                user = user,
                password = password,
                url = url
        )
    }
}