package com.ecommerce.project.repositories;

import com.ecommerce.project.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
//    @Query("SELECT c FROM CartItem c WHERE c.cartItemId= ?1 AND c.product.productId= ?2")
    @Query("SELECT ci FROM CartItem ci WHERE ci.cart.id = ?1 AND ci.product.id = ?2")
    CartItem findCartItemByProductIdAndCartId(Long cartId, Long productId);

    @Modifying
    @Query("DELETE FROM CartItem c WHERE c.cart.cartId = ?1 AND c.product.productId = ?2")
    void deleteCartItemByProductIdAndCartId(Long cartId, Long productId);

    @Modifying
    @Query("DELETE FROM CartItem c WHERE c.cart.cartId = ?1")
    void deleteAllByCartId(Long cartId);
}
