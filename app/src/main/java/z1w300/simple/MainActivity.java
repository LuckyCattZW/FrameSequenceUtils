package z1w300.simple;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.support.rastermill.FrameSequenceDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.image);

        String gifUrl = "https://www.verdict.co.uk/wp-content/uploads/2017/09/giphy-downsized-large.gif";
        GlideApp.with(this).as(FrameSequenceDrawable.class).load(gifUrl).into(imageView);
    }
}
