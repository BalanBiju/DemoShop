package com.demo.store.modules

import geb.Module

class AddWishListModule extends Module {

    static content = {
        addToWishList {$("a", "data-title":"Add to wishlist")}
        wishListAddedMsg {$("span", class:"feedback")}
    }

    def clickAddToWishList(){
        addToWishList.click()
        waitFor("quick") { wishListAddedMsg.isDisplayed()}
    }


}
