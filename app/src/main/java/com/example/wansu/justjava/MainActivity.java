package com.example.wansu.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int coffees = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submit(View view) {
        int coffees = 10;
        String message = "Amount due $" + coffees;
        String message1 = "That would be $" + coffees + "please";
        String message2 = "You owe " + coffees + " bucks, dude!";
        String message3 = coffees + " dollars for 2 cups of coffee. Pay Up.";
        String message4 = "Total = $" + coffees;
        displayMessage(message3);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        coffees = coffees+1;
        display(coffees);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        coffees = coffees-1;
        display(coffees);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}