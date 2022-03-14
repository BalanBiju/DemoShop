package com.demo.store.pages

import com.demo.store.modules.AddWishListModule

class ShopPage extends HomePage {

    static at = {
        getTitle() == "Products – TESTSCRIPTDEMO"
    }

    static content = {
        addToCartLinks {$("a", text:contains("Add to cart")).parent("li").moduleList(AddWishListModule)}
    }

    /*
    Method to add 4 items to wish list this can be customized to different count
    Here we have added product which have Add to cart so that we can compare the price and get the lowest
     */
    def addItemsToWishList(){
        println(addToCartLinks.size())
//        addToCartLinks.each {addToCart ->
//            addToCart.clickAddToWishList()
//        }
        for(int i = 0; i<4; i++){
            addToCartLinks[i].clickAddToWishList()
        }
    }

    def viewProductsinWishList(){
        wishListLink.click()
    }



}
