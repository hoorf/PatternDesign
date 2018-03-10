package type.iterator.sample;

public class EntityPersistence<T> implements Persistence {

	public Template<T> jdbcTemplate() {
		return new JDBCTemplate<T>();
	}

	public Template<T> redisTemplate() {
		return new RedisTemplate<T>();
	}

	public Template<T> hbaseTemplate() {
		return new HbaseTemplate<T>();
	}

}
