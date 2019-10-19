package com.example.sahilassingment2;

import android.view.View;
import android.widget.TextView;

public class studentviewholder
{
    public class studentviewholder extends recycleview.viewholder{

        TextView tvname, tvid, tvpass;

        public studentviewholder(View itemview){
            super(itemview);
            tvname=itemview.findViewById(R.id.tvname);
            tvid=itemview.findViewById(R.id.tvid);
            tvpass=itemview.findViewById(R.id.tvpass);
        }
    }
}
