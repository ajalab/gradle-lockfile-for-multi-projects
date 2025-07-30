package example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

fun main(args: Array<String>) {
    runApplication<App1>(*args)
}

@SpringBootApplication
class App1

