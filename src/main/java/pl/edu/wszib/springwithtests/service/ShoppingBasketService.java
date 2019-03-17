package pl.edu.wszib.springwithtests.service;

import pl.edu.wszib.springwithtests.dto.ProductDTO;
import pl.edu.wszib.springwithtests.dto.ShoppingBasketDTO;

public interface ShoppingBasketService extends AbstractService<ShoppingBasketDTO, Integer>{


    ShoppingBasketDTO addProduct (Integer shoppingBasketId, ProductDTO productDTO);
}
