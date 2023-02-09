package com.geektech.androidgame;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.geektech.androidgame.databinding.ActivityGameThirdBinding;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class GameThirdActivity extends AppCompatActivity {

    private ActivityGameThirdBinding binding;
    private static final String CORRECT_WORD = "МУЗЫКА";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGameThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initImage();
        initListener();
        initBtnClear();
        initClearLetter();
        initBtnCheck();
    }

    private void initBtnCheck() {
        binding.btnCheck.setOnClickListener(view -> {
            if (binding.etLetter.getText().toString().equals(CORRECT_WORD)) {
                alertDialog();
            } else if (binding.etLetter.getText().toString().equals("")) {
                Toast.makeText(this, "Поле пустое", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show();
                binding.etLetter.setText("");
                binding.letter1.setVisibility(View.VISIBLE);
                binding.letter2.setVisibility(View.VISIBLE);
                binding.letter3.setVisibility(View.VISIBLE);
                binding.letter4.setVisibility(View.VISIBLE);
                binding.letter5.setVisibility(View.VISIBLE);
                binding.letter6.setVisibility(View.VISIBLE);
                binding.letter7.setVisibility(View.VISIBLE);
                binding.letter8.setVisibility(View.VISIBLE);
                binding.letter9.setVisibility(View.VISIBLE);
                binding.letter10.setVisibility(View.VISIBLE);
                binding.letter11.setVisibility(View.VISIBLE);
                binding.letter12.setVisibility(View.VISIBLE);
            }
        });
    }

    private void alertDialog() {
        MaterialAlertDialogBuilder alertDialog = new MaterialAlertDialogBuilder(this);
        alertDialog.setTitle("Вы угадали слово !");
        alertDialog.setMessage("Переходим на следующий экран ?");
        alertDialog.setPositiveButton("Дальше!", (dialogInterface, i) -> {
            Intent intent = new Intent(this, GameThirdActivity.class);
            startActivity(intent);
            finish();
        });
        alertDialog.setNegativeButton("В главное меню !", (dialogInterface, i) -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });
        alertDialog.show();
    }

    private void initClearLetter() {
        binding.btnClear.setOnClickListener(view -> {
            String text = binding.etLetter.getText().toString();
            binding.etLetter.setText(text.substring(0, text.length() - 1));
            char letter = text.charAt(text.length() - 1);

            if (String.valueOf(letter).equals(binding.letter1.getText().toString())) {
                binding.letter1.setVisibility(View.VISIBLE);
            }

            if (String.valueOf(letter).equals(binding.letter2.getText().toString())) {
                binding.letter2.setVisibility(View.VISIBLE);
            }
            if (String.valueOf(letter).equals(binding.letter3.getText().toString())) {
                binding.letter3.setVisibility(View.VISIBLE);
            }
            if (String.valueOf(letter).equals(binding.letter4.getText().toString())) {
                binding.letter4.setVisibility(View.VISIBLE);
            }

            if (String.valueOf(letter).equals(binding.letter5.getText().toString())) {
                binding.letter5.setVisibility(View.VISIBLE);
            }
            if (String.valueOf(letter).equals(binding.letter6.getText().toString())) {
                binding.letter6.setVisibility(View.VISIBLE);
            }
            if (String.valueOf(letter).equals(binding.letter7.getText().toString())) {
                binding.letter7.setVisibility(View.VISIBLE);
            }
            if (String.valueOf(letter).equals(binding.letter8.getText().toString())) {
                binding.letter8.setVisibility(View.VISIBLE);
            }
            if (String.valueOf(letter).equals(binding.letter9.getText().toString())) {
                binding.letter9.setVisibility(View.VISIBLE);
            }
            if (String.valueOf(letter).equals(binding.letter10.getText().toString())) {
                binding.letter10.setVisibility(View.VISIBLE);
            }
            if (String.valueOf(letter).equals(binding.letter11.getText().toString())) {
                binding.letter11.setVisibility(View.VISIBLE);
            }
            if (String.valueOf(letter).equals(binding.letter12.getText().toString())) {
                binding.letter12.setVisibility(View.VISIBLE);
            }
        });
    }

    private void initBtnClear() {
        binding.etLetter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() > 0) {
                    binding.btnClear.setVisibility(View.VISIBLE);
                } else {
                    binding.btnClear.setVisibility(View.GONE);
                }
            }
        });
    }

    private void initListener() {
        binding.letter1.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter1.getText().toString());
            binding.letter1.setVisibility(View.INVISIBLE);
        });
        binding.letter2.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter2.getText().toString());
            binding.letter2.setVisibility(View.INVISIBLE);
        });
        binding.letter3.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter3.getText().toString());
            binding.letter3.setVisibility(View.INVISIBLE);
        });
        binding.letter4.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter4.getText().toString());
            binding.letter4.setVisibility(View.INVISIBLE);
        });
        binding.letter5.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter5.getText().toString());
            binding.letter5.setVisibility(View.INVISIBLE);
        });
        binding.letter6.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter6.getText().toString());
            binding.letter6.setVisibility(View.INVISIBLE);
        });
        binding.letter7.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter7.getText().toString());
            binding.letter7.setVisibility(View.INVISIBLE);
        });
        binding.letter8.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter8.getText().toString());
            binding.letter8.setVisibility(View.INVISIBLE);
        });
        binding.letter9.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter9.getText().toString());
            binding.letter9.setVisibility(View.INVISIBLE);
        });
        binding.letter10.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter10.getText().toString());
            binding.letter10.setVisibility(View.INVISIBLE);
        });
        binding.letter11.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter11.getText().toString());
            binding.letter11.setVisibility(View.INVISIBLE);
        });
        binding.letter12.setOnClickListener(view -> {
            binding.etLetter.append(binding.letter12.getText().toString());
            binding.letter12.setVisibility(View.INVISIBLE);
        });
    }

    private void initImage() {
        Glide.with(this).load("https://img.championat.com/news/big/v/b/pokoleniya-i-sport_162981756798672779.jpg").centerCrop().into(binding.imageOne);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/a/a5/Arnold_Schwarzenegger_by_Gage_Skidmore_3.jpg").centerCrop().into(binding.imageTwo);
        Glide.with(this).load("https://www.justfood.pro/assets/images/share-img.jpg").centerCrop().into(binding.imageThird);
        Glide.with(this).load("https://img.championat.com/c/1200x900/news/big/h/d/pravitelstvo-rossii-utverdilo-denezhnye-voznagrazhdeniya-za-medali-na-olimpiade-v-tokio_16288484272005059314.jpg").centerCrop().into(binding.imageFour);
    }

}