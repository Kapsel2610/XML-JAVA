package com.example.rejestracja;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText imie, nazwisko, email, haslo;
    Button rejestruj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imie = findViewById(R.id.etName);
        nazwisko = findViewById(R.id.etSurname);
        email = findViewById(R.id.etEmail);
        haslo = findViewById(R.id.etPassword);
        rejestruj = findViewById(R.id.btnRegister);

        rejestruj.setOnClickListener(v -> {

            String i = imie.getText().toString().trim();
            String n = nazwisko.getText().toString().trim();
            String e = email.getText().toString().trim();
            String h = haslo.getText().toString().trim();

            if (i.isEmpty() || n.isEmpty() || e.isEmpty() || h.isEmpty()) {
                Toast.makeText(this,
                        "Uzupełnij wszystkie pola",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(e).matches()) {
                Toast.makeText(this,
                        "Podaj poprawny adres email",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            if (h.length() < 8 ||
                    !h.matches(".*[A-Z].*") ||
                    !h.matches(".*[a-z].*") ||
                    !h.matches(".*[^a-zA-Z0-9].*")) {

                Toast.makeText(this,
                        "Hasło musi mieć co najmniej 8 znaków, dużą/małą literę i znak specjalny",
                        Toast.LENGTH_LONG).show();
                return;
            }

            Toast.makeText(this,
                    "Dane są poprawne",
                    Toast.LENGTH_SHORT).show();
        });
    }
}
