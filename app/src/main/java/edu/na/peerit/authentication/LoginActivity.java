package edu.na.peerit.authentication;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import edu.na.peerit.R;

/**
 * Created by yernar on 15/04/17.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setStatusBarColor(Color.parseColor("#9b0000"));
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            Log.d("my version", "less lollipop");
            final Drawable originalDrawable = (findViewById(R.id.facebook_login_button)).getBackground();
            final Drawable signDrawable = (findViewById(R.id.signup)).getBackground();
            final Drawable wrappedDrawable = DrawableCompat.wrap(originalDrawable);
            final Drawable signupDrawable = DrawableCompat.wrap(signDrawable);
            DrawableCompat.setTintList(wrappedDrawable, ColorStateList.valueOf(Color.BLUE));
            DrawableCompat.setTintList(signupDrawable, ColorStateList.valueOf(Color.WHITE));
            findViewById(R.id.facebook_login_button).setBackground(wrappedDrawable);
            findViewById(R.id.signup).setBackground(signupDrawable);

        }
    }
}
