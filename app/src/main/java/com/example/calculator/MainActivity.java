package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
    public void add(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;

        et3.setText("Total Value: " + result);
    }
    public void Substraction(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;

        et3.setText("Substracted value " + result);
    }
    public void multiplication(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;

        et3.setText("Multiplied value: " + result);
    }
    public void divide(View v) {
        EditText et1 = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextNumber2);
        EditText et3 = findViewById(R.id.editTextNumber3);

        try {
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());

            if (n2 != 0) {
                int result = n1 / n2;
                et3.setText("Division value: " + result);
            } else {
                et3.setText("Cannot divide by zero");
            }
        } catch (NumberFormatException e) {
            et3.setText("Invalid input");
        }
    }
}