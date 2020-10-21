package jdbc2;

import java.sql.Date;
import java.sql.ResultSet;

public class teste {

	public static void main(String[] args) {
		conexao con = new conexao();
		
		// 1 criando a visão
		
		//String sql = "CREATE VIEW nomefunc AS select nome from funcionario";
		
		//int res = con.executaSql(sql);
		
		//if (res > 0) {
		
		//System.out.println("visão criada");
	
			//} else {
		
		//System.out.println("error");
		
		//}
			
		//---------------------------------------------------------------------------------------
		
		// 2 deletando a visão ou atualizando
		
		
		//String sql = "DROP VIEW nomefunc"; 
		//String sql = "UPDATE nomefunc SET nome = 'Fernando' where nome = 'Diego'";
		
		//int res = con.executaSql(sql);
		
		//if (res > 0) {
		
		//System.out.println("visão apagada");
	
		//	} else {
		
		//System.out.println("error");
		
		//}
		
		//--------------------------------------------------------------------------------------------'
		
		
		// 3 executa a consulta
		
		
		
		//IN
		//String sql = "select * from funcionario where sexo in ('F') order by nome";    
		
		//null
		//String sql = "select * from funcionario where cpf_supervisor is null  order by nome";    
		
		//not null
		//String sql = "select * from funcionario where cpf_supervisor is not null  order by nome";    
		
		//exists
		//String sql = "select * from funcionario f where exists"
				//+ "(select * from dependente where f.cpf = cpf_funcionario and f.nome = nome and f.sexo = sexo) order by nome";   
		
		//not exists
		//String sql = "select * from funcionario f where not exists "
			//	+ "(select * from dependente where f.cpf = cpf_funcionario and f.nome = nome and f.sexo = sexo) order by nome";    
		
		//aninha com IN
		//String sql = "select * from funcionario f where "
			//	+ "f.id_departamento IN (select id from departamento where f.id_departamento = 1)";
		
		//ANY
		//String sql = "select nome, sobrenome, cpf, cpf_supervisor from funcionario where salario > ANY (select salario from funcionario)";
		
		
		// consulta visão
		String sql = "select * from nomefunc";
		
		ResultSet rs = con.excutaBusca(sql);
		
		try {
			while (rs.next()) {
				String nome = rs.getString("nome");
				String sobrenome = rs.getString("sobrenome");
				String cpf = rs.getString("cpf");
				String cpf_supervisor = rs.getString("cpf_supervisor");
				System.out.println("Nome : " + nome + " |  Sobrenome : " + sobrenome + " |  Cpf : " + cpf + " | Cpf Supervisor : " + cpf_supervisor);
			}
			
	} catch (Exception e) {
		e.printStackTrace();
		}
	
	}

}
