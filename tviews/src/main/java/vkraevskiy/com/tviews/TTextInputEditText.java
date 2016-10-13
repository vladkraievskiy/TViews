package vkraevskiy.com.tviews;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.util.AttributeSet;

@SuppressWarnings("unused")
public class TTextInputEditText extends TextInputEditText {

    public TTextInputEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypefaceUtil.initializeView(this, attrs, 0, 0);
    }

    public TTextInputEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, 0);
    }
}
