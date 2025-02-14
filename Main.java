import java.sql.*; // it has all connection related drivers and driver manager

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        String url= "jdbc:mysql://127.0.0.1:3306/JDBC";
        String username = "root";
        String password = "Kash@17022005";


        String query = "select * from employee where ID = 1 ;";

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
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                Double salary = rs.getDouble("salary");
            System.out.println(id);
            System.out.println(name);
            System.out.println(job_title);
            System.out.println(salary);
            }

            

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}