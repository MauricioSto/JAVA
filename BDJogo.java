
package JOGO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class BDJogo {
    static Connection c;
    
    public static void Connect(){
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String conexao="jdbc:sqlserver://localhost\\ESN201994033\\SQLEXPRESS:1433;databaseName=ShowDoMilhao";
        
        c = DriverManager.getConnection(conexao, "sa", "123456");
        // System.out.println("Deu certo!");
        
    }catch(Exception e){
       //System.out.println("Deu erro!");
               // e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Erro");
    }
      
    }
     public static ResultSet rsexecutar(String query)
    {
        // Declara a variável
        ResultSet rs=null;
        try{
        // Cria a variável que faz a requisição
            Statement sql = c.createStatement();
        // Faz a requisição no banco e guarda na ResultSet rs
        rs = sql.executeQuery(query);
        }catch(Exception e){e.printStackTrace();}
        return rs;
    }

    
  
    
    public static ResultSet retornar(String query){
        
        ResultSet rs = null;
        try{
        Statement sql = c.createStatement();
        rs = sql.executeQuery(query);
        return rs;
        
    }catch(Exception e){
        System.out.println("Deu erro!");
                e.printStackTrace();
    }
        return rs;
    }
      
    public static void preencherTabela(JTable tabela,String query){
        
        ResultSet rs = null;
        
        try{
            BDJogo.Connect();
            rs = BDJogo.retornar(query);
            //model
            DefaultTableModel dtm = new DefaultTableModel();
            tabela.setModel(dtm);
            //COLUNAS
            int qtcolunas = rs.getMetaData().getColumnCount();
                for (int i = 0; i < qtcolunas; i++) {
                    dtm.addColumn(rs.getMetaData().getColumnName(i+1));
            }
            //LINHAS
            String[] linha = new String[qtcolunas];
            while(rs.next()){
                for (int i = 0; i < qtcolunas; i++) {
                    linha[i] = rs.getString(i+1);
                }
                dtm.addRow(linha);
            }
            
        }catch(Exception e){
            System.out.println("Deu erro!");
            e.printStackTrace();
    }
        
        
    }

  
    public static void executar(String query){
        
        ResultSet rs = null;
        try{
        Statement sql = c.createStatement();
        sql.executeUpdate(query);
        
        }catch(Exception e){
            System.out.println("Deu erro!");
            e.printStackTrace();
    }
    }

    public static void disconnect(){
        try{
        c.close();
        System.out.println("Desconectou!");
        
    }catch(Exception e){
        System.out.println("Deu erro!");
                e.printStackTrace();
    }
    }
    
    public static void main(String[] args) {
        //Connect();
    }
}
