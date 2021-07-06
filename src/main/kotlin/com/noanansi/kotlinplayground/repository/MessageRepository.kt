package com.noanansi.kotlinplayground.repository

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>
