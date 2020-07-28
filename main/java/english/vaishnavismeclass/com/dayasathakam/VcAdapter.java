package english.vaishnavismeclass.com.dayasathakam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: MainActivity */
class VcAdapter extends BaseAdapter {
    Context context;
    ArrayList<SingleRow> list;

    VcAdapter(Context c) {
        this.context = c;
        this.list = new ArrayList();
        String[] pasuram_en = c.getResources().getStringArray(C0040R.array.pasuram_en);
        int[] imgs = new int[]{C0040R.drawable.d_01, C0040R.drawable.img_01, C0040R.drawable.img_02, C0040R.drawable.img_03, C0040R.drawable.img_04, C0040R.drawable.img_05, C0040R.drawable.img_06, C0040R.drawable.img_07, C0040R.drawable.img_08, C0040R.drawable.img_09, C0040R.drawable.img_10, C0040R.drawable.img_11, C0040R.drawable.img_12, C0040R.drawable.img_13, C0040R.drawable.img_14, C0040R.drawable.img_15, C0040R.drawable.img_16, C0040R.drawable.img_17, C0040R.drawable.img_18, C0040R.drawable.img_19, C0040R.drawable.img_20, C0040R.drawable.img_21, C0040R.drawable.img_22, C0040R.drawable.img_23, C0040R.drawable.img_24, C0040R.drawable.img_25, C0040R.drawable.img_26, C0040R.drawable.img_27, C0040R.drawable.img_28, C0040R.drawable.img_29, C0040R.drawable.img_30, C0040R.drawable.img_06, C0040R.drawable.img_07, C0040R.drawable.img_08, C0040R.drawable.img_09, C0040R.drawable.img_10, C0040R.drawable.img_01, C0040R.drawable.img_02, C0040R.drawable.img_03, C0040R.drawable.img_04, C0040R.drawable.img_05, C0040R.drawable.img_11, C0040R.drawable.img_12, C0040R.drawable.img_13, C0040R.drawable.img_14, C0040R.drawable.img_15, C0040R.drawable.img_21, C0040R.drawable.img_22, C0040R.drawable.img_23, C0040R.drawable.img_24, C0040R.drawable.img_25, C0040R.drawable.img_16, C0040R.drawable.img_17, C0040R.drawable.img_18, C0040R.drawable.img_19, C0040R.drawable.img_20, C0040R.drawable.img_26, C0040R.drawable.img_27, C0040R.drawable.img_28, C0040R.drawable.img_29, C0040R.drawable.img_30, C0040R.drawable.img_01, C0040R.drawable.img_02, C0040R.drawable.img_03, C0040R.drawable.img_04, C0040R.drawable.img_05, C0040R.drawable.img_11, C0040R.drawable.img_12, C0040R.drawable.img_13, C0040R.drawable.img_14, C0040R.drawable.img_15, C0040R.drawable.img_06, C0040R.drawable.img_07, C0040R.drawable.img_08, C0040R.drawable.img_09, C0040R.drawable.img_10, C0040R.drawable.img_21, C0040R.drawable.img_22, C0040R.drawable.img_23, C0040R.drawable.img_24, C0040R.drawable.img_25, C0040R.drawable.img_16, C0040R.drawable.img_17, C0040R.drawable.img_18, C0040R.drawable.img_19, C0040R.drawable.img_20, C0040R.drawable.img_26, C0040R.drawable.img_27, C0040R.drawable.img_28, C0040R.drawable.img_29, C0040R.drawable.img_30, C0040R.drawable.img_01, C0040R.drawable.img_02, C0040R.drawable.img_03, C0040R.drawable.img_04, C0040R.drawable.img_05, C0040R.drawable.img_11, C0040R.drawable.img_12, C0040R.drawable.img_13, C0040R.drawable.img_14, C0040R.drawable.img_15, C0040R.drawable.img_06, C0040R.drawable.img_07, C0040R.drawable.img_08, C0040R.drawable.img_09, C0040R.drawable.img_10, C0040R.drawable.img_16, C0040R.drawable.img_17, C0040R.drawable.img_30, C0040R.drawable.img_30};
        for (int i = 0; i < pasuram_en.length; i++) {
            this.list.add(new SingleRow(pasuram_en[i], imgs[i]));
        }
    }

    public int getCount() {
        return this.list.size();
    }

    public Object getItem(int i) {
        return this.list.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0040R.layout.single_row, viewGroup, false);
        ImageView img = (ImageView) row.findViewById(C0040R.id.imageView1);
        SingleRow temp = (SingleRow) this.list.get(i);
        ((TextView) row.findViewById(C0040R.id.textView1)).setText(temp.pasuram);
        img.setImageResource(temp.img);
        return row;
    }
}
