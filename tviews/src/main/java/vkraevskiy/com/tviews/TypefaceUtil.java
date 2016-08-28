package vkraevskiy.com.tviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

final class TypefaceUtil {

    private static final String FONTS_DIR = "fonts/";
    private static final Map<String, Typeface> typefaceCache;

    static {
        typefaceCache = new HashMap<>();
    }

    static void initializeView(TextView view, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Context context = view.getContext();

        TypedArray typedArray = context.obtainStyledAttributes(
                attrs,
                R.styleable.TView,
                defStyleAttr,
                defStyleRes
        );

        try {
            String font = typedArray.getString(R.styleable.TView_typeface);

            if (TextUtils.isEmpty(font)) {
                return;
            }

            Typeface typeface = loadTypeface(context, font);

            if (typeface == null) {
                return;
            }

            view.setTypeface(typeface, Typeface.NORMAL);
        } finally {
            typedArray.recycle();
        }
    }

    private static Typeface loadTypeface(Context context, String font) {
        if (typefaceCache.containsKey(font)) {
            return typefaceCache.get(font);
        }

        try {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), FONTS_DIR + font);
            typefaceCache.put(font, typeface);

            return typeface;
        } catch (RuntimeException e) {
            return null;
        }
    }
}
