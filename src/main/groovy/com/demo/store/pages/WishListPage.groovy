package com.demo.store.pages

import com.demo.store.modules.WishListItemPriceModule
import org.openqa.selenium.interactions.Actions

class WishListPage extends HomePage {

    static at = {
        getTitle() == "Wishlist – TESTSCRIPTDEMO"
    }

    static content = {
        wishListItems {$("tbody", class:"wishlist-items-wrapper").find("tr").moduleList(WishListItemPriceModule)}

        addToCart {index -> $("tbody.wishlist-items-wrapper tr td.product-add-to-cart a").eq(index)}
        addedProductName {index -> $("tbody.wishlist-items-wrapper tr td.product-name").eq(index)}

    }

    /*
    Method to find the number of rows in Wishlist table
    return : Total rows in table
     */
    int getWishListProductCount(){
        return wishListItems.size().toInteger()
    }

    /*
    Method to loop through all the rows in wishlist table, get the price and find the lowest price
    return : lowest price
     */
    int findLowestPrice(){
        float minPrice, price
        int minPricePosition, index
        minPrice = 0.00
        index=0
        wishListItems.each {item ->
            price = item.getItemPrice().substring(1).toFloat()
            if(minPrice == 0.00 || price<minPrice){
                minPrice = price
                minPricePosition = index
            }
            index += 1
        }
        return minPricePosition
    }

    /*
    Method to add item to cart
    return : product name to check if product added to cart in Cart page
     */
    String addItemToCart(int itemPosition){
        addToCart(itemPosition).click()
        return addedProductName(itemPosition).text()
    }

    /*
    Hover the mouse over cart link and click on view cart
     */
    def viewCart(){
        Actions action = new Actions(driver)
        action.moveToElement(cartLink).perform()
        viewCartLink.click()
    }

}
