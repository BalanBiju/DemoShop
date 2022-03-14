package com.demo.store.pages

class CartPage extends HomePage {

    static at = {
        getTitle() == "Cart – TESTSCRIPTDEMO"
    }

    static content = {
        productName  {$("td", class:"product-name" )}
    }

    def productAddedToCart(){
        productName.text()
    }

}
