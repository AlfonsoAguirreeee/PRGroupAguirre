package com.example.prgroupaguirre;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text_view);
        String textString = "By registering, you agree to our Terms and Conditions \n and Privacy Policy.";

        SpannableString spannableStr = new SpannableString(textString);
        ForegroundColorSpan black = new ForegroundColorSpan(Color.BLACK);
        ForegroundColorSpan black2 = new ForegroundColorSpan(Color.BLACK);
        StyleSpan bold = new StyleSpan(Typeface.BOLD);
        StyleSpan bold2 = new StyleSpan(Typeface.BOLD);

        spannableStr.setSpan(black2, 33, 54, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStr.setSpan(black, 60, 75, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStr.setSpan(bold2, 33, 54, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStr.setSpan(bold, 60, 75, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        text.setText(spannableStr);

    }
}