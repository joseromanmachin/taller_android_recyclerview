package com.mac.recyclerview.Recycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mac.recyclerview.R;

import java.util.List;

public class AdaptadorChat extends RecyclerView.Adapter<AdaptadorChat.ViewHolder>{

    private List<Chat> chatList;
    private Context context;

    public AdaptadorChat(List<Chat> chatList, Context context) {
        this.chatList = chatList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tarjeta_chats,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNombre.setText(chatList.get(position).getNombre());
        holder.txtHora.setText(chatList.get(position).getHora());
        holder.txtChat.setText(chatList.get(position).getChat());


        Glide.with(context)
                .load(chatList.get(position).getFoto())
                .circleCrop()
                .into(holder.imgFoto);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = "El numero "+ chatList.get(position).getNombre()+" te ha enviado un mensaje !!!!";
                Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
                context.startActivity(new Intent(context,ChatActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private TextView txtNombre,txtHora,txtChat;
        private CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFoto = itemView.findViewById(R.id.img_foto);
            txtNombre = itemView.findViewById(R.id.txt_nombre);
            txtHora = itemView.findViewById(R.id.txt_hora);
            txtChat = itemView.findViewById(R.id.txt_chat);
            cardView = itemView.findViewById(R.id.tarjeta_chat);
        }
    }
}
