package jdbc2;

public class Criar_vis�o {

	public static void main(String[] args) {
		conexao con = new conexao();
		
		// 1 criando a vis�o
		
				String sql = "CREATE VIEW nomefunc AS select nome, sobrenome, cpf, cpf_supervisor from funcionario";
				
				int res = con.executaSql(sql);
				
				if (res >= 0) {
				
				System.out.println("vis�o criada");
			
					
				
				}

	}

}
