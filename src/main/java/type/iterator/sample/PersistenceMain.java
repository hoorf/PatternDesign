package type.iterator.sample;

public class PersistenceMain {

	public static void main(String[] args) {
		Persistence p = new EntityPersistence<Log>();
		p.jdbcTemplate().save(new Log("sdfdsdf"));

	}

}
