package com.example.kieran.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText questionEditText;
    TextView answerText;
    Button clickButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText)findViewById(R.id.question);
        answerText = (TextView)findViewById(R.id.answer_text);
        clickButton = (Button)findViewById(R.id.button);
    }

    public void oButtonClicked(View button){
        String question = questionEditText.getText().toString();
        Log.d("WordCount", question);

        WordCount wordCount = new WordCount();

        answerText.setText(wordCount.getWordCount());
    }
}
