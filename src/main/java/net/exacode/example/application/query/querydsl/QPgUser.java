package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgUser is a Querydsl query type for QPgUser
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgUser extends com.mysema.query.sql.RelationalPathBase<QPgUser> {

    private static final long serialVersionUID = 693532070;

    public static final QPgUser pgUser = new QPgUser("pg_user");

    public final StringPath passwd = createString("passwd");

    public final BooleanPath usecatupd = createBoolean("usecatupd");

    public final SimplePath<Object[]> useconfig = createSimple("useconfig", Object[].class);

    public final BooleanPath usecreatedb = createBoolean("usecreatedb");

    public final StringPath usename = createString("usename");

    public final BooleanPath userepl = createBoolean("userepl");

    public final BooleanPath usesuper = createBoolean("usesuper");

    public final NumberPath<Long> usesysid = createNumber("usesysid", Long.class);

    public final SimplePath<Object> valuntil = createSimple("valuntil", Object.class);

    public QPgUser(String variable) {
        super(QPgUser.class, forVariable(variable), "pg_catalog", "pg_user");
    }

    @SuppressWarnings("all")
    public QPgUser(Path<? extends QPgUser> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_user");
    }

    public QPgUser(PathMetadata<?> metadata) {
        super(QPgUser.class, metadata, "pg_catalog", "pg_user");
    }

}

