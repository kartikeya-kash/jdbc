import java.sql.*; // it has all connection related drivers and driver manager

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        String url= "jdbc:mysql://127.0.0.1:3306/JDBC";
        String username = "root";
        String password = "Kash@17022005";


        String query = "Insert into employee(ID,name,job_title,salary) values (?,?,?,?); ";

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
            // Statement stmt = con.createStatement();

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,423);
            ps.setString(2, "hemant");
            ps.setString(3, "asdf");
            ps.setDouble(4, 234.34);


            
       int rowsaffected =  ps.executeUpdate();
       System.out.println(rowsaffected);

            /*  int rowsaffected = stmt.executeUpdate(query);
            if(rowsaffected>0){
                System.out.println("Updation completed "+rowsaffected + " rows affected");
            }else{
                System.out.println("Updation failed");
            } */

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