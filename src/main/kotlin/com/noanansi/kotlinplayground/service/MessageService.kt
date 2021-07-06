package com.noanansi.kotlinplayground.service

import com.noanansi.kotlinplayground.controller.MessageDto
import com.noanansi.kotlinplayground.repository.Message
import com.noanansi.kotlinplayground.repository.MessageRepository
import java.util.*
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun post(message: MessageDto) {
        db.save(Message(UUID.randomUUID().toString(), message.text))
    }
}
