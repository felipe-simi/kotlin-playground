package com.noanansi.kotlinplayground.repository

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "messages")
data class Message(@Id val id: String = "", val text: String = "")
