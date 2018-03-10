package type.template;

public class JdbcService extends AbstractCrudService {

	@Override
	protected boolean beforeSave() {
		System.out.println("JDBC before save");
		return true;
	}

	@Override
	protected void saveEntity() {
		System.out.println("JDBC save");

	}

	@Override
	protected void afterSave() {
		System.out.println("JDBC after save");

	}

}
