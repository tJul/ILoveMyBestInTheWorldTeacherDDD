package repository

import domain.Order

class OrderRepository {
    private val orders = mutableListOf<Order>()

    fun save(order: Order){
        orders.add(order)
    }
    fun getOrderByStatus(orderId: String): Order {
        return orders[orderId.toInt() - 1]
    }
}