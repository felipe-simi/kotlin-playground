package com.noanansi.kotlinplayground.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {

    @GetMapping
    fun getMessages(): List<MessageResponse> = listOf(
        MessageResponse("1", "Olá mundo!"),
        MessageResponse("2", "Hello world!"),
        MessageResponse("3", "Hola Mundo!"),
    )

}
