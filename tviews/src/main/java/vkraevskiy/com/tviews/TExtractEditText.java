package vkraevskiy.com.tviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.os.Build;
import android.util.AttributeSet;

@SuppressWarnings("unused")
public class TExtractEditText extends ExtractEditText {
    public TExtractEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypefaceUtil.initializeView(this, attrs, 0, 0);
    }

    public TExtractEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, 0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TExtractEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, defStyleRes);
    }
}
