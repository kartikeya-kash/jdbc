import java.sql.*; // it has all connection related drivers and driver manager

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        String url= "jdbc:mysql://127.0.0.1:3306/JDBC";
        String username = "root";
        String password = "Kash@17022005";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("✅ Driver loaded successfully!!");
        }
        catch(ClassNotFoundException e){ 
            System.out.println(e.getMessage());
        }


        try{

            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("✅ Connection successfull");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}