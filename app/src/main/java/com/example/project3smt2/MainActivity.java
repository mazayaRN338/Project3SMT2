package com.example.project3smt2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menginisialisasi Toolbar
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar); // Menetapkan toolbar sebagai ActionBar

        // Tambahkan kode lainnya jika diperlukan
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Menghubungkan menu XML ke Activity
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Menangani item yang dipilih dari menu
        int id = item.getItemId();

        if (id == R.id.action_menu1) {
            Toast.makeText(this, "MENU 1", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_menu2) {
            Toast.makeText(this, "MENU 2", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_menu3) {
            Toast.makeText(this, "MENU 3", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}