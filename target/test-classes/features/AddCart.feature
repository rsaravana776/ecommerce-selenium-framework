
@smoke
@regression

Feature: Add Cart

Scenario Outline: User adds product to cart

Given Open Website

When Search Product "<product>"

And Add Product

Then Open Cart

Examples:

| product |
| Apple MacBook Pro |
| Build your own computer |
| HTC One M8 Android L 5.0 Lollipop |

