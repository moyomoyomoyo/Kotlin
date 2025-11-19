package com.example.myapplication.components

data class Question(val question: String, val answers: List<Int>, val correctIndex: Int)

class QuestionList() {
    val quiz = listOf(
        Question("Quanto fa 2+2?", listOf(4, 2, 8, 6), 0),
        Question("Quanto fa 2*3?", listOf(4, 7, 6, 3), 2),
        Question("Quanto fa 16:4?", listOf(5, 4, 6, 3), 1)
    )
}
