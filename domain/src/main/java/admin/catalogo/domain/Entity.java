package admin.catalogo.domain;

import java.util.Objects;

public abstract class Entity <ID extends Identifier>{

    protected final ID id;

    public Entity(final ID id) {
        Objects.requireNonNull(id,"'id' should not be null");
        this.id = id;
    }

    public ID getId(){
        return id;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final Entity<?> entity = (Entity<?>) o;
        return Objects.equals(getId(), entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}

