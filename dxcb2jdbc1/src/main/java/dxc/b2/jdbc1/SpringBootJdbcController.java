package dxc.b2.jdbc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpringBootJdbcController {
	@Autowired
	JdbcTemplate jdbc;

	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("INSERT INTO user(name,email) VALUES ('javatpoint','java@javatpoint.com')");
		return"Data inserted successfully";
	}

}
