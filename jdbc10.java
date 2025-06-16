import java.sql.*;

public class jdbc10{
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "system";
        String password = "123";
        Connection conn =null;

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database");
     
            //create table stuz
            Statement stmt1 = conn.createStatement();

            String createStuTable = "CREATE TABLE stuz("
                    + "stud_id VARCHAR(10) PRIMARY KEY,"
                    + "stud_name VARCHAR(255) NOT NULL,"
                    + "birth_date DATE NOT NULL,"
                    + "total_credits INT NOT NULL"
                    + ")";
            stmt1.executeUpdate(createStuTable);

            //insert data into stuz table
            String insertStuData1 = "INSERT INTO stuz(stud_id, stud_name, birth_date, total_credits) VALUES('s01', 'shelly mary', '05-AUG-04', 24)";
            stmt1.executeUpdate(insertStuData1);

            String insertStuData2 = "INSERT INTO stuz(stud_id, stud_name, birth_date, total_credits) VALUES('s02', 'lance park', '25-NOV-03', 4)";
            stmt1.executeUpdate(insertStuData2);

            String insertStuData3 = "INSERT INTO stuz(stud_id, stud_name, birth_date, total_credits) VALUES('s03', 'dion agriche', '01-JAN-01', 17)";
            stmt1.executeUpdate(insertStuData3);

            //Accept stud_id as input
            String stud_id = args[0];
            
            //Prepare and execute the SQL statement
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM stuz WHERE stud_id = ?");
            stmt.setString(1, stud_id);
            ResultSet rs = stmt.executeQuery();
            
            //Display student details
            if (rs.next()) {
                System.out.println("Student ID: " + rs.getString("stud_id"));
                System.out.println("Student Name: " + rs.getString("stud_name"));
                System.out.println("Birth Date: " + rs.getString("birth_date"));
                System.out.println("Total Credits: " + rs.getInt("total_credits"));
            } else {
                System.out.println("No student found with ID " + stud_id);
            }

        }
        catch (ClassNotFoundException ex) {
            System.out.println("Oracle JDBC driver not found");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("Could not connect to the database");
            ex.printStackTrace();
        } finally {
            //close the connection when done
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

