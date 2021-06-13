/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanjutanKuis;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Wisnu
 */
public class InputForm {
     public String email, username, password, namalengkap, tempat, tanggal, domisili, deskripsi;
    
    Connector connector = new Connector();    
    
    //DEKLARASI KOMPONEN
    JFrame window = new JFrame("JDBC");
   
    JLabel lEmail = new JLabel("Email  ");
        JTextField tfEmail = new JTextField();
    JLabel lUsername = new JLabel("Username  ");
        JTextField tfUsername = new JTextField();
    JLabel lPassword= new JLabel("Password ");
        JTextField tfPassword = new JTextField();
    JLabel lNamaLengkap = new JLabel("Nama Lengkap ");
        JTextField tfNamaLengkap = new JTextField();
    JLabel lTempatLahir = new JLabel("Tempat Lahir ");
        JTextField tfTempatLahir = new JTextField();
    JLabel lTanggalLahir = new JLabel("Tanggal Lahir ");
        JTextField tfTanggalLahir = new JTextField();
    JLabel lDomisili = new JLabel("Domisili ");
        JTextField tfDomisili = new JTextField();
    JLabel lDeskripsi = new JLabel("Deskripsi ");
        JTextField tfDeskripsi = new JTextField();
        
    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnLihat = new JButton("Lihat");
    
    public InputForm() {
        window.setLayout(null);
        window.setSize(550,300);
      //  window.setDefaultCloseOperation(3);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);


       // setDefaultCloseOperation(EXIT_ON_CLOSE);

//ADD COMPONENT
        window.add(lEmail);
        window.add(tfEmail);
        window.add(lUsername);
        window.add(tfUsername);
        window.add(lPassword);
        window.add(tfPassword);
        window.add(lNamaLengkap);
        window.add(tfNamaLengkap);
        window.add(lTempatLahir);
        window.add(tfTempatLahir);
        window.add(lTanggalLahir);
        window.add(tfTanggalLahir);
        window.add(lDomisili);
        window.add(tfDomisili);
        window.add(lDeskripsi);
        window.add(tfDeskripsi);
        window.add(btnTambahPanel);
        window.add(btnLihat);



//LABEL
        lEmail.setBounds(5, 35, 120, 20);
        lUsername.setBounds(5, 60, 120, 20);
        lPassword.setBounds(5,85,120,20);
        lNamaLengkap.setBounds(5,110,120,20);
        lTempatLahir.setBounds(5, 135, 120, 20);
        lTanggalLahir.setBounds(5, 160, 120, 20);
        lDomisili.setBounds(5,185,120,20);
        lDeskripsi.setBounds(5,210,120,20);

//TEXTFIELD
        tfEmail.setBounds(110, 35, 120, 20);
        tfUsername.setBounds(110, 60, 120, 20);
        tfPassword.setBounds(110, 85, 120, 20);
        tfNamaLengkap.setBounds(110, 110, 120, 20);
        tfTempatLahir.setBounds(110, 135, 120, 20);
        tfTanggalLahir.setBounds(110, 160, 120, 20);
        tfDomisili.setBounds(110, 185, 120, 20);
        tfDeskripsi.setBounds(110, 210, 120, 20);


//BUTTON PANEL
        btnTambahPanel.setBounds(250, 35, 90, 20);
        btnLihat.setBounds(250,60,90,20);
        
         btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                   try {
            String query = "INSERT INTO `formulir`(`email`, `username`,`password`,"
                    + "`namalengkap`,`tempat`,`tanggal`,`domisili`,`domisili`,`deskripsi`) "
                    + "VALUES ('"+getEmail()+"','"+getUsername()+"','"+getPassword()+"',"
                    + "'"+getNamaLengkap()+"','"+getTempatLahir()+"','"+getTanggalLahir()+"','"+getDomisili()+"','"+getDeskripsi()+"')";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Insert Berhasil");
            JOptionPane.showMessageDialog(null,"Insert Berhasil !!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
            }
        });
         btnLihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                LihatForm lihat = new LihatForm();
            }
        });
    }
    public String getEmail(){
        return tfEmail.getText();
    }

    public String getUsername() {
        return tfUsername.getText();
    }

    public String getPassword() {
        return tfPassword.getText();
    }

    public String getNamaLengkap() {
        return tfNamaLengkap.getText();
    }
    public String getTempatLahir(){
        return tfTempatLahir.getText();
    }

    public String getTanggalLahir() {
        return tfTanggalLahir.getText();
    }

    public String getDomisili() {
        return tfDomisili.getText();
    }

    public String getDeskripsi() {
        return tfDeskripsi.getText();
    }
    public void inputDB(){
        
    }
}
