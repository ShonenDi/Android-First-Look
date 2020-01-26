package com.example.justjava;


import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    boolean hasWhippedCream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummary(price));
    }

    /**
     * This's method calculate total price of order
     *
     * @return data type int, total price of order
     */
    private int calculatePrice() {
        int pricePerCup = 5;
        return (quantity * pricePerCup);
    }

    public boolean checkAddToppings(boolean check){
        CheckBox checkBox = findViewById(R.id.whipped_cream_check);
        if(checkBox.isChecked()){
            check = true;
        }else {
            check = false;
        }
        return check;
    }

    /**
     * Give total order information to user
     *
     * @param totalPrice
     * @return String with information in order
     */

    private String createOrderSummary(int totalPrice) {
        String name = "Captain America";
        String orderMassage = "Name: " + name + "\nAdd whipped cream? " + checkAddToppings(hasWhippedCream) + "\nQuantity: " + quantity + "\nTotal: $" + totalPrice + "\nThank you!";
        return orderMassage;
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}