package io.github.solucaologica.jdbc.jdbcdemoh2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import io.github.solucaologica.jdbc.jdbcdemoh2.entity.User;

@Repository
public class UserRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(User user) {
		String sql = new StringBuilder()
				.append("INSERT INTO TBUSR (")
				.append("	FIRST_NAME,")
				.append("	LAST_NAME,")
				.append("	ADDRESS)")
				.append(" VALUES ")
				.append("	(?, ?, ?)")
				.toString();
		
		jdbcTemplate.update(sql, new Object[] {
				user.getFirstName(),
				user.getLastName(),
				user.getAddress()
		});
		
	}
}
