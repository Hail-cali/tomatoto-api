package co.tomatoto

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatApiApplication

fun main(args: Array<String>) {
    runApplication<ChatApiApplication>(*args)
}
