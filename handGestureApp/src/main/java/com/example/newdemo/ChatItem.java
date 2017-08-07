package com.example.newdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class ChatItem extends FrameLayout {

    public static final int ITEM_LEFT = 0;
    public static final int ITEM_RIGHT = 1;

    public ChatItem(Context context, int position, String text) {
        super(context);
        onInit(context, position, text);
    }

    public ChatItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ChatItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void onInit(Context context, int position, String text) {
        if (position == ITEM_LEFT) {
            inflate(context, R.layout.chat_item_left, this);
            ((TextView) findViewById(R.id.item_text)).setText(getCapitalized(text));
        } else {
            inflate(context, R.layout.chat_item_right, this);
            ((TextView) findViewById(R.id.item_text)).setText(getCapitalized(text));
        }
    }

    private String getCapitalized(String text){

        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
