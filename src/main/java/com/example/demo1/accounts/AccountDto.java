package com.example.demo1.accounts;

import lombok.Data;

import javax.validation.constraints.Size;
import java.util.Date;

public class AccountDto {

    @Data
    public static class Create{

        @Size(min=5)
        private String username;


        @Size(min=5)
        private String userpw;


        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUserpw() {
            return userpw;
        }

        public void setUserpw(String userpw) {
            this.userpw = userpw;
        }

    }

    @Data
    public static class Response{
        private Long userid;
        private String username;
        private String fullName;
        private Date joined;
        private Date updated;
    }

    @Data
    public static class Update{
        private String password;
        private String fullName;
    }

}
