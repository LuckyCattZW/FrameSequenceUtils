package z1w300.simple;

import android.support.rastermill.FrameSequenceDrawable;

import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideType;
import com.bumptech.glide.request.RequestOptions;

@GlideExtension
public class MyGlideExtension {

    private MyGlideExtension(){}

    @GlideType(FrameSequenceDrawable.class)
    public static RequestBuilder<FrameSequenceDrawable> asSupportGift(RequestBuilder<FrameSequenceDrawable> builder){
        builder.apply(RequestOptions.decodeTypeOf(FrameSequenceDrawable.class));
        return builder;
    }
}
