package pl.edu.wszib.springwithtests.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springwithtests.dto.ProductDTO;
import pl.edu.wszib.springwithtests.dto.ShoppingBasketDTO;
import pl.edu.wszib.springwithtests.dto.ShoppingBasketItemDTO;
import pl.edu.wszib.springwithtests.dto.ShoppingBasketItemDTO;
import pl.edu.wszib.springwithtests.service.ShoppingBasketItemService;
import pl.edu.wszib.springwithtests.service.ShoppingBasketService;

import java.util.List;

@RestController
@RequestMapping("/shoppingBasketItem")
public class ShoppingBasketItemController {

    @Autowired
    private ShoppingBasketItemService service;

    @GetMapping
    public List<ShoppingBasketItemDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ShoppingBasketItemDTO findOne(@PathVariable int id) {
        return service.find(id);
    }

    @PostMapping
    public ShoppingBasketItemDTO add(@RequestBody ShoppingBasketItemDTO dto) {
        return service.add(dto);
    }

    @PutMapping
    public ShoppingBasketItemDTO update(@RequestBody ShoppingBasketItemDTO dto) {
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        service.remove(id);
    }



}
