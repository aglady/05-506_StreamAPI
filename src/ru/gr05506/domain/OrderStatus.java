package ru.gr05506.domain;

/** Статус заказа. title() - человекочитаемое имя таблицы и списка (без Swing). */
public enum OrderStatus {
    NEW("Новый"),
    PAID("Оплачен"),
    SHIPPED("Отгружен"),
    CANCELLED("Отменён");

    private final String title;

    OrderStatus(String title) {
        this.title = title;
    }

    public String title(){
        return title;
    }
}
