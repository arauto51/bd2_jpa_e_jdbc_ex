package jdbc2;

public class delete_or_update {

	public static void main(String[] args) {
		conexao con = new conexao();
		
		// 2 deletando a visão ou atualizando
		
		
				//String sql = "DROP VIEW nomefunc"; 
				String sql = "UPDATE nomefunc SET nome = 'Diego' where nome = 'Fernando'";
				int res = con.executaSql(sql);
				
				if (res >= 0) {
				
				System.out.println("visão apagada ou atualizada");
			
					} else {
				
				System.out.println("error");
				
				}

	}

}
