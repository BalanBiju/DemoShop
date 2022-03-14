package com.demo.store.spec

import com.demo.store.pages.CartPage
import com.demo.store.pages.WishListPage

class ChooseRandomProductSpec extends BaseSpec{

    def "choose 4 product to wish list and checkout the product with least price"(){
        given: "I navigate to app and add 4 different product to wish list"
        navigateToApp()
        addItemsToWishList()

        when:"I view my wishlist table"
        viewProductsinWishList()

        then:"I find total four selected items in my Wishlist"
        at WishListPage
        getWishListProductCount() == 4

        when: "I search for lowest price product"
        int minPricePosition = findLowestPrice()

        and: "I am able to add the lowest price item to my cart"
        String addedProductName = addItemToCart(minPricePosition)
        viewCart()

        then: "I am able to verify the item in my cart"
        at CartPage
        productAddedToCart()==addedProductName

        cleanup:
        driver.quit()

    }


}
