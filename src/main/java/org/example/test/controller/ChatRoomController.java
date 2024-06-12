package org.example.test.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.test.HelloServlet;
import org.example.test.dao.ChatRoomDAO;
import org.example.test.dto.ChatDTO;

import java.io.IOException;

@WebServlet("/chatroom/create")
public class ChatRoomController extends HelloServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //누나 미안...
        //보더 아이디 센더 리시버
        //네???
        ChatRoomDAO chatRoomDAO = new ChatRoomDAO();
        ChatDTO chatDTO =
                ChatDTO.builder()
                        .boardID(Integer.parseInt(req.getParameter("boardID")))
//                        .sender(req.getParameter("sender"))
                        .receiver(req.getParameter("receiver"))
                        .build();
        int result = chatRoomDAO.CreateChatRoom(chatDTO);
        if(result>0) {
            resp.sendRedirect("../board/");
        }
    }
}
// 채팅룸을 만들었어 시퀀스에 챗 아이디가 생기지 그 아이디를 물고 채팅방으로 이동시켜줘야함 지피티