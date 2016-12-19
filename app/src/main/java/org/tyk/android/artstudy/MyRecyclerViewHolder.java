package org.tyk.android.artstudy;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tangyangkai on 16/9/22.
 */

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;

    public MyRecyclerViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.item_text);
    }
}
