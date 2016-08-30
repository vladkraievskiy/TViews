package vkraevskiy.com.tviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.Switch;

@SuppressWarnings("unused")
@RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public class TSwitch extends Switch {
    public TSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypefaceUtil.initializeView(this, attrs, 0, 0);
    }

    public TSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, 0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TSwitch(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        TypefaceUtil.initializeView(this, attrs, defStyleAttr, defStyleRes);
    }
}
