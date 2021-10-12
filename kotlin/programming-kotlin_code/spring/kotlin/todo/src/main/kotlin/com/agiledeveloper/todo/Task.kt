package com.agiledeveloper.todo

import javax.persistence.*

@Entity
data class Task(@Id @GeneratedValue val id: Long, val description: String)
