/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motherboardkuis.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import motherboadr.model.Motherboard;

public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
    public void addMotherboard(Motherboard mtb){
        String insertMtb = "INSERT INTO `motherboard`(`jenis`, `harga`, `tahunrilis`,`processor`,`brand`)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertMtb);
            stmtInsert.setString(1, mtb.getJenis());
            stmtInsert.setString(2, mtb.getHarga());
            stmtInsert.setString(3, mtb.getTahunrilis());
            stmtInsert.setString(4, mtb.getProcessor());
            stmtInsert.setString(5, mtb.getBrand());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
