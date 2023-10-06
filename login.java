package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    public Connection conectarBD() {
        Connection conn = null; //1
        try { //2
            Class.forName("com.mysql.Driver.Manager").newInstance(); //3
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123"; //4
            conn = DriverManager.getConnection(url); //5
        }catch (Exception e) { } //6 e 7
        return conn;} //8
    public String nome=""; //9
    public boolean result = false; //10
    public boolean verificarUsuario(String login, String senha) { //11
        String sql = ""; //12
        Connection conn = conectarBD(); //13
        sql += "select nome from usuarios ";
        sql +="where login = " + "'" + login + "'"; //14
        sql += " and senha = " + "'" + senha + "'";
        try{ //15
            Statement st = conn.createStatement(); //16
            ResultSet rs = st.executeQuery(sql); //17
            if(rs.next()) { //18
                result = true;
                nome = rs.getString("nome");
            }
        }catch (Exception e) { } //19 e 20
        return result; } //21
} 