package org.training.monolith.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private int id;

    private User user;
    private List<Inventory> items;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
