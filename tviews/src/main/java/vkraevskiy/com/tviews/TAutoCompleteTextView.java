package vkraevskiy.com.tviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

@SuppressWarnings("unused")
public class TAutoCompleteTextView extends AutoCompleteTextView {
    public TAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypefaceUtil.initializeView(this, attrs, 0, 0);
    }

    public TAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, 0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.N)
    public TAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, Resources.Theme popupTheme) {
        super(context, attrs, defStyleAttr, defStyleRes, popupTheme);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, defStyleRes);
    }
}
