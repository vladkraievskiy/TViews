package vkraevskiy.com.tviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextClock;

@SuppressWarnings("unused")
@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
public class TTextClock extends TextClock {
    public TTextClock(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypefaceUtil.initializeView(this, attrs, 0, 0);
    }

    public TTextClock(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, 0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TTextClock(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, defStyleRes);
    }
}
