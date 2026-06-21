import java.sql.*;

public class BillDAO {

    public static boolean addBill(
            String customerName,
            String customerPhone,
            double total_amount) {

        String sql =
                "INSERT INTO bills(customer_name, customer_phone, total_amount) VALUES(?,?,?)";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, customerName);
            ps.setString(2, customerPhone);
            ps.setDouble(3, total_amount);

            int rows = ps.executeUpdate();

            System.out.println("Rows inserted = " + rows);

            con.close();

            return rows > 0;

        } catch(Exception e) {

            System.out.println("===== BILL SAVE ERROR =====");
            e.printStackTrace();

            return false;
        }
    }
}