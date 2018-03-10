package type.iterator.sample;

public interface Persistence {

	<T> Template<T> jdbcTemplate();

	<T> Template<T> redisTemplate();

	<T> Template<T> hbaseTemplate();
}
