package com.kzai.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etExistingItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        etExistingItem = (EditText) findViewById(R.id.etExistingItem);
        etExistingItem.setText(getIntent().getStringExtra("selectedItem"));
        etExistingItem.setSelection(etExistingItem.getText().length());
    }


    public void OnSaveItem(View view) {
        // Prepare data intent
        Intent data = new Intent();
        // Pass relevant data back as a result
        System.out.println("HIDFHIDFHIHIFHHI");
        System.out.println(etExistingItem.getText());
        data.putExtra("editedItem", etExistingItem.getText().toString());
        data.putExtra("itemPosition", getIntent().getIntExtra("itemPosition", 0));
        // Activity finished ok, return the data
        setResult(RESULT_OK, data); // set result code and bundle data for response
        finish(); // closes the activity, pass data to parent
    }
}
