package com.mac.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mac.recyclerview.Recycler.AdaptadorChat;
import com.mac.recyclerview.Recycler.Chat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerChats;
    AdaptadorChat adaptadorChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        recyclerChats = findViewById(R.id.recycler_chasts);
        recyclerChats.setLayoutManager(new LinearLayoutManager(this));

        List<Chat> chatList = new ArrayList<>();

        chatList.add(new Chat(90,"+ 52 993394556","04.02.02","Que onda  !!!🤔","https://aws.glamour.mx/prod/designs/v1/assets/1170x614/224605.jpg"));

        for (int i = 0; i <50 ; i++) {
            chatList.add(new Chat(i,"+ 52 99339514"+i,"04.02.0"+i,"Hola como estas !!!😅","https://media.metrolatam.com/2020/04/16/loaiza-a0531cbb6a63b155bebe1eac0cb50009-600x400.jpg"));
        }
        adaptadorChat = new AdaptadorChat(chatList,this);

        recyclerChats.setAdapter(adaptadorChat);
    }
}