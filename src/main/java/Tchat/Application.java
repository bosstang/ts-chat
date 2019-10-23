
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication()
@EnableTransactionManagement
@ComponentScan(basePackages = {"Tchat"})
@MapperScan(basePackages = {"Tchat.mapper"})
public class Application  {
	public static void main(String[] args) {
SpringApplication.run(Application.class, args);
		System.out.println("Spring Boot");
	}

}
