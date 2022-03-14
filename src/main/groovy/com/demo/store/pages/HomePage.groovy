package com.demo.store.pages

import geb.Page

class HomePage extends Page {

    static at = {
        getTitle() == "TESTSCRIPTDEMO – Automation Practice"
    }

    static content = {
        shopLink {$("a", title:"Shop")}
        wishListLink {$("a", title:"Wishlist").eq(0)}
        cartLink {$("a", title:"Cart").eq(0).firstElement()}
        viewCartLink(wait:"quick") {$("div.widget_shopping_cart_content a", text:"View cart").eq(0)}
    }

    def clickOnShopLink(){
        shopLink.click(ShopPage) //Navigate to ShopPage
    }

}
