package domain

data class Order(val id: String, val status: Enum<Status>, val products: List<String>, val address: Address){
    init {
        if (id.isEmpty()) throw IllegalArgumentException("Поле id не может быть пустым")
        if (products.isEmpty()) throw  IllegalArgumentException ("Список продуктов не может быть пустым")
    }
}