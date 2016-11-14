package com.thinkerjet.network.news;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.BoolRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.thinkerjet.network.R;

import java.util.List;

/**
 * Created by Z on 2016/11/7.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.TextViewHolder> {
    private List<NewsListData.ResultBean.DataBean> data;
    private Context context;

    public NewsAdapter(List<NewsListData.ResultBean.DataBean> data) {
        this.data = data;
    }

    @Override
    public TextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_news, parent, false);
        return new TextViewHolder(itemView);

    }

    List<Boolean> ifHadReadList;
//    //////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void onBindViewHolder(TextViewHolder holder, final int position) {
        //获取position位置 对应的数据
//        NewsListData.ResultBean.DataBean dataBean = data.get(position);
//        holder.bindData(dataBean);
        if (data.get(position).isIfHadReaded()) {
            holder.itemView.setBackgroundColor(Color.GREEN);
        } else {
            holder.itemView.setBackgroundColor(Color.WHITE);
        }
        holder.textView.setText(data.get(position).getTitle());
        Picasso.with(context)
                //http://mini.eastday.com/mobile/161106181949924.html?qid=juheshuju
                .load(Uri.parse(data.get(position).getThumbnail_pic_s()))
                .into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转网页
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data.get(position).getUrl()));
                context.startActivity(intent);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(context)
                        .setItems(new String[]{"标记已读", "删除聊天"}, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                switch (i) {
                                    case 0:
                                        data.get(position).setIfHadReaded(true);
                                        notifyDataSetChanged();
                                        break;
                                    case 1:
                                        break;
                                }
                            }
                        })
                        .create();
                alertDialog.show();
                return false;
            }
        });
    }

    class TextViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public TextViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv_news);
            imageView = (ImageView) itemView.findViewById(R.id.iv_news);
        }

//        public void bindData(NewsListData.ResultBean.DataBean dataBean) {
//            textView.setText(dataBean.getTitle());
//            //加载网络图片
//            Picasso.with(context)
//                    .load(Uri.parse(dataBean.getThumbnail_pic_s()))
//                    .into(imageView);
//        }
    }


//  ///////////////////////////////////////////////////////////////////////////////


    @Override
    public int getItemCount() {
        return data.size();
    }


}
