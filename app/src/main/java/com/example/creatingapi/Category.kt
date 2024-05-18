package com.example.creatingapi

data class TriviaQuestion(
    val type:String,
    val difficulty:String,
    val category:String,
    val question:String,
    val correct_answer:String,
    val incorrect_answers:List<String>
)


data class CategoriesResponse(val results: List<TriviaQuestion>)


//"response_code": 0,
//  "results": [
//    {
//      "type": "multiple",
//      "difficulty": "easy",
//      "category": "Entertainment: Video Games",
//      "question": "When was &quot;Luigi&#039;s Mansion 3&quot; released?",
//      "correct_answer": "October 31st, 2019",
//      "incorrect_answers": [
//        "January 13th, 2019",
//        "September 6th, 2018",
//        "October 1st, 2019"
//      ]
//    },