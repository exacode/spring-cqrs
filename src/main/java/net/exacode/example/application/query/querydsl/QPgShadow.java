package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgShadow is a Querydsl query type for QPgShadow
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgShadow extends com.mysema.query.sql.RelationalPathBase<QPgShadow> {

    private static final long serialVersionUID = 696842299;

    public static final QPgShadow pgShadow = new QPgShadow("pg_shadow");

    public final StringPath passwd = createString("passwd");

    public final BooleanPath usecatupd = createBoolean("usecatupd");

    public final SimplePath<Object[]> useconfig = createSimple("useconfig", Object[].class);

    public final BooleanPath usecreatedb = createBoolean("usecreatedb");

    public final StringPath usename = createString("usename");

    public final BooleanPath userepl = createBoolean("userepl");

    public final BooleanPath usesuper = createBoolean("usesuper");

    public final NumberPath<Long> usesysid = createNumber("usesysid", Long.class);

    public final SimplePath<Object> valuntil = createSimple("valuntil", Object.class);

    public QPgShadow(String variable) {
        super(QPgShadow.class, forVariable(variable), "pg_catalog", "pg_shadow");
    }

    @SuppressWarnings("all")
    public QPgShadow(Path<? extends QPgShadow> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_shadow");
    }

    public QPgShadow(PathMetadata<?> metadata) {
        super(QPgShadow.class, metadata, "pg_catalog", "pg_shadow");
    }

}

