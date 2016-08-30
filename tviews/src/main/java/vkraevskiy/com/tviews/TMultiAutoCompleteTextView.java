package vkraevskiy.com.tviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

@SuppressWarnings("unused")
public class TMultiAutoCompleteTextView extends MultiAutoCompleteTextView {
    public TMultiAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypefaceUtil.initializeView(this, attrs, 0, 0);
    }

    public TMultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, 0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TMultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, defStyleRes);
    }
}
