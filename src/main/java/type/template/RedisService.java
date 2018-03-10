package type.template;

public class RedisService extends AbstractCrudService {

	@Override
	protected boolean beforeSave() {
		System.out.println("redis before save");
		return true;
	}

	@Override
	protected void saveEntity() {
		System.out.println("redis save");

	}

	@Override
	protected void afterSave() {
		System.out.println("redis after save");

	}

}
