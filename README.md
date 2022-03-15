# DemoShop GebSpock Framework

## Description
This project is built on Selenium Geb-Spock framwork for below test,

Test : choose 4 product to wish list and checkout the product with least priceReturn <br />
Given: I navigate to app and add 4 different product to wish list <br />
When: I view my wishlist table <br />
Then: I find total four selected items in my Wishlist <br />
When: I search for lowest price product <br />
And: I am able to add the lowest price item to my cart <br />
Then: I am able to verify the item in my cart <br />

## Usage
Below command will launch the tests in chrome browser <br />
    ./gradlew test

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.


## Report : Spock reports

![image](https://user-images.githubusercontent.com/79200285/158280835-376f359f-95d5-4e13-b009-1d8bf0a7ee99.png)


![image](https://user-images.githubusercontent.com/79200285/158280676-cb44d661-ffb1-4696-8394-e4c5b57c5a05.png)
