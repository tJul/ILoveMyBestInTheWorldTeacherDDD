package domain

data class User(val id: String, val name: String, val typeOfCard: String, val typeOfPayment: Enum<TypeOfPayment>){
    init {
        require(id.isNotEmpty()) { "Идентификаторы сущностей не могут быть пустыми" }
    }
}