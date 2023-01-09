package com.example.anotherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.anotherapp.JSON.Product;

import java.util.ArrayList;
import java.util.List;

public class AddProductActivity extends AppCompatActivity {
    private ArrayAdapter<Product> adapter;
    private List<Product> products;
    private TextView alertNameTextView;
    private TextView alertPriceTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources resources = getResources();
        Intent intent = getIntent();
        setContentView(R.layout.add_product_activity);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        EditText EditName = findViewById(R.id.editTextName);
        EditText EditPrice = findViewById(R.id.editTextPrice);
        Button AddButton = findViewById(R.id.AddButton);
        products = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,products);
        alertNameTextView = new TextView(this);
        alertPriceTextView = new TextView(this);
        int alertColor = resources.getColor(R.color.red);

        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = EditName.getText().toString();
                String price = EditPrice.getText().toString();
                if(Name == ""){
                    //Я пытался так, но у меня что-то не работает
                    ConstraintLayout.LayoutParams alertNameLayoutParams = new ConstraintLayout.LayoutParams
                            (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    alertNameTextView.setText("Вы не ввели имя");
                    alertNameTextView.setTextColor(alertColor);
                    alertNameLayoutParams.topToBottom = EditName.getId();
                    alertNameTextView.setLayoutParams(alertNameLayoutParams);
                    constraintLayout.addView(alertNameTextView);
                    recreate();
                }
                if(price == ""){
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}