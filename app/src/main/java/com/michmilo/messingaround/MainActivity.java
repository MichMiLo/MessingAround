package com.michmilo.messingaround;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button answerYesButton, answerNoButton;
    private EditText userNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerYesButton = (Button)findViewById(R.id.answer_yes_button);
        answerNoButton = (Button) findViewById(R.id.answer_no_button);

        userNameEditText = (EditText) findViewById(R.id.users_name_edit_text);
    }

    public void onYesButtonClick(View view) {

        String usersName = String.valueOf(userNameEditText.getText());

        String yourYesResponse = "That's the spirit " + usersName + "!";

        Toast.makeText(this, yourYesResponse, Toast.LENGTH_SHORT).show();
    }

    public void onNoButtonClick(View view) {

        String usersName = String.valueOf(userNameEditText.getText());

        String yourNoResponse = "Awwwh cheer up " + usersName + "!";

        Toast.makeText(this, yourNoResponse, Toast.LENGTH_SHORT).show();
    }
}
