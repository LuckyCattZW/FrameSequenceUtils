package z1w300.simple;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.image);
        String gifUrl = "https://www.verdict.co.uk/wp-content/uploads/2017/09/giphy-downsized-large.gif";
//        String gifUrl = "https://template.3dnest.cn/resources/loading/20200803152120_company_loading.gif";
        GlideApp.with(this).asSupportGift().load(gifUrl).into(imageView);
    }
}
