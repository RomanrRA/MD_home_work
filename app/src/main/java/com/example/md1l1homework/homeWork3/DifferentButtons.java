package com.example.md1l1homework.homeWork3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.md1l1homework.R;
import com.example.md1l1homework.homeWork2.helpers.Common;
import com.google.android.material.snackbar.Snackbar;

public class DifferentButtons extends AppCompatActivity {
    private Button materialButton,
            materialButtonUnelevated,
            materialButtonDisabled,
            gridMaterialButton,
            elevatedMaterialButton,
            textButton,
            textButtonDisabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw3_activity_different_button);

        initViews();

        snackButtonOnClickListner(materialButton);
        snackButtonOnClickListner(materialButtonUnelevated);
        snackButtonOnClickListner(materialButtonDisabled);
        snackButtonOnClickListner(gridMaterialButton);
        snackButtonOnClickListner(elevatedMaterialButton);
        snackButtonOnClickListner(textButton);
        snackButtonOnClickListner(textButtonDisabled);
    }

    private void initViews() {
        materialButton = findViewById(R.id.material_button);
        materialButtonUnelevated = findViewById(R.id.material_unelevated_button);
        materialButtonDisabled = findViewById(R.id.disabled_material_button);
        gridMaterialButton = findViewById(R.id.grid_material_button);
        elevatedMaterialButton = findViewById(R.id.elevated_material_button);
        textButton = findViewById(R.id.material_text_button);
        textButtonDisabled = findViewById(R.id.disabled_text_button);
    }

    private void snackButtonOnClickListner(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Common.getCustomSnackbar(v, button.getText().toString());
                snackbar.show();
            }
        });
    }
}
