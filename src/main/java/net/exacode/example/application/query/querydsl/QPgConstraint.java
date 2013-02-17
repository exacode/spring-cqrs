package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgConstraint is a Querydsl query type for QPgConstraint
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgConstraint extends com.mysema.query.sql.RelationalPathBase<QPgConstraint> {

    private static final long serialVersionUID = 19959672;

    public static final QPgConstraint pgConstraint = new QPgConstraint("pg_constraint");

    public final SimplePath<Object> conbin = createSimple("conbin", Object.class);

    public final BooleanPath condeferrable = createBoolean("condeferrable");

    public final BooleanPath condeferred = createBoolean("condeferred");

    public final SimplePath<Object[]> conexclop = createSimple("conexclop", Object[].class);

    public final StringPath confdeltype = createString("confdeltype");

    public final SimplePath<Object[]> conffeqop = createSimple("conffeqop", Object[].class);

    public final SimplePath<Object[]> confkey = createSimple("confkey", Object[].class);

    public final StringPath confmatchtype = createString("confmatchtype");

    public final NumberPath<Long> confrelid = createNumber("confrelid", Long.class);

    public final StringPath confupdtype = createString("confupdtype");

    public final NumberPath<Long> conindid = createNumber("conindid", Long.class);

    public final NumberPath<Integer> coninhcount = createNumber("coninhcount", Integer.class);

    public final BooleanPath conislocal = createBoolean("conislocal");

    public final SimplePath<Object[]> conkey = createSimple("conkey", Object[].class);

    public final StringPath conname = createString("conname");

    public final NumberPath<Long> connamespace = createNumber("connamespace", Long.class);

    public final SimplePath<Object[]> conpfeqop = createSimple("conpfeqop", Object[].class);

    public final SimplePath<Object[]> conppeqop = createSimple("conppeqop", Object[].class);

    public final NumberPath<Long> conrelid = createNumber("conrelid", Long.class);

    public final StringPath consrc = createString("consrc");

    public final StringPath contype = createString("contype");

    public final NumberPath<Long> contypid = createNumber("contypid", Long.class);

    public final BooleanPath convalidated = createBoolean("convalidated");

    public QPgConstraint(String variable) {
        super(QPgConstraint.class, forVariable(variable), "pg_catalog", "pg_constraint");
    }

    @SuppressWarnings("all")
    public QPgConstraint(Path<? extends QPgConstraint> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_constraint");
    }

    public QPgConstraint(PathMetadata<?> metadata) {
        super(QPgConstraint.class, metadata, "pg_catalog", "pg_constraint");
    }

}

