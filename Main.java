import java.sql.*; // it has all connection related drivers and driver manager

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        String url= "jdbc:mysql://127.0.0.1:3306/JDBC";
        String username = "root";
        String password = "Kash@17022005";


        String query = "insert into employee (ID,name,job_title,salary) values \n" + //
                        "(3,\"Anjul\",\"Bse\",100000);";

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


            int rowsaffected = stmt.executeUpdate(query);
            if(rowsaffected>0){
                System.out.println("Insertion completed "+rowsaffected + " rows affected");
            }else{
                System.out.println("Insertion failed");
            }

                // To display data 
           /*  ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                Double salary = rs.getDouble("salary");
            System.out.println(id);
            System.out.println(name);
            System.out.println(job_title);
            System.out.println(salary);
            } */

            

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}