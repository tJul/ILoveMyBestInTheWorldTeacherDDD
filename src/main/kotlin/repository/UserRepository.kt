package repository

import domain.User

class UserRepository {
    private val users = mutableListOf<User>()

    fun save(user: User){
        users.add(user)
    }
    fun getUserById(userId: String): User {
        return users[userId.toInt() - 1]
    }
}