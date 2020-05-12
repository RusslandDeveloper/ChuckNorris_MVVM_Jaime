package com.example.chucknorris_mvvm_jaime.models

data class JokeResponseModel (

    var type : String,
    var value: JokeItem
)

data class JokeItem(

    var id : Int,
    var joke : String,
    var categorie: List<String>

)

data class JokeItemList(

    var type : String,
    var vale: List<JokeItem>


)