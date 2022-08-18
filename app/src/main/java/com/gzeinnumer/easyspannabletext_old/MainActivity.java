package com.gzeinnumer.easyspannabletext_old;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpannableString spannable = new SpannableString("Text is spantastic!");
        spannable.setSpan(
                new ForegroundColorSpan(Color.RED),
                8, 12,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        spannable.setSpan(
                new StyleSpan(Typeface.BOLD),
                8, spannable.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        ((TextView) findViewById(R.id.tv)).setText(spannable);
    }
}