package com.demo.store.spec

import com.demo.store.pages.HomePage
import geb.spock.GebReportingSpec

class BaseSpec extends GebReportingSpec {

    /*
    common method to be used across all the test to open application and get to shop page
     */
    def navigateToApp(){
        to HomePage
        clickOnShopLink()
    }



}
