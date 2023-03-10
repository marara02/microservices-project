package kz.practice.task.inventoryService;

import kz.practice.task.inventoryService.model.Inventory;
import kz.practice.task.inventoryService.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("Iphone 13");
            inventory.setQuantity(150);

            Inventory inventory2 = new Inventory();
            inventory.setSkuCode("Iphone 14");
            inventory.setQuantity(1100);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory2);
        };
    }

}
