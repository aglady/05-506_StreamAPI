package ru.gr05506.domain;

import java.util.List;

public record Order(
        long id,
        Student customer,
        List<OrderItem> items,
        OrderStatus status
) {
    public Order{
        items = List.copyOf(items);
    }

    public int total(){
        // TODO: Переделать в поток
        int sum = 0;
        for (var item: items){
            sum += item.total();
        }
        return sum;
    }
}
