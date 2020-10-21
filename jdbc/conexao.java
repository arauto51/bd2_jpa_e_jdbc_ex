package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexao {

	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	conexao () {
		
		url = "jdbc:postgresql://localhost:5432/postgres";
		usuario = "postgres";
		senha = "19961991";
		
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("conexao realizda com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
		
	public int executaSql(String sql) {
			
		try {
			Statement stm = con.createStatement();
			int res = stm.executeUpdate(sql);
			con.close();
			return res;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		
	}
	
	
	
	public ResultSet excutaBusca (String sql) {
			
			try {
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				con.close();
				return rs;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
			
		}
	
	
	
}
