package com.whiteship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}


//package com.whiteship;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class Application {
//    public static void main(String[] args) throws SQLException {
//        String url = "jdbc:postgresql://localhost:5432/springdata";
//        String username = "hyeoncheol";
//        String password="pass";
//
//        try(Connection connection = DriverManager.getConnection(url,username,password)){
//            System.out.println("Connection created: "+connection);
//            String sql = "INSERT INTO ACCOUNT VALUES(1,'hyeon','pass')";
//            try(PreparedStatement statement = connection.prepareStatement(sql)){
//                statement.execute();
//            }
//        }
//    }
//}
