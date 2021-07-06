package com.noanansi.kotlinplayground.controller

import com.noanansi.kotlinplayground.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {

    @GetMapping
    fun getMessages(): List<MessageDto> = listOf(
        MessageDto("1", "Olá mundo!"),
        MessageDto("2", "Hello world!"),
        MessageDto("3", "Hola Mundo!"),
    )

    @PostMapping
    fun post(@RequestBody message: MessageDto) {
        service.post(message)
    }

}
