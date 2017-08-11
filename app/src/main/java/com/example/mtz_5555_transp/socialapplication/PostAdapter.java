package com.example.mtz_5555_transp.socialapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mtz-5555-transp on 11/08/17.
 */

public class PostAdapter extends ArrayAdapter<Post> {

    public PostAdapter(@NonNull Context context, @NonNull List<Post> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //1)
        Post post = getItem(position);

        //2)
        ViewHolder vh;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.post_item, null);
            vh = new ViewHolder();

            //3)
            vh.txtNome = (TextView) convertView.findViewById(R.id.txt_nome);

            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        vh.txtNome.setText(post.getNome());

        //4)
        return convertView;
    }

    private static class ViewHolder {
        TextView txtNome;
    }
}
