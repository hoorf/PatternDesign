package type.template;

public class TempldateMain {

	public static void main(String[] args) {

		AbstractCrudService jdbc = new JdbcService();

		jdbc.save();

		AbstractCrudService redis = new RedisService();

		redis.save();
	}

}
