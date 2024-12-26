    package com.vss.chat.Chat_application.entities;


    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import java.time.LocalDateTime;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    public class Message {

        private String sender;
        private String content;
        private LocalDateTime timeStamp;



        public Message(String sender, String content) {
            this.sender = sender;
            this.content = content;
            this.timeStamp = LocalDateTime.now();
        }

    }
