package Factory

import domain.TypeOfPayment
import domain.User

class UserFactory {
    fun createUser(id: String, name: String, typeOfCard: String, typeOfPayment: Enum<TypeOfPayment>): User {
        return User(id, name, typeOfCard, typeOfPayment)
    }
}