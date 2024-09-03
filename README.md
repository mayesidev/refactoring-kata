**This repo was generated from https://github.com/emilybache/SupermarketReceipt-Refactoring-Kata. This is only the content from the `java` example (with some build changes for compatibility/familiarity), pulled from the `with_tests` branch, intended to be used as a test-driven development (TDD) exercise to practice the `refactor` stage of the `red-green-refactor` loop.**

# The Supermarket Receipt Refactoring Kata

This is a variation of a popular kata described in http://codekata.com/kata/kata01-supermarket-pricing/. The aim of the exercise is to build automated tests for this code, refactor it, and add a new feature. 

The supermarket has a catalog with different types of products (rice, apples, milk, toothbrushes,...). Each product has a price, and the total price of the shopping cart is the total of all the prices of the items. You get a receipt that details the items you've bought, the total price and any discounts that were applied.

The supermarket runs special deals, e.g.
 - Buy two toothbrushes, get one free. Normal toothbrush price is €0.99
 - 20% discount on apples, normal price €1.99 per kilo.
 - 10% discount on rice, normal price €2.49 per bag
 - Five tubes of toothpaste for €7.49, normal price €1.79
 - Two boxes of cherry tomatoes for €0.99, normal price €0.69 per box.

These are just examples: the actual special deals change each week.
