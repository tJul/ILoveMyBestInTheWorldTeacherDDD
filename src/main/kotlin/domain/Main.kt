package domain

import Factory.OrderFactory
import Factory.UserFactory
import repository.OrderRepository
import repository.UserRepository

fun main() {
    val orderRepository = OrderRepository()
    val orderFactory = OrderFactory()
    val userFactory = UserFactory()
    val userRepository = UserRepository()

    val address: Address = Address("Moscow", "street", "16")
    val user = userFactory.createUser("0001", "Tony Stark", "mir", TypeOfPayment.Card)
    val order = orderFactory.createOrder("0001", Status.Delivered, listOf("glasses", "spaceship"), address)

    userRepository.save(user)
    orderRepository.save(order)

    println(userRepository.getUserById("0001"))
    println(orderRepository.getOrderByStatus("0001"))
}