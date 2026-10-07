/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * iOS-style circular key: a HapticButton that always renders as a circle
 * (or a stadium when the cell is wider than tall, e.g. the wide "0" key).
 */
package com.android.calculator2;

import android.content.Context;
import android.util.AttributeSet;

public class IosButton extends HapticButton {
    public IosButton(Context context) {
        super(context);
    }

    public IosButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public IosButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w > 0 && h > 0) {
            setCornerRadius(Math.min(w, h) / 2);
        }
    }
}
