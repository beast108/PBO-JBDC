/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanjutanKuis;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/**
 *
 * @author Wisnu
 */
public class LihatForm {
   public String email, username, password, namalengkap, tempat, tanggal, domisili, deskripsi;
    int jmlData;
    String data[][] = new String[500][4];
    
    Connector connector = new Connector();    
    
    //DEKLARASI KOMPONEN
    JFrame window = new JFrame("JDBC");
    JTable tabel;
    DefaultTableModel tableModel; //otomatis dibuat kalo buat JTable
    JScrollPane scrollPane;
    Object namaKolom[] = {"Email","Username","Password","Nama Lengkap","Tempat Lahir",
    "Tanggal Lahir","Domisili","Deskripsi"}; //membuat kolom dgn array tipe object;

    public LihatForm(){
        window.setLayout(null);
        window.setSize(550,600);
      //  window.setDefaultCloseOperation(3);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        try{
            int jmlData = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String query = "Select * from `formulir`"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                data[jmlData][0] = resultSet.getString("email"); 
                data[jmlData][1] = resultSet.getString("username"); 
                data[jmlData][2] = resultSet.getString("password");
                data[jmlData][3] = resultSet.getString("namalengkap");
                data[jmlData][4] = resultSet.getString("tempat"); 
                data[jmlData][5] = resultSet.getString("tanggal"); 
                data[jmlData][6] = resultSet.getString("domisili");
                data[jmlData][7] = resultSet.getString("deskripsi");
                jmlData++; 
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        
        tabel = new JTable(data,namaKolom); //tabel merupakan variabel untuk tabelnya dengan isi tablemodel
        scrollPane = new JScrollPane(tabel);
        window.add(scrollPane);
        
        scrollPane.setBounds(20, 35, 500, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        
    }
}

