package vkraevskiy.com.tviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.DigitalClock;

@SuppressWarnings("unused")
public class TDigitalClock extends DigitalClock {
    public TDigitalClock(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypefaceUtil.initializeView(this, attrs, 0, 0);
    }
}
