package org.example.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.test.dto.ChatDTO;
import org.example.test.util.MybatisConnectionFactory;

public class ChatRoomDAO {

//    create, delete, update
public int GetChatRoom (ChatDTO chatDTO) {
    int result = 0;
    SqlSession sqlSession = MybatisConnectionFactory.getSqlSession();
    result = sqlSession.insert("getChatRoom",chatDTO);
    sqlSession.commit();
    sqlSession.close();
    return result;
}

    public int CreateChatRoom (ChatDTO chatDTO) {
    int result = 0;
    SqlSession sqlSession = MybatisConnectionFactory.getSqlSession();
    result = sqlSession.insert("createChatRoom",chatDTO);
    sqlSession.commit();
    sqlSession.close();
    return result;
    }

    public int updateChatRoom(ChatDTO chatDTO) {
        int result = 0;
        SqlSession sqlSession = MybatisConnectionFactory.getSqlSession();
        result = sqlSession.update("updateChatRoom",chatDTO);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    public int deleteChatroom(ChatDTO chatDTO) {
        SqlSession sqlSession = MybatisConnectionFactory.getSqlSession();
        int result = sqlSession.delete("deleteChatRoom",chatDTO);
        System.out.println("dao result==="+result);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

}
