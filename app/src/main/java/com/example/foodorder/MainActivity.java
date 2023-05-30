package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox pizza,coffee,burger;
    Button buttonOrder;


    /** mukul **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        pizza = (CheckBox)findViewById(R.id.checkBox);
        coffee = (CheckBox)findViewById(R.id.checkBox2);
        burger =  (CheckBox)findViewById(R.id.checkBox3);
        buttonOrder = (Button)findViewById(R.id.button);

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalAmo = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items");
                if (pizza.isChecked()){
                    result.append("\n Pizza 100 RS");
                    totalAmo+=100;
                }
                if (coffee.isChecked()){
                    result.append("\n Coffee 200 RS");
                    totalAmo+=200;
                }
                if (burger.isChecked()){
                    result.append("\n Burger 300 RS");
                    totalAmo+=300;
                }
                if (result!=null && !result.toString().equals("")) {
                    result.append("\n Total " + totalAmo + "RS");
                    Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_LONG).show();

            }
        });
    }
}