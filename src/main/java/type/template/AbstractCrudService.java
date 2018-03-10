package type.template;

public abstract class AbstractCrudService {

	public final void save() {
		if (beforeSave()) {
			saveEntity();
			afterSave();
		}
	}

	protected abstract boolean beforeSave();

	protected abstract void saveEntity();

	protected abstract void afterSave();
}
