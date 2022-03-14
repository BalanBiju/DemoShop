package com.demo.store.modules

import geb.Module

class WishListItemPriceModule extends Module {
    static content = {
        wishListItemPrice {$("td", class:"product-price").find("bdi")}
        wishListItemReducedPrice(required:false) {$("td", class:"product-price").find("ins bdi")}
    }

    /*
    This method checks if there is a discounted price for each item in wishlist table
    return : reduced price if exist else price
     */
    def getItemPrice(){
        return wishListItemReducedPrice ? wishListItemReducedPrice.text() : wishListItemPrice.text()
    }

}
