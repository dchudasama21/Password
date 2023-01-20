package com.example.library;

import android.content.Context;
import android.text.InputType;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;

public class TogglePassword {

    private static boolean hidePassword;

    public static void Passcode(Context context, ImageView imageView, EditText editText, int show, int hide) {

        if (!hidePassword) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context,show));
            editText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            editText.setSelection(editText.getText().length());
            hidePassword = true;

        }else  {
            imageView.setImageDrawable(ContextCompat.getDrawable(context,hide));
            editText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            editText.setSelection(editText.getText().length());
            hidePassword = false;
        }
    }
}
