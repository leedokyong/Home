package org.example.test.dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChatDTO {
    private int chatID;
    private int matchID;
    private int boardID;
    private String sender;
    private String receiver;
}
